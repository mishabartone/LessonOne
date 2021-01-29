package Lectures.LectureSixPack;

public class Animal {

    public String name;
    public Integer age;

    public Animal(){}

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Animal eat");
    }

    public void sleep(){
        System.out.println("Animal sleep");
    }

    public boolean isHungry(int a){

        if (a > 0){
            return false;
        }

        return true;
    }
}
