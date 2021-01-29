package HomeWork6;

public class Cat extends Animal {

    static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int length) {
        if (length > 200){
            System.out.println("Its too much for " + this.name);
        } else {
            System.out.println("" + this.name + " пробежал " + length + "м.");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("" + this.name + " cant swim!");
    }

}
