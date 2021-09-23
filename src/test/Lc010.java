package test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 对于字符串 S 和 T，只有在 S = T + ... + T（T 自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
 *
 * 返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：str1 = "ABCABC", str2 = "ABC"
 * 输出："ABC"
 * 示例 2：
 *
 * 输入：str1 = "ABABAB", str2 = "ABAB"
 * 输出："AB"
 * 示例 3：
 *
 * 输入：str1 = "LEET", str2 = "CODE"
 * 输出：""
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/greatest-common-divisor-of-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc010 {

    public String gcdOfStrings(String str1, String str2) {
        Map<Character, Integer> map = new HashMap();
        Map<Character, Integer> mapTemp = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            if (map.containsKey(str2.charAt(i))) {
                mapTemp.put(str2.charAt(i), i);
            }
        }
        if (mapTemp.size() == 1) {
            return "";
        }
        for (Map.Entry entry : mapTemp.entrySet()) {
            sb.append(entry.getKey());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "ABABABC";
        String str1 = "ABAB";
        Lc010 lc = new Lc010();
        System.out.println(lc.gcdOfStrings(str, str1));
    }
}
