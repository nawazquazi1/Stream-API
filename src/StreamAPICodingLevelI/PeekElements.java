package StreamAPICodingLevelI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public  class PeekElements{

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, -5, 6);

        List<Integer> peekedAtNumbers = numbers.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(peekedAtNumbers);

    }
}