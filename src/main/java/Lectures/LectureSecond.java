package Lectures;

public class LectureSecond {

    public static void main(String[] args) {

        //Case + if/else
//        int a = 2;
//        switch (a) {
//            case 1:
//                System.out.println("a = 1");
//                break;
//            case 2:
//                System.out.println("a = 2");
//                break;
//            case 3:
//                System.out.println("a = 3");
//                break;
//            default:
//                System.out.println("a = 4");
//        }

//        for (int i = 0; i < 5 ; i++) {
//            System.out.println(i);
//        }

//        int a = 5;
//
//        while (a == 5) {
//            break;
//        }

//        do {
//            System.out.println("hi");
//        } while (a == 4);

//        int a;
//        for (int i = 5; i < 0; i--) {
//            a = 1;
//            i = a;
//            for (int j = 0; j < 5; j++){
//                a = j;
//                i = j;
//            }
//        }

//        if (true) {
//            int b;
//        } else if (b)

        //Arrays
//        String[] array = new String[5];
//        char[] array = new char[5];
//        int[] arrayInt = new int[5];
//        long[] arr = new long[Integer.MAX_VALUE + 1];
//        array[0] = "FirstElement";

//        for (int i = 0; i < array.length; i++) {
//            array[i] = (char) (65 + i);
//            System.out.println(array[i]);
//        }
//
//        char[] arr = {'a', 'b', 'c'}; //быстрая инициализация
//        arr[0] = 'd';


//        char[][] doubleArr1 = new char[5][];
//        doubleArr1[0] = new char[5];
//        doubleArr1[1] = new char[2];
//        doubleArr1[2] = new char[3];
//        doubleArr1[3] = new char[1];
//        doubleArr1[4] = new char[24];

        char[][] mas = new char[5][5];

        int a = 64;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                a++;
                mas[i][j] = (char)a;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
