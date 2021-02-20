package HomeWork11;

import java.util.*;

public class PhoneCataloque {

    private Map<String, String> cataloque = new HashMap<>();

    public Map<String, String> getCataloque() {
        return cataloque;
    }

    public void add(String phoneNum, String surname){
        cataloque.put(phoneNum, surname);
    }

    public List<String> get(String surname){

        List<String> phoneList = new ArrayList<>();
        Set<Map.Entry<String, String>> entrySet = cataloque.entrySet();

        for (Map.Entry<String, String> pair : entrySet) {
            if (surname.equals(pair.getValue())) {
                phoneList.add(pair.getKey()); // нашли наше значение и возвращаем  ключ
            }
        }

        return phoneList;
    }

}
