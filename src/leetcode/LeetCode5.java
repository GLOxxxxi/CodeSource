package leetcode;

/**
 *给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 输入：[3,2,3]
 * 输出：3
 *
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 */

public class LeetCode5 {
    public int majorityElement(int[] nums) {
        // 通过计数遇到相同的就++，不同就--，如果计数器==0那么就是num[i + 1]
        int count = 1; // 计数器
        int temp = nums[0];// 存储数组第一个数
        for (int i = 1; i < nums.length; i++) {
            if (temp == nums[i])
                count++;
            else {
                count--;
                if (count == 0) {
                    temp = nums[i + 1];
                }
            }
        }
        System.out.println(temp);
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int[] nums1 = {3, 2, 3};
        LeetCode5 lc = new LeetCode5();
        lc.majorityElement(nums);
        lc.majorityElement(nums1);
    }
}
