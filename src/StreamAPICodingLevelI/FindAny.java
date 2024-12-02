package StreamAPICodingLevelI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);


        Optional<Integer> anyElement = numbers.stream()
                .findAny();

        System.out.println(anyElement);
    }
}

