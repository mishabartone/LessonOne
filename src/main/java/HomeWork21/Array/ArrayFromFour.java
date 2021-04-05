package HomeWork21.Array;

public class ArrayFromFour {

    public int[] ArrayFromFour(int[] originalArray){
        int pos4 = -1;

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == 4){
                pos4 = i;
            }
        }

        if (pos4 == -1){
            throw new RuntimeException();
        }

        int[] arrayFromFour = new int[originalArray.length - pos4 - 1];

        int j = 0;
        for (int i = ++pos4;i < originalArray.length; i++){
            arrayFromFour[j] = originalArray[i];
            j++;
        }

        return arrayFromFour;
    }

    public boolean ArrayOneAndFour(int[] originalArray){
        boolean hasOne = false;
        boolean hasFour = false;
        for (int el: originalArray) {
            if (el == 4){
                hasFour = true;
            } else if (el == 1){
                hasOne = true;
            } else {
                return false;
            }
        }

        return hasOne && hasFour;
    }

}
