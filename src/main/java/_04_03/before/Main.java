package _04_03.before;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        // With lambdas
        numbers.forEach((number) -> NumberUtils.evenOrOdd(number));
        // With method reference
        numbers.forEach(NumberUtils::evenOrOdd);
    }

}
