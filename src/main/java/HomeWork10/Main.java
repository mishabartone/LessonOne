package HomeWork10;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String [][] arr = {{"5", "7", "3", "17"}, {"7", "0", "1", "12"}, {"7", "0", "1", "12"}, {"7", "0", "1", "1"}};
        if (checkMyArray(arr)) {
            System.out.println("Массив преобразован корректно!");
        };

    }

    public static boolean checkMyArray(String[][] arr) throws MyArraySizeException, MyArrayDataException{

        itsFourFour(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int num = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(arr, i, j);
                }
            }
        }
        return true;
    }

    public static void itsFourFour(String[][] arr) throws MyArraySizeException {
        if(arr.length != 4 || arr[0].length != 4){
            throw new MyArraySizeException();
        }
    }
}