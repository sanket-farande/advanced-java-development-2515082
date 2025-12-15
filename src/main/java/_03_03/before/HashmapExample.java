package _03_03.before;

import java.util.HashMap;

public class HashmapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);

        // update value for existing key
        map.put("apple", 3);

        // set default 1 if not present, and increment by 1 if present
        map.merge("apple",1,Integer::sum);
        System.out.println(map.get("apple"));

        map.merge("banana",1,Integer::sum);
        System.out.println(map.get("banana"));
    }




}
