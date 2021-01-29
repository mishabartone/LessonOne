package HomeWork6;

public class Dog extends Animal {

    static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int length) {
        if (length > 500){
            System.out.println("Its too much for " + this.name);
        } else {
            System.out.println("" + this.name + " пробежал " + length + "м.");
        }
    }

    @Override
    public void swim(int length) {
        if (length > 10){
            System.out.println("Its too much for " + this.name);
        } else {
            System.out.println("" + this.name + " проплыл " + length + "м.");
        }
    }
}
