package _03_04.before;

import java.util.LinkedHashMap;

public class LinkedHashmapExample {

    public static void main(String[] args) {
        // Implementation wise it is DLL with a HashMap, but method wise it is similar to HashMap
        LinkedHashMap<String, Integer> basket = new LinkedHashMap<>(10, 0.75f, true);

        // Preserves insertion order unlike HashMap
        basket.put("apple", 2);
        basket.put("orange", 1);
        basket.put("banana", 3);

        basket.forEach((key, value) -> System.out.println(key + ": " + value));
        basket.get("orange"); // Access to change order, LRU at start

        basket.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
