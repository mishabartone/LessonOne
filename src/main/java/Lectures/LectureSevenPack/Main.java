package Lectures.LectureSevenPack;

public class Main {
    public static void main(String[] args) {
        String str = new String("A");
        String a = "A";
        String b = "A";

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == str);
        System.out.println(a.equals(str));
    }
}
