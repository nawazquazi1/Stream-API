package StreamAPICodingLevelI;

import java.util.Arrays;
import java.util.List;

public class ListOfNamesToUppercase {

    //    Problem: Convert all strings in a list to uppercase.
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> uppercase=names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(uppercase);
    }
}
