package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> result = new HashSet<>(),
                retain = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        retain.addAll(set1);
        retain.retainAll(set2);
        result.removeAll(retain);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet(Arrays.asList(0, 1, 2));
        Set<Integer> set2 = new HashSet(Arrays.asList(1, 2, 3));
        Set<Integer> result = symmetricDifference(set1, set2);
        System.out.println(result);
    }
}
