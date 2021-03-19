package HomeWork9;


public class Main {
    public static void main(String[] args) {

        Skills[] sportsmans = new Skills[3];
        Object[] tasks = new Object[2];

        sportsmans[0] = new Human("Sergey", 5, 1);
        sportsmans[1] = new Cat("Igor", 4, 3);
        sportsmans[2] = new Robot("Senya", 1, 7);

        tasks[0] = new Treadmill(3);
        tasks[1] = new Wall(3);

        for (int i = 0; i < sportsmans.length; i++) {
            for (int j = 0; j < tasks.length; j++) {
                if (tasks[j] instanceof Treadmill){
                    if (sportsmans[i].run((Treadmill)tasks[j])) {
                        System.out.println(sportsmans[i].getName() + " has run it!");
                    } else {
                        System.out.println(sportsmans[i].getName() + " has not run it!");
                        break;
                    }
                } else if (tasks[j] instanceof Wall) {
                    if (sportsmans[i].jump((Wall)tasks[j])) {
                        System.out.println(sportsmans[i].getName() + " has jump it!");
                    } else {
                        System.out.println(sportsmans[i].getName() + " has not jump it!");
                        break;
                    }
                }
            }
        }

    }
}
