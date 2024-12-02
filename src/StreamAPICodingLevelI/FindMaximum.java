package StreamAPICodingLevelI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaximum {
//    Problem: Find the maximum value in a list of integers.

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);

    }
}

