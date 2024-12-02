package StreamAPICodingLevel2;

import java.util.*;
import java.util.stream.*;
public class FindTheTotalNumberOfElements{
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count = myList.size();
        System.out.println(count);
        /* or can also try below line code */
//        Arrays.stream(arr).boxed().count();
    }
}