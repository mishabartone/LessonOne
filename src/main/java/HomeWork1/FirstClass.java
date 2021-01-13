package HomeWork1;

public class FirstClass {
    public static void main(String[] args) {
        byte b = 0;                 // 8 бит -128 .. 127
        short s = 0;                // 16 бит -32768 .. 32767
        int i = 0;                  // 32 бит
        long l = 0l;                // 64 бит

        float f = 0.0f;             // 32 бит 0.0F
        double d = 0.0d;            // 64 бит 0.0

        char ch = 'Q';              // 16 бит

        boolean bool = true;        //false

        String name = "Misha";

        float result = myMethod();
        System.out.println(result);

        boolean tenToTwenty = itsTenToTwenty(7, 2);
        System.out.println("Its more 10 and less 20? " + tenToTwenty);

        itsPositiveNum(i);
        itsNegativeNum(i);

        helloName(name);

        itsLeapYear(2020);

    }

    public static boolean itsTenToTwenty(int firstNum, int secNum){
        return ((firstNum + secNum) <= 20 && (firstNum + secNum) >= 10) ? true : false;
    }

    public static void itsPositiveNum(int num){
        System.out.println((num >= 0) ? "It's positive number" : "It's negative number");
    }

    public static void itsNegativeNum(int num){
        System.out.println(num < 0);
    }

    public static float myMethod(){
        float a = 0.1f;
        float b = 1.1f;
        float c = 2.1f;
        float d = 3.1f;
        return a * (b + (c / d));
    }

    public static void helloName(String name){
        System.out.println("Hello " + name);
    }

    public static void itsLeapYear(int year){

        boolean leapYear = false;

        if (year%400==0){
            leapYear = true;
        } else if((year%4==0) && (!(year%100==0))){
            leapYear = true;
        }

        System.out.println(leapYear ? "It's a leap year!" : "It's not a leap year");

    }
}
