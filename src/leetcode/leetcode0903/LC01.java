package leetcode.leetcode0903;

import java.util.Arrays;

/**
 * 设计一个算法，找出数组中最小的k个数。以任意顺序返回这k个数均可。
 *
 * 示例：
 *
 * 输入： arr = [1,3,5,7,2,4,6,8], k = 4
 * 输出： [1,2,3,4]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/smallest-k-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LC01 {

    public static int[] smallestK(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1);
        return  Arrays.copyOf(arr, k);

    }

    /**
     * 快速排序算法
     * @param arr 数组
     * @param src 起始坐标
     * @param dest 终止坐标
     */
    public static void quickSort(int[] arr, int src, int dest) {
        // 左边界不能大于右边界
        if (src < dest) {
            int srcPos = src;
            int destPos = dest;
            int temp = arr[srcPos]; // 存储数组第一个值
            // 从右边开始找小于temp的值
            while (srcPos < destPos) {
                while (srcPos < destPos && arr[destPos] > temp)
                    destPos--;
                // 判断大小如果大于交换位置
                if (srcPos < destPos)
                    // 然后从右边开始找小于temp的值
                    arr[srcPos++] = arr[destPos];
                while (srcPos < destPos && arr[srcPos] < temp)
                    srcPos++;
                if (srcPos < destPos)
                    // 找到之后在从左边找
                    arr[destPos--] = arr[srcPos];

            }
            // 最后将中间的值赋予temp
            arr[srcPos] = temp;
            // 中间左边小于temp的接着排序即递归
            quickSort(arr, src, srcPos - 1);
            // 右边大于的又要接着排序
            quickSort(arr, srcPos + 1, dest);
        }


    }
    public static void main(String[] args) {
        int[] arr = {9, 5, 3, 1, 7};
        System.out.println(Arrays.toString(smallestK(arr, 4)));
    }
}



