package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code {
    public static void main(String[] args) {
        int n = 13;

    }
    public static void sortColors(int[] nums) {
        int zero = 0, one = 0, two = nums.length - 1;

        while (one <= two) {
            if (nums[one] == 0) {
                swap(nums, zero, one);
                one++;
                zero++;
            } else if (nums[one] == 1) {
                one++;
            } else {
                swap(nums, one, two);
                two--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}