package StreamAPICodingLevelI;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {
    public static void main(String[] args) {
//        Problem: Given a list of integers, return a list containing only even numbers.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evens = numbers.stream().
                filter(n -> n % 2 == 0).
                toList();

        System.out.println(evens);

    }
}
