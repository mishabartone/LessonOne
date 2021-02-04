package HomeWork7;

import HomeWork7.Animals.Cat;
import HomeWork7.Stuff.Plate;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Vaska");
        cats[1] = new Cat("Igor");
        cats[2] = new Cat("Senya");
        cats[3] = new Cat("Timofey");
        cats[4] = new Cat("Weeknd");

        Plate plate = new Plate(40);

        for (int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
        }
    }
}
