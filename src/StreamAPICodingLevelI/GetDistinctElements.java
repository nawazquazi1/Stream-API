package StreamAPICodingLevelI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetDistinctElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 32, -1, 0, 54, 2, 1234, 423, 2412, 412, 364, 3521, 1, 4, 124, -342523);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctNumbers);

    }
}
