package ClassPack;

// OOP

public class LectureFive {

    private int a = 5;      // only this class
    protected int b = 5;    // only this package and extends classes
    int c = 5;              // only this package
    public int d = 5;       // everywhere

    public static void main(String[] args) {
        Cat a = new Cat("Vova", 76);
        a.printCatInfo();
    }

}
