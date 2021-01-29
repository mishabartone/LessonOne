package Lectures.ClassPack;

public class Cat {

    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printCatInfo() {
        System.out.println("My cat name " + name);
    }
}
