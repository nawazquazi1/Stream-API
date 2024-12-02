package StreamAPICodingLevel2;

import java.util.*;
import java.util.stream.*;

public class DuplicateElements {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> set = new HashSet<>();
        myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);

        getDataWithoutDuplicates();
    }

    // Or you can also try using distinct() keyword
    public static void getDataWithoutDuplicatese() {
        List<Integer> myList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266,
                666, 656);
        myList.stream().distinct().forEach(System.out::println);
    }

    public static void getDataWithoutDuplicates() {
        List<Integer> myList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266,
                666, 656);
        Set<Integer> set = new HashSet<>(myList);

        // Convert the set back to a list if needed
        List<Integer> uniqueData = set.stream().toList();

        // Print the unique elements
        uniqueData.forEach(System.out::println);
    }

}
