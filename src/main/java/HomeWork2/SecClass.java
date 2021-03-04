package HomeWork2;

public class SecClass {

    public static void main(String[] args) {

        // 1
        int[] arrayOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == 0){
                arrayOne[i] = 1;
            } else if (arrayOne[i] == 1){
                arrayOne[i] = 0;
            }
        }

        // 2
        int[] arrayTwo = {0, 3, 6, 9, 12, 15, 18, 21};
        for (int i = 0; i < arrayTwo.length; i++) {
            if(i == 0){
                arrayTwo[i] = 0;
            } else if (i == 1){
                arrayTwo[i] = 3;
            } else if (i == 2){
                arrayTwo[i] = 6;
            } else if (i == 3){
                arrayTwo[i] = 9;
            } else if (i == 4){
                arrayTwo[i] = 12;
            } else if (i == 5){
                arrayTwo[i] = 15;
            } else if (i == 6){
                arrayTwo[i] = 18;
            } else if (i == 7){
                arrayTwo[i] = 21;
            }
        }

        // 3
        int[] arrayThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arrayThree.length; i++) {
            if (arrayThree[i] < 6){
                arrayThree[i] *= 2;
            }
        }

        // 4
        int [][] doubleArr = new int[7][7];
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i][i] = 1;
            doubleArr[i][doubleArr[i].length-i-1] = 1;
        }

        // 5
        if (arrayThree.length > 0) {
            int min = arrayThree[0];
            int max = arrayThree[0];
            for (int i = 0; i < arrayThree.length; i++){
                if (arrayThree[i] < min) {
                    min = arrayThree[i];
                }
                if (arrayThree[i] > max) {
                    max = arrayThree[i];
                }
            }
        }

        // 6
        int[] arraySix = {1, 1, 1, 2, 1};
        boolean balance = checkBalance(arraySix);

        // 7 - не получилось
        int[] arraySeven = {1, 2, 3};
        int n = 1;
        changePosition(arraySeven, n);


    }

    static void changePosition(int[] mas, int number){

//        boolean isSorted = false;
//        int buf;
//
//        if (mas.length > 0){
//            mas[0] = mas.length-1;
//        }
//
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < mas.length-1; i++) {
//                if(mas[i] > mas[i+1]){
//                    isSorted = false;
//
//                    buf = mas[i];
//                    mas[i] = mas[i+1];
//                    mas[i+1] = buf;
//                }
//            }
//        }


//        int buf;
//
//        for (int i = 0; i < mas.length - 1; i++) {
//            buf = mas[i];
//            if (i == number - 1) {
//                mas[i] = mas[mas.length-number];
//            } else if (i == number) {
//
//            } else {
//                mas[i] = mas[i + 1];
//            }
//            mas[i + 1] = buf;
//        }
//
//
//        for (int i = 0; i < mas.length; i++){
//            System.out.println(mas[i]);
//        }

    }

    static boolean checkBalance(int[] array){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++){
            sum1 += array[i];
            for (int j = i+1; j < array.length; j++){
                sum2 += array[j];
                if (j == array.length - 1){
                    if (sum1 == sum2){
                        return true;
                    } else {
                        sum2 = 0;
                    }
                }
            }
        }
        return false;
    }
}
