package java_codes;

import java.util.*;

public class Cod {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(freqMap.entrySet());

        int[] result = new int[k];
        int i = 0;
        while (i < k) {
            result[i++] = maxHeap.poll().getKey();
        }
        System.out.println(Arrays.toString(result));
    }
}
