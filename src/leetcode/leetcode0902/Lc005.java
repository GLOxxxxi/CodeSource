package leetcode.leetcode0902;

/**
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 *
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 *
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 *
 * 示例 1:
 *
 * 输入: "USA"
 * 输出: True
 * 示例 2:
 *
 * 输入: "FlaG"
 * 输出: False
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/detect-capital
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc005 {

    public boolean detectCapitalUse(String word) {

        if (word.toUpperCase().equals(word)) {
            // 全大写USA
            return true;
        } else if (word.toLowerCase().equals(word)) {
            // 全小写leetcode
            return true;
        } else if (word.substring(0, 1).equals(word.substring(0, 1).toUpperCase()) && word.substring(1).equals(word.substring(1).toLowerCase())) {
            // 先判断第一个字符是不是大写，之后要全小写
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String str = "ffffffffffffffF";
        Lc005 lc = new Lc005();
        System.out.println(lc.detectCapitalUse(str));
    }
}
