package leetcode;

import java.util.*;

/**
 *
 * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 *
 * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "hello"
 * 输出："holle"
 * 示例 2：
 *
 * 输入：s = "leetcode"
 * 输出："leotcede"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-vowels-of-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Code0345 {

    public String reverseVowels(String s) {
        // 将元音字符传入到set中方便后面使用判断字符是否为原因
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('u');
        set.add('i');
        set.add('o');
        set.add('A');
        set.add('I');
        set.add('U');
        set.add('E');
        set.add('O');
        // 设置一个从后往前的指针
        int j = s.length() - 1;
        // 将字符串转换成字符数组
        char[] charArr = s.toCharArray();
        // 遍历字符数组，遇到元音字符开始从后往前遍历字符串
        for (int i = 0; i < charArr.length; i++) {
            if (set.contains(charArr[i])) {

                while (set.contains(charArr[i])) {
                    j--;
                    charArr[i] = (char) (charArr[i] ^ charArr[j]);
                    charArr[j] = (char) (charArr[i] ^ charArr[j]);
                    charArr[i] = (char) (charArr[i] ^ charArr[j]);
                }
            }
        }
        System.out.println(Arrays.toString(charArr));
        return null;
    }

    public static void main(String[] args) {
        String str = "hello";
        Code0345 code0345 = new Code0345();
        System.out.println(code0345.reverseVowels(str));
    }


}
