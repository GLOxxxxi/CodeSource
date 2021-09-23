package leetcode.leetcode0828;

/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * 整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3x
 *
 *
 * 输入：n = 27
 * 输出：true
 *
 * 输入：n = 0
 * 输出：false
 *
 * 输入：n = 9
 * 输出：true
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/power-of-three
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode0828_3 {
    public boolean isPowerOfThree(int n) {
        // 排除n == 0的情况
        if (n == 0) {
            return false;
        }
        // 只要能被3整除就/3直到n == 1的时候证明n是3的n次幂
        while (n % 3 == 0){
            n /= 3;
        }
        if (n == 1) {
            return true;
        }else return false;

    }

    public static void main(String[] args) {
        int n = 27;
        LeetCode0828_3 lc = new LeetCode0828_3();
        System.out.println(lc.isPowerOfThree(n));
    }
}
