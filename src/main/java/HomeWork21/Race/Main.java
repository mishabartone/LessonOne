package HomeWork21.Race;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static final int CARS_COUNT = 4;
    public static CyclicBarrier cbStart = new CyclicBarrier(CARS_COUNT, new RaceStart());
    public static CountDownLatch cdl = new CountDownLatch(CARS_COUNT * 3);

    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void setInfo(String msg)
    {
        log.info(msg);
    }

    public static void setWarning(String msg)
    {
        log.log(Level.WARNING, "Exception: ", msg);
    }

    public static void main(String[] args) {
        setInfo("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
//        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cbStart, cdl);
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
        try {
            cdl.await();
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        setInfo("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
//        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}

