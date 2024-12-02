package StreamAPICodingLevel2;
import java.util.*;
import java.util.stream.*;


public class EvenNumber{
    public static void main(String[] args) {
        //Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);

        /* or can also try below method */
//        Map<Boolean, List<Integer>> list = Arrays.stream(nums).boxed()
//                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
//        System.out.println(list);

    }
}