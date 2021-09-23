package leetcode.leetcode0831;

import java.util.Arrays;

/**
 *
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode0831_1 {
    /**
     * hashset或者原地交换
     * @param nums
     * @return
     */

    public int findRepeatNumber(int[] nums) {
        //HashSet求解
//        Set<Integer> set = new HashSet<>();
//        int temp = 0;
//        for (int num : nums) {
//            if (set.contains(num)) {
//                return num;
//            }
//            set.add(num);
//        }
//        return temp;
        int i = 0;
        while (i < nums.length) {
            // 判断每个元素是否在对应的下标上，在跳过，不在判断
            if (nums[i] == i) {
                i++;
                continue;
            }
            // 满足nums[nums[i]] == nums[i]条件的时候必定是出现了重复的元素
            if (nums[nums[i]] == nums[i]) {
                return nums[i];
            }
            // 没出现重复的时候先替换
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
            System.out.println(Arrays.toString(nums));
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 2, 0, 0, 1};
        LeetCode0831_1 lc = new LeetCode0831_1();
        System.out.println(lc.findRepeatNumber(nums));
    }
}
