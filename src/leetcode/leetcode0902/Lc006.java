package leetcode.leetcode0902;

import java.util.Arrays;

/**
 *
 * 给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 *
 *
 *
 *
 * 输入：l1 = [7,2,4,3], l2 = [5,6,4]
 * 输出：[7,8,0,7]
 * 示例2：
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[8,0,7]
 * 示例3：
 *
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc006 {
    /**
     * 模拟全加器
     * @param l1
     * @param l2
     * @return
     */

    public int[] addTwoNumbers(int[] l1, int[] l2) {
        // 判断两个数组的长度
        if (l1.length > l2.length) {
            return newArrays(l1, l2);
        } else {
            return newArrays(l2, l1);
        }

    }
    public int[] newArrays(int[] l1, int[] l2) {
        int add = 0; // 进位
        int[] temp = new int[l1.length];
        int[] newArr = new int[l1.length];
        // 补足较短的数组
        for (int i = 0; i < newArr.length; i++) {
            if (i < l1.length - l2.length) {
                // 数组前置空位为0
                newArr[i] = 0;
            } else {
                newArr[i] = l2[i - l1.length + l2.length];
            }
        }
        System.out.println(Arrays.toString(l1));
        System.out.println(Arrays.toString(newArr));
        // 数组从后往前遍历
        for (int i = l1.length - 1; i >= 0; i--) {
            // 对应位置相加再加上进位
            temp[i] = l1[i] + newArr[i] + add;
            // 加完之后重置进位
            add = 0;
            if (temp[i] >= 10) {
                // 大于等于10的取模得个位
                temp[i] %= 10;
                add++; // 进位器
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] l1 = {7, 2, 4, 3};
        int[] l2 = {5, 6, 4};
        Lc006 lc = new Lc006();
        System.out.println(Arrays.toString(lc.addTwoNumbers(l1, l2)));

    }
}
