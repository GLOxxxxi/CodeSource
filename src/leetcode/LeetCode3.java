package leetcode;

import java.math.BigInteger;
/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 */
public class LeetCode3 {

    public String addBinary(String a, String b) {
        // 将字符串转换成BigInteger不能是Integer防止数据溢出
        BigInteger b1 = new BigInteger(a, 2);
        BigInteger b2 =new BigInteger(b, 2);
        // 将转换后的数据相加之后再转换会String
        String s = b1.add(b2).toString(2);
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        LeetCode3 lc = new LeetCode3();
        lc.addBinary(a, b);
    }
}
