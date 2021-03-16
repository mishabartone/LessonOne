package HomeWork17;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 1
        String[] stringArr = {"hey", "hi", "hello"};
        String[] newStringArr = changePlace(stringArr, "hi", "hello");
        for (String s: newStringArr) {
            System.out.println(s);
        }

        System.out.println();

        // 2
        ArrayList<String> stringList = arrayIntoList(stringArr);
        for (String s : stringList) {
            System.out.println(s);
        }

        System.out.println();

        // 3
        

    }

    static String[] changePlace(String[] stringArr, String firstEl, String secondEl) {

        int posOne = -1;
        int posTwo = -1;

        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].equals(firstEl)){
                posOne = i;
            }
            if (stringArr[i].equals(secondEl)){
                posTwo = i;
            }
        }

        if (!(posOne == -1) && !(posTwo == -1)){
            stringArr[posOne] = secondEl;
            stringArr[posTwo] = firstEl;
        } else {
            System.out.println("Some elements has not found");
        }

        return stringArr;
    }

    static ArrayList<String> arrayIntoList(String[] stringArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : stringArr) {
            arrayList.add(s);
        }
        return arrayList;
    }

}
