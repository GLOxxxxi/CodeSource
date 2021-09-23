package leetcode.leetcode0831;

/**
 *
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 *
 * F(0) = 0, F(1)= 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：1
 * 示例 2：
 *
 * 输入：n = 5
 * 输出：5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode0831_3 {

    public int fib(int n) {
        int x = 0; // 存储第一个数
        int y = 1; // 存储第二个数
        int sum = 0; // 存储前两个数之和
        for (int i = 0; i < n; i++) {
            sum = (x + y) % 1000000007;
            x = y;
            y = sum;
        }
        // 最后需要的是第一个数而不是sum如果是sum的话就是当前要求的位的元素加上后一个元素的和
        return x;
    }

    public static void main(String[] args) {
        int i = 5;
        LeetCode0831_3 lc = new LeetCode0831_3();
        System.out.println(lc.fib(i));
    }
}
