package leetcode;

import java.util.Arrays;
/**
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 输入：nums = [3,2,2,3], val = 3
 * 输出：2, nums = [2,2]
 * 解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 你不需要考虑数组中超出新长度后面的元素。例如，函数返回的新长度为 2 ，而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
 */
public class LeetCode2 {
    public int removeElement(int[] nums, int val) {
        // 创建存储新数组长度的变量
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            // 和val作比较判断是否有相同的值
            if (val != nums[i]) {
                // 将相同的值替换掉
                nums[temp++] = nums[i];
            }
        }
        int[] newNums = new int[temp];
        for (int i = 0; i < temp; i++) {
            newNums[i] = nums[i];
        }
        System.out.println("长度:" + temp);
        System.out.println("新数组:" + Arrays.toString(newNums));
        return temp;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        LeetCode2 lc = new LeetCode2();
        lc.removeElement(nums, val);
    }
}
