package leetcode.leetcode0831;

/**
 *
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * 示例 1：
 *
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode0831_2 {

    public String replaceSpace(String s) {
        // 创建StringBuilder用于存储字符串，线程不安全消耗低
        StringBuilder sb = new StringBuilder();
        // 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            // 如果遇到空格拼接个%20
           if(s.charAt(i) == ' '){
               sb.append("%20");
           } else {
               // 其他字符直接拼接
               sb.append(s.charAt(i));
           }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LeetCode0831_2 lc = new LeetCode0831_2();
        String s = "We are happy.";
        System.out.println(lc.replaceSpace(s));

    }
}
