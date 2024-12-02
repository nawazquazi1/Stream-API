package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsWithItsCount {

    public static void main(String[] args){
    List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
    Map<String,Long> namesCount = names
            .stream()
            .filter(x-> Collections.frequency(names, x)>1)
            .collect(Collectors.groupingBy
                    (Function.identity(), Collectors.counting()));
 System.out.println(namesCount);

 /*or you can also try using */
    Map<String, Long> namesCount2 = names.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
}
}
}
