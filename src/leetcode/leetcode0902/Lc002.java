package leetcode.leetcode0902;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc002 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> tempSet = new HashSet<>(); // 存放交集
        Set<Integer> set = new HashSet<>(); // 存放第一个数组值
        // 将第一个数组加到set
        for (int j : nums1) {
            set.add(j);
        }
        // 循环第二个数组判断set中有没有重复的值，如果有就加到交集的set中
        for (int j : nums2) {
            if (set.contains(j)) {
                tempSet.add(j);
            }
        }
        System.out.println(tempSet);
        // 将set转换成数组
        int[] temp = new int[tempSet.size()];
        int count = 0; // 计数用于存放下标
        for (Integer integer : tempSet) {
            temp[count] = integer;
            count++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        Lc002 lc = new Lc002();
        System.out.println(Arrays.toString(lc.intersection(nums1, nums2)));
    }
}
