package day2;

import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums); // Sort the array
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2}; // Sample input
        boolean result = hasDuplicate(nums);
        System.out.println("Contains duplicate? " + result);
    }
}

