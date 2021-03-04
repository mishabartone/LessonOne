package HomeWork7.Animals;

import HomeWork7.Stuff.Plate;

public class Cat {

    String name;
    boolean satiety = false;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate){
        if (plate.tryToEat(15)){
            this.satiety = true;
        }
        System.out.println("Cat " + this.name + (this.satiety ? " is satiety" : " is hungry"));
    }
}
