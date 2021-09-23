package leetcode.often;

import java.util.Locale;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 解释："amanaplanacanalpanama" 是回文串
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 * 解释："raceacar" 不是回文串
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Code0125 {
    /**
     * 先将字符串遍历把不符合字符的删掉重新拼接字符串
     * 然后折半将左边的和右边翻转之后进行对比如果相同就是回文
     * 重新拼接的字符串的长度如果是奇数右边折半之后左边界加1
     * @param s 需要判断的字符串
     * @return 是否是回文串
     */
    public boolean isPalindrome(String s) {
        // 如果字符串的长度是1就直接返回true
        if (s.length() < 2) return true;
        // 将所有的字符转换成小写以便于对比字符串
        String lowS = s.toLowerCase();
        // 准备拼接新字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lowS.length(); i++) {
            // 判断字符是否是符合条件
            if (Character.isLetterOrDigit(lowS.charAt(i))) {
                sb.append(lowS.charAt(i)); // 拼接字符串
            }
        }
        String allStr = sb.toString(); // 新字符串
        StringBuilder stringBuilder = new StringBuilder(); // 接收折半之后右边的字符用于反转之后对比
        // 如果字符长度为偶数的话折半开始对比就可以，如果奇数个就可以从折半的加一个开始到最后
        if (allStr.length() / 2 == 0) {
            String preStr = allStr.substring(0,allStr.length() / 2);
            String endStr = sb.substring(allStr.length() / 2, allStr.length());
            return preStr.equals(stringBuilder.append(endStr).reverse().toString());
        } else {
            String preStr = allStr.substring(0,allStr.length() / 2);
            String endStr = sb.substring((allStr.length() / 2) + 1 , allStr.length());
            return preStr.equals(stringBuilder.append(endStr).reverse().toString());
        }
    }

    public static void main(String[] args) {
        Code0125 code0125 = new Code0125();
        String str = "A man, a plan, a canal: Panama";
        System.out.println(code0125.isPalindrome(str));
    }
}
