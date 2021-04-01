package HomeWork6;

public class Animal {

    static int animalCount = 0;
    String name;

    public Animal(String name) {
        animalCount++;
        this.name = name;
    }

    public void run(int length){
        System.out.println("Animal run " + length);
    }

    public void swim(int length){
        System.out.println("Animal swim " + length);
    }

}
