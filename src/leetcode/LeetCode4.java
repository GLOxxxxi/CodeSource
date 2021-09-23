package leetcode;

import java.util.Arrays;
/**
 *给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 *
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 */
public class LeetCode4 {

    public int[] plusOne(int[] digits) {
        int temp = 0; // 用于存储临时的总值
        int x = 0; // 存储位数
        int newTemp = 0; // 存储加一之后的值
        int returnX = 1; // 存储将数值存放到数组的计算的位数
        for (int i = 0; i < digits.length; i++) {
            // 第i个数赋值之后×10^(i-1)获取到当前位数的值
            x  = digits[i];
            for (int j = i; j < digits.length - 1; j++){
                x = x * 10;
            }
            // 所有的取值相加
            temp += x;
        }
        // 总值加一
        newTemp = ++temp;
        // System.out.println(temp);
        // 获取每一个位上的值从新赋值给数组
        for (int i = 0; i < digits.length; i++) {
            for (int j = i; j < digits.length - 1; j++){
                temp = temp / 10;
                returnX = returnX * 10;
            }
            System.out.println(returnX);
            // 重新赋值
            digits[i] = temp;
            // 更新总值
            newTemp -= temp * returnX;
            // 恢复初始
            returnX = 1;
            temp = newTemp;
        }
        System.out.println(Arrays.toString(digits));
        return digits;
    }
    public static void main(String[] args) {
        int[] digits = {4, 3, 2, 1};
        // TODO 没有考虑到数组内某一个数大于9
        // int[] dig = {10};
        System.out.println(digits[0]);
        LeetCode4 lc = new LeetCode4();
        lc.plusOne(digits);
        // lc.plusOne(dig);
    }
}
