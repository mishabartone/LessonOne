package HomeWork11;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] words = {"привет" , "пока", "кот", "пес", "сергей", "узкий", "пока", "зачем", "кто", "кот"};

        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words){
            if (!wordsMap.containsKey(word)){
                wordsMap.put(word, 1);
            } else {
                int curValue = wordsMap.get(word);
                wordsMap.put(word, ++curValue);
            }
        }

        for(Map.Entry<String, Integer> item : wordsMap.entrySet()){

            System.out.printf("Слово: %s Повторений: %d \n", item.getKey(), item.getValue());
        }

        PhoneCataloque pc = new PhoneCataloque();
        pc.add("911", "Police");
        pc.add("112", "Police");
        pc.add("02", "Police");
        pc.add("03", "Medicine");
        pc.add("01", "Firefighters");

        for (String num : pc.get("Police")){
            System.out.println(num);
        }

    }

}
