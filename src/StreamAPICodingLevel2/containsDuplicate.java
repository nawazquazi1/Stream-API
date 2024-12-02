package StreamAPICodingLevel2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class containsDuplicate {

    public static void main(String[] args) {
        System.out.println(duplicate(new int[]{1, 2, 3, 4, 1}));

    }


    public static boolean duplicate(int[] nums) {
        Set<Integer> setData = new HashSet<>();
        return Arrays.stream(nums)
                .anyMatch(num -> !setData.add(num));
    }

    public static boolean contains_Duplicate(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .toList();
        Set<Integer> set = new HashSet<>(list);
        return set.size() != list.size();
    }
}
