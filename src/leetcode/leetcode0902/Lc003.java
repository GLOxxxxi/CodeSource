package leetcode.leetcode0902;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 *  
 *
 * 示例：
 *
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/first-unique-character-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc003 {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>(); // 创建映射关系
        for (int i = 0; i < s.length(); i++) {
            // 遍历字符串，当遇到相同的字符的时候将默认值加1，只有出现过一次的字符对应的是1
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            // 重新循环找到对应value是1的值
            if (1 == map.get(s.charAt(i))) {
                // 返回下标
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        Lc003 lc = new Lc003();
        System.out.println(lc.firstUniqChar(s));
    }
}
