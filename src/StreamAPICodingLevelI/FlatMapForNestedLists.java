package StreamAPICodingLevelI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapForNestedLists {
    public static void main(String[] args) {
        List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2),
                Arrays.asList(3, 4, 5));
        List<Integer> flatList = nestedNumbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList);

    }
}
