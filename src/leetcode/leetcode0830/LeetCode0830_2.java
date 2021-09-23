package leetcode.leetcode0830;

import java.util.*;

/**
 * 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。你可以按 任意顺序 返回答案。
 *
 * 进阶：你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,1,3,2,5]
 * 输出：[3,5]
 * 解释：[5, 3] 也是有效的答案。
 * 示例 2：
 *
 * 输入：nums = [-1,0]
 * 输出：[-1,0]
 * 示例 3：
 *
 * 输入：nums = [0,1]
 * 输出：[1,0]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class LeetCode0830_2 {
    public int[] singleNumber(int[] nums) {
        // 创建HashSet存储挑选出来的数组
        Set<Integer> set = new HashSet<>();
        // 遍历nums 判断是否存在，存在remove 不存在就add
        for (Integer integer:
             nums) {
            if (set.contains(integer)) {
                set.remove(integer);
            }else {
                set.add(integer);
            }
        }
        System.out.println(set);
        // 遍历HashSet
        int res[] = new int[2];
        int i = 0;
        for (Integer in :
                set) {
            res[i++] = in;
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        LeetCode0830_2 lc = new LeetCode0830_2();
        System.out.println(Arrays.toString(lc.singleNumber(nums)));
    }
}
