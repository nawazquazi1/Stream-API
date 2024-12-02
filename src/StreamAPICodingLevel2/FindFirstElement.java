package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement{
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);
        /* or can also try below single line code */
//        Arrays.stream(arr).boxed().findFirst().ifPresent(System.out::print);
    }
}