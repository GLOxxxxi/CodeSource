package leetcode.often;

/**
 * 有一个密钥字符串 S ，只包含字母，数字以及 '-'（破折号）。其中， N 个 '-' 将字符串分成了 N+1 组。
 *
 * 给你一个数字 K，请你重新格式化字符串，使每个分组恰好包含 K 个字符。特别地，第一个分组包含的字符个数必须小于等于 K，但至少要包含 1 个字符。两个分组之间需要用 '-'（破折号）隔开，并且将所有的小写字母转换为大写字母。
 *
 * 给定非空字符串 S 和数字 K，按照上面描述的规则进行格式化。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：S = "5F3Z-2e-9-w", K = 4
 * 输出："5F3Z-2E9W"
 * 解释：字符串 S 被分成了两个部分，每部分 4 个字符；
 *      注意，两个额外的破折号需要删掉。
 * 示例 2：
 *
 * 输入：S = "2-5g-3-J", K = 2
 * 输出："2-5G-3J"
 * 解释：字符串 S 被分成了 3 个部分，按照前面的规则描述，第一部分的字符可以少于给定的数量，其余部分皆为 2 个字符。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/license-key-formatting
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Code0482 {
    /**
     * 需要先把字符串中的所有的-去掉
     * 从后往前遍历字符串，因为第一组的字符不能确定有多少个字符，只要在规定的数值一下即可
     * 从后往前遇到普通字符不管，遇到-跳过，之后遇到字符添加，判断有没有超出规定的数值
     * 如果没超过接着加，超过了就添加一个‘-’，接着遍历循环，直到把源字符串遍历完即可跳出循环
     * 字符可以用StringBuild来接受在取反
     * @param s 输入得字符串
     * @param k 每个分组得字符个数
     * @return 规范后的字符串
     */
    public String licenseKeyFormatting(String s, int k) {
        // 现将所有的字符转换成大写
        String s1 = s.toUpperCase();
        // 创建StringBuilder接受去除‘-’之后的字符串
        StringBuilder sx = new StringBuilder();
        // 去除指定字符
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != '-') {
                sx.append(s1.charAt(i));
            }
        }
        // 重新接收字符串
        String s2 = sx.toString();
        // 创建一个新的接收改变之后的字符串
        StringBuilder sb = new StringBuilder();
        // 因为是从后往前遍历少一个正向的计数器添加计数器
        int count = 0; // 计数器
        for (int i = s2.length() - 1; i >= 0 ; i--) {
            // count是限制k的倍数，且第一个不用添加-
            if (count % k == 0 && count != 0) {
                sb.append('-');
            }
            count++; // 计数自增
            sb.append(s2.charAt(i)); // 拼接字符串
        }
        // 翻转字符串的到指定字符
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String str = "5F3Z-2e-9-w";
        int k = 2;
        Code0482 code0482 = new Code0482();
        System.out.println(code0482.licenseKeyFormatting(str, k));
    }
}
