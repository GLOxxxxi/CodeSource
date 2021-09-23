package leetcode;

import java.util.Arrays;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
 * 返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */

public class LeetCode1 {

    public int removeDuplicates(int[] nums) {
        // 存储数组中第二个值的下标
        int temp = 1;
        for (int i = 1; i < nums.length; i++) {
            if ( nums[i] != nums[i - 1]) {
                // 替代重复的值
                nums[temp++] = nums[i];
            }
        }
        System.out.println("长度：" + temp);
        // 将新数组赋值
        int newNums[] = new int[temp];
        for (int i = 0; i < temp; i++) {
            newNums[i] = nums[i];
        }
        System.out.println("新数组：" + Arrays.toString(newNums));
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4};
        LeetCode1 lc = new LeetCode1();
        lc.removeDuplicates(nums);
    }
}
