package leetcode.leetcode0828;

/**
 *给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。
 *
 * 请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 输入：nums = [3,6,1,0]
 * 输出：1
 * 解释：6 是最大的整数，对于数组中的其他整数，6 大于数组中其他元素的两倍。6 的下标是 1 ，所以返回 1
 */
public class LeetCode0828_4 {
    public int dominantIndex (int[] nums) {
        int max = 0; // 存储最大值
        int index =0; // 存放下标
        int temp = 0; // 用于存放临时数据
        for (int i = 0; i < nums.length; i++) {
            // 取最大值
            if (nums[i] > max) {
                temp = max;
                max =nums[i];
                index = i;
            } else if (nums[i] > temp) {
                // 比最大值小的第二最大值
                temp = nums[i];
            }
        }
        // 最后只用比较最大值是否大于第二大值的两倍即可
        return max >= (temp * 2) ? index : -1;
    }

    public static void main(String[] args) {
//        int[] nums = {3, 2, 1};
        int[] nums = {3, 6, 1, 0};
        LeetCode0828_4 lc = new LeetCode0828_4();
        System.out.println(     lc.dominantIndex(nums));
    }
}
