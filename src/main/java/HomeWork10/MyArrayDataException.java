package HomeWork10;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(String[][] arr, int i, int j){
        super("Array data Exception! Value " + arr[i][j] + " on the position " + i + " " + j +" can't be transformed into int");
    }

}
