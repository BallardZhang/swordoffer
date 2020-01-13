package com.ballard;

/**
 * @ClassName Demo_01.java
 * @Description 数组中重复的数字
 * @Author Administrator
 * @Date 2020/1/7  16:33
 * @Version 2.0
 */
public class Demo_01 {

    public static boolean duplicate(int[] nums, int length, int[] duplication) {
        if (nums == null || length <= 0)
            return false;
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                swap(nums, i, nums[i]);
            }
        }
        return false;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int []nums ={2, 3, 1, 0, 2, 5};
        int []nums1 = new int[]{1};
        System.out.println(Demo_01.duplicate(nums,6,nums1));;
    }
}
