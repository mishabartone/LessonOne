package Lectures;

import java.util.Random;
import java.util.Scanner;

public class LectureThree {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = 0;
//
//        if (sc.hasNextInt()){
//            a = sc.nextInt();
//        }
//
//        System.out.println(a);

//        int min = 5;
//        int max = 10;
//        int number = 0;
//
//        do {
//            System.out.println("Please enter number");
//            if (sc.hasNextInt()){
//                number = sc.nextInt();
//            }
//        } while (number >= min || number <= max);
//
//        sc.close();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.nextLine()); // ДВА РАЗА СКАННЕР НЕ ОТКРЫТЬ ЗА ОДИН ЖИЗНЕННЫЙ ЦИКЛ

        Random rd = new Random(); // число от 0 до n-1
//        rd.nextInt(7); // от 0 до 6 включительно
//        rd.nextDouble();

//        int[] arr = {9, 7, 8, 4, 6};
//        Random rd = new Random();
//        int index = rd.nextInt(5);
//        int index2 = rd.nextInt(5);
//        int tmp;
//        tmp = arr[index];
//        int tmp2 = arr[index2];
//        int tmp3 = tmp;
//        tmp = tmp2;
//        tmp2 = tmp3;
//
////        while (true) {
////            if(arr.equals())
////        }
//
//        System.out.println(tmp);

        int[] noSortedArray = new int[40];
        for (int i = 0; i < noSortedArray.length; i++) {
            noSortedArray[i] = rd.nextInt(100);
        }

        boolean sorted = false;
        int tmp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < noSortedArray.length - 1; i++) {
                if (noSortedArray[i] > noSortedArray[i+1]){
                    tmp = noSortedArray[i];
                    noSortedArray[i] = noSortedArray[i+1];
                    noSortedArray[i+1] = tmp;
                    sorted = false;
                }
            }
        }

        for (int a: noSortedArray) {
            System.out.println(a);
        }

    }
}
