package _02_02.before;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {
        String[] words = { "apple", "banana", "pear" };
        List<String> wordsList = convertToList(words);
        Integer[] numbers = { 1, 5, 7 };
        List<Integer> numberList = convertToList(numbers);
        System.out.println(wordsList);
        System.out.println(numberList);

        Double[] doubles = { 1.3, 4.3, 2.0 };
        List<Double> doubleList = convertNumberToList(doubles);
        List<Integer> numberList2 = convertNumberToList(numbers);
        System.out.println(doubleList);
        System.out.println(numberList2);
    }

    // Generic method
    // T for Type. <T> Type declaration, List<T> Return type
    public static <T> List<T> convertToList(T[] array) {
        return Arrays.asList(array);
    }

    // Bounded Generic method: Allow only Numbers types
    // T for Type. <T> Type declaration, List<T> Return type
    public static <T extends Number> List<T> convertNumberToList(T[] array) {
        return Arrays.asList(array);
    }

}
