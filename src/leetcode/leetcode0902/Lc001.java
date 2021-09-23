package leetcode.leetcode0902;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * 给定一个已按照 非递减顺序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 *
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 *
 * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 *
 *  
 * 示例 1：
 *
 * 输入：numbers = [2,7,11,15], target = 9
 * 输出：[1,2]
 * 解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 * 示例 2：
 *
 * 输入：numbers = [2,3,4], target = 6
 * 输出：[1,3]
 * 示例 3：
 *
 * 输入：numbers = [-1,0], target = -1
 * 输出：[1,2]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc001 {

    public int[] twoSum(int[] numbers, int target) {
        int[] dest = new int[2]; // 存储目标index
        int dev = 0; // 用于存储差值
        Map<Integer, Integer> map = new HashMap<>(); // 创建map存储映射关系
        for (int i = 0; i < numbers.length; i++) {
             dev = target - numbers[i]; // 得到差值
            // 如果存在差值的映射就证明map中有能构成关系的值
            if (map.containsKey(dev)) {
                // 将dest第0位 通过映射拿到下标值 + 1
                dest[0] = map.get(dev) + 1;
                // 第1位就是当前数组下标值加 + 1
                dest[1] = i + 1;
            }
            map.put(numbers[i], i);

        }
        return dest;


    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Lc001 lc = new Lc001();
        System.out.println(Arrays.toString(lc.twoSum(nums, target)));
    }
}
