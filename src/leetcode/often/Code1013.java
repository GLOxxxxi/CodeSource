package leetcode.often;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0, 1, 0, 3, 12]
 * 输出: [1, 3, 12, 0, 0]
 * 说明:
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Code1013 {
    /**
     * 双指针移动0，遇到0 往后找不是0的交换二者的位置
     * 然后接着往后遍历遇到0之后接着找不是0的元素进行
     * 交换直到后面的元素已经没有0为止
     * @param nums 数组
     */
    public void moveZeroes(int[] nums) {
        // 定一个指针
        int j = 1;
        for (int i = 0; i < nums.length; i++) {
            // 如果元素值是零进入条件
            if (nums[i] == 0 && j <= nums.length - 1) {
                j = i + 1; // j是当前下标下一位的下标值
                if (j < nums.length) {
                    // 找到后面不为0的元素
                    while (nums[j] == 0) {
                        j++;
                        if (j >= nums.length - 1) {
                            // 超长度之后跳出
                            break;
                        }
                    }
                }
                // 在长度规定范围内交换位置
                if (j <= nums.length - 1) {
                    nums[i] = nums[i] ^ nums[j];
                    nums[j] = nums[i] ^ nums[j];
                    nums[i] = nums[i] ^ nums[j];
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] num = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        Code1013 lc02 = new Code1013();
        lc02.moveZeroes(num);
    }
}
