package StreamAPICodingLevelI;

import java.util.Arrays;
import java.util.List;

public class ReducetToSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int total = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(total);
    }
}
