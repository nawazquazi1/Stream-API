package StreamAPICodingLevelI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToSet {

    public static <Set> void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3,1,3,4,3,6, 4, -5, 6,1,2,3);

        Set uniqueNumbers = (Set) numbers.stream()
                .collect(Collectors.toSet());

        System.out.println(uniqueNumbers);

    }
}
