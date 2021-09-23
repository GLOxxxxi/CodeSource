package leetcode.often;

import java.util.Random;

/**
 * 已有方法 rand7 可生成 1 到 7 范围内的均匀随机整数，试写一个方法 rand10 生成 1 到 10 范围内的均匀随机整数。
 *
 * 不要使用系统的 Math.random() 方法。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: [7]
 * 示例 2:
 *
 * 输入: 2
 * 输出: [8,4]
 * 示例 3:
 *
 * 输入: 3
 * 输出: [8,1,10]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-rand10-using-rand7
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Code0470 {

    /**
     * 1-7等概率随机数
     * @return 1-7之间的值
     */
    public int rand7(){
        // 模拟rand7方法返回1-7随机数
        return new Random().nextInt(7) + 1;
    }

    /**
     * 用rand7模拟rand10
     *
     * 首先不能有几个rand7相加然后返回1-10之间的值，因为他们相加之后各个数的概率就不相等了
     * 例如：
     * 1-7 + 1-7 他的范围时 2 - 14 减 1 之后时 0 - 13
     * 但是
     * 得到2的概率时 1/7 * 1/7 = 1/49
     * 但是得到4的概率则是 1/7 * 1/7 * 3 = 3/49
     * 因为有可能 1 + 3 ， 2 + 2 ， 3 + 1 所以他们并不是等概率产生的
     *
     * 要想做到等概率生成就必须保证他们的区间是都是单独的
     * 这时候可以考虑到进制储位 每次执行rand7都是一次独立的事件
     * 可以把它放在进制位上面 组合起来的数字一定不会重复
     * 例如 第一次rand7 得 2 第二次rand7 得 3
     * 我们将输出域偏移 -1 得到 1 和 2
     * 得到数值12(radix 7),这个值对应了我们随机值 得出来的数值是唯一得一个7进制数
     *
     * @return 等概率返回1-10之间的
     */
    public int rand10() {
        while (true) {
            // 模拟进制转换 第一个数就是第二位上的值，要乘以进制，第二个数在0-6之间直接加上即可
            int ans = (rand7() - 1) * 7 + (rand7() - 1); // 进制转换
            // 当得到的数在1-10之间就返回
            if (1 <= ans && ans <= 10) return ans;
        }
    }

    public static void main(String[] args) {
        Code0470 code0470 = new Code0470();
        for (int i = 0; i < 10; i++) {
            System.out.println(code0470.rand10());
        }

    }

}
