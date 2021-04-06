package HomeWork20;

public class Tunnel extends Stage {
    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            try {
                Main.setInfo(c.getName() + " готовится к этапу(ждет): " + description);
                Main.setInfo(c.getName() + " начал этап: " + description);
//                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
//                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                Main.setInfo(c.getName() + " закончил этап: " + description);
//                System.out.println(c.getName() + " закончил этап: " + description);
            }
        } catch (Exception e) {
            Main.setWarning("В тоннеле что-то пошло не так");
//            e.printStackTrace();
        }
    }
}