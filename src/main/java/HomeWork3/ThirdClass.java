package HomeWork3;

import java.util.Random;
import java.util.Scanner;

public class ThirdClass {
    public static void main(String[] args) {

        // 1
        Scanner sc = new Scanner(System.in);

        boolean tryAgain = true;

        while (tryAgain){
            Random rd = new Random(); // число от 0 до n-1
            int needNum = rd.nextInt(10); // от 0 до 9 включительно

            for (int i = 0; i < 3; i++) {
                System.out.println("Please enter number");
                if (sc.hasNextInt()) {
                    int number = sc.nextInt();
                    if (number > needNum) {
                        System.out.println("Number is smaller");
                    } else if (number < needNum) {
                        System.out.println("Number is bigger");
                    } else {
                        System.out.println("Correct!");
                        break;
                    }
                }
            }

            System.out.println("Wanna try again?  1 – yes, 0 – no");
            if (sc.hasNextInt()){
                if (sc.nextInt() == 0) {
                    tryAgain = false;
                }
            }
        }


        // 2
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rd = new Random(); // число от 0 до n-1
        int index = rd.nextInt(26); // от 0 до 26 включительно

        String help = "###############";
        String theWord = words[index];

        while (true){
            System.out.println("Please enter the word");
            String myWord = sc.nextLine();

            if (!myWord.equals(theWord)) {
                for(int i = 0; i < theWord.length() - 1; i++){
                    if (myWord.length() > i){
                        char curW = theWord.charAt(i);
                        char curM = myWord.charAt(i);
                        if (curW == curM){
                            help = changeCharInPosition(i, curM, help);
                        }
                    }
                }
                System.out.println("Nope, here's your help-word: " + help);
            } else {
                System.out.println("Correct!");
                break;
            }
        }

    }

    public static String changeCharInPosition(int position, char ch, String str){
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }
}
