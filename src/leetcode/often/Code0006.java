package leetcode.often;

import java.util.ArrayList;
import java.util.List;

/**
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 *  
 *
 * 示例 1：
 *
 * 输入：s = "PAYPALISHIRING", numRows = 3
 * 输出："PAHNAPLSIIGYIR"
 * 示例 2：
 * 输入：s = "PAYPALISHIRING", numRows = 4
 * 输出："PINALSIGYAHRPI"
 * 解释：
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * 示例 3：
 *
 * 输入：s = "A", numRows = 1
 * 输出："A"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zigzag-conversion
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Code0006 {

    /**
     * 利用触底反弹的机制。创建一个 list 接受每一行的字符串最后拼接
     * 可以从上往下到底之后再往上，以此类推，可以将每个字符都装进 list 中，最后新建个 StringBuilder 来接受所有的字符串
     * 首先长度为1的字符直接返回，之后将字符串转成字符数组 .toCharArray() 遍历每一个字符添加到对应行中的 list 中
     * 给一个可以控制 list 的指针i，数组自增，i也跟着增加，遇到边界之后就要折返，开始自减，这时候就可以在之前定义一个 flag 专门用来
     * 控制指针是++还是--。直到最后遍历完数组，将所有的元素都装进到对应的list中去了，在遍历list拼接字符串即可
     * @param s 接收到的参数
     * @param numRows z字回旋的行数
     * @return z字回旋之后的字符串
     */
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            // 创建n行字符流接受字符
            list.add(new StringBuilder());
        }
        int i = 0; // list中的指针
        int flag = -1; // 触界标识
        for (char c : s.toCharArray()) {
            list.get(i).append(c); // 接受字符
            // 第一次触底之前先是++，触底之后是i-- 到头之后再反过来 利用 flag
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            // 如果是向下的就是i++，向上的就是i--
            i += flag;
        }
        // 重新遍历合并字符串
        StringBuilder res = new StringBuilder();
        for (StringBuilder stringBuilder : list) {
            res.append(stringBuilder);
        }
        return res.toString();
    }


    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int numRows = 3;
        Code0006 code0006 = new Code0006();
        System.out.println(code0006.convert(str, numRows));
    }

}
