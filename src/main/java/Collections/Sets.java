package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(9);
        set.add(2);

        System.out.println(set);
        System.out.println(set.contains(4));
        System.out.println(Arrays.toString(set.toArray()));
    }
}
