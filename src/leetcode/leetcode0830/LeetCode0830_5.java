package leetcode.leetcode0830;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
 * 示例 1：
 *
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * 示例 2：
 *
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 * 示例 3：
 *
 * 输入：nums1 = [0,0], nums2 = [0,0]
 * 输出：0.00000
 * 示例 4：
 *
 * 输入：nums1 = [], nums2 = [1]
 * 输出：1.00000
 * 示例 5：
 *
 * 输入：nums1 = [2], nums2 = []
 * 输出：2.00000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class LeetCode0830_5 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double temp = 0.0; // 存储总位数的值
        int init = 1; // 记录第一个数组的长度以便于第二个数组添加到map
        // 创建map把所有数组的添加进去
        Map<Integer, Integer> map = new HashMap<>();
        // 添加第一个数组
        for (int i = 0; i < nums1.length; i++) {
            map.put(i, nums1[i]);
            init++;
        }
        // 添加第二个数组，注意map的key值变化
        for (int i = init; i < nums2.length + init ; i++) {
            map.put(i - 1, nums2[i - init]);
        }
        // 创建新数组
        int[] newNums = new int[nums1.length + nums2.length];
        // 遍历map将其赋值到新数组
        for (Map.Entry entry :
                map.entrySet()) {
            newNums[(int) entry.getKey()] = (int) entry.getValue();
        }
        // 排序
        Arrays.sort(newNums);
        System.out.println(Arrays.toString(newNums));
        // 取中位数，先判断奇数偶数
        if (newNums.length % 2 == 0) {
            temp = (double)(newNums[newNums.length / 2] + newNums[newNums.length / 2 - 1]) / 2;
        } else {
            temp = newNums[newNums.length / 2];
        }
        System.out.println(map);
        return temp;

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        LeetCode0830_5 lc = new LeetCode0830_5();
        System.out.println(lc.findMedianSortedArrays(nums1, nums2));
    }
}
