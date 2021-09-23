package leetcode.leetcode0830;

/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 *
 * 示例:
 *
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-digits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode0830_1 {
    /*
    利用递归函数
     */
    public int sum (int n){
        /*
        求各个位数上的数字之和
         */
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public int addDigits(int num) {
        // 先求和
        int temp = sum(num);
        // 看求和之后的值是否大于10，大于10接着求和
        while (temp / 10 > 0){
            // 重新赋值
            temp = sum(temp);
        }
        return temp;
    }

    public static void main(String[] args) {
        int num = 38;
        LeetCode0830_1 lc = new LeetCode0830_1();
        System.out.println(lc.addDigits(num));
    }
}
