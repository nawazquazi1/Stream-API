package StreamAPICodingLevelI;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        var sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
