package HomeWork21.Race;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

import static HomeWork21.Race.Main.setInfo;
import static HomeWork21.Race.Main.setWarning;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    private CyclicBarrier cbStart;
    private CountDownLatch cdl;
    private boolean isWinner;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed, CyclicBarrier cbStart, CountDownLatch cdl) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.cbStart = cbStart;
        this.cdl = cdl;
        this.isWinner = false;
    }
    @Override
    public void run() {
        try {
            setInfo(this.name + " готовится");
//            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            setInfo(this.name + " готов");
//            System.out.println(this.name + " готов");
            cbStart.await();
        } catch (Exception e) {
            setWarning(this.name + " не смог подготовиться");
//            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
            if ((i == race.getStages().size() - 1) && (!HaveAWinner.isWeHaveAWinner())){
                setInfo(this.name + " - WIN!!!");
//                System.out.println(this.name + " - WIN!!!");
                HaveAWinner.setWeHaveAWinner(true);
            }
            cdl.countDown();
        }
    }
}
