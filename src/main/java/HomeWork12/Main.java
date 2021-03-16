package HomeWork12;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 2
        int needNum = 1;
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);

        Operation index = ()->{
            for (int i = 0; i < test.size(); i++) {
                if (test.get(i) == needNum){
                    return i;
                }
            }
            return -1;
        };
        System.out.println(index.calculate());

        // 3
        String myStr = "I love java";

        OperationStringList reverseList = () -> {
            char[] arrCh =  myStr.toCharArray();
            List<String> strList = new ArrayList<>();
            String result = "";
            for (int i = arrCh.length - 1; i >= 0; i--) {
                strList.add(String.valueOf(arrCh[i]));
            }
            return strList;
        };

        String result = "";
        for (String el : reverseList.needList()){
            result += el;
        }

        System.out.println(result);

        // 4
        Operation maximum = ()->{

            if (test.size() > 0){
                int max = test.get(0);
                for (int i = 1; i < test.size(); i++) {
                    if (test.get(i) > max){
                        max = test.get(i);
                    }
                }
                return max;
            }
            return 0; // либо бросаем какую-либо ошибку
        };

        System.out.println(maximum.calculate());

        // 5 через лямбда -
        Operation average = ()->{
            int sum = 0;
            for(int el : test){
                sum += el;
            }
            return sum / test.size();
        };

        System.out.println(average.calculate());

        // 6
        List<String> stringList = new ArrayList<>();
        stringList.add("hey");
        stringList.add("aga");
        stringList.add("ara");
        stringList.add("mey");
        stringList.add("arr");

        OperationStringList searchList = ()->{
            List<String> needList = new ArrayList<>();
            for(String el : stringList){
                if (el.length() == 3 && el.charAt(0) == 'a'){
                    needList.add(el);
                }
            }
            return needList;
        };

        for (String el : searchList.needList()){
            System.out.println(el);
        }

    }

}
