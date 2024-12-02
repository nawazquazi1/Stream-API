package StreamAPICodingLevelI;

import java.util.Arrays;
import java.util.List;

public class CountElements {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 32, -1, 0, 54, 2, 1234, 423, 2412, 412, 364, 3521, 1, 4, 124, -342523);


        var counts = numbers.stream()
                .filter(n -> n >= 5)
                .count();

        System.out.println(counts);
    }
}
