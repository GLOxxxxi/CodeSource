package leetcode.leetcode0830;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 给出一个字符串数组words组成的一本英语词典。从中找出最长的一个单词，该单词是由words词典中其他单词逐步添加一个字母组成。若其中有多个可行的答案，则返回答案中字典序最小的单词。
 *
 * 若无答案，则返回空字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：
 * words = ["w","wo","wor","worl", "world"]
 * 输出："world"
 * 解释：
 * 单词"world"可由"w", "wo", "wor", 和 "worl"添加一个字母组成。
 * 示例 2：
 *
 * 输入：
 * words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
 * 输出："apple"
 * 解释：
 * "apply"和"apple"都能由词典中的单词组成。但是"apple"的字典序小于"apply"。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-word-in-dictionary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode0830_4 {

    public String longestWord(String[] words) {
        // 先字典排序
        Arrays.sort(words);
        // 创建set用于比较是否有相同的字符串
        Set<String> set = new HashSet<>();
        String res = "";
        // 遍历传入的数组
        for (String str :
                words) {
            if(str.length() == 1 || set.contains(str.substring(0, str.length() - 1))){
                res = str.length() > res.length() ? str : res;
                set.add(str);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = { "a", "banana", "app", "appl", "ap", "apply", "apple"};
        LeetCode0830_4 lc = new LeetCode0830_4();
        System.out.println(lc.longestWord(words));
    }
}
