package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachCharacterInString {

//    ite a program to print the count of each character in a String?
    public static void findCountOfChars(String s) {
        Map<String, Long> map = Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .collect(Collectors
                        .groupingBy(str -> str,
                                LinkedHashMap::new, Collectors.counting()));
// or you can also try using Function.identify() instead of LinkedHashMap
        Map<String, Long> mapObject = Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
//    Input: String s = "string data to count each character";
//    Output: {s=1, t=5, r=3, i=1, n=2, g=1, =5, d=1, a=5, o=2, c=4, u=1, e=2, h=2}
}
