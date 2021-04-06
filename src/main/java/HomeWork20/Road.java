package HomeWork21.Race;

public class Road extends Stage {
    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            Main.setInfo(c.getName() + " начал этап: " + description);
//            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
            Main.setInfo(c.getName() + " закончил этап: " + description);
//            System.out.println(c.getName() + " закончил этап: " + description);
        } catch (InterruptedException e) {
            Main.setWarning("На дороге " + description + " что-то пошло не так");
//            e.printStackTrace();
        }
    }
}
