package HomeWork6;

public class Main {

    public static void main(String[] args) {

        Dog muhtar = new Dog("Muhtar");
        Dog rex = new Dog("Rex");

        Cat barsik = new Cat("Barsik");
        Cat igor = new Cat("Igor");

        muhtar.run(500);
        muhtar.swim(100);

        rex.swim(1);
        rex.run(100);

        barsik.run(15);
        barsik.swim(15);

        igor.run(100);
        igor.swim(1);
        
    }

}
