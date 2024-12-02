package StreamAPICodingLevelI;

import java.util.Arrays;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> sortList=names.stream()
                .sorted()
                .toList();

        System.out.println(sortList);

    }
}
