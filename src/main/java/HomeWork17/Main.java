package HomeWork17;

public class TwoElsOfArray {

    public static void main(String[] args) {
        String[] stringArr = {"hey", "hi", "hello"};
        String[] newStringArr = changePlace(stringArr, "hi", "hello");
        for (String s: newStringArr) {
            System.out.println(s);
        }
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

}
