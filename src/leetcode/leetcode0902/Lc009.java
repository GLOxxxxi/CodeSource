package leetcode.leetcode0902;

/**
 * 给你一个整数数组 arr，只有可以将其划分为三个和相等的 非空 部分时才返回 true，否则返回 false。
 *
 * 形式上，如果可以找出索引 i + 1 < j 且满足 (arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1]) 就可以将数组三等分。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [0,2,1,-6,6,-7,9,1,2,0,1]
 * 输出：true
 * 解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
 * 示例 2：
 *
 * 输入：arr = [0,2,1,-6,6,7,9,-1,2,0,1]
 * 输出：false
 * 示例 3：
 *
 * 输入：arr = [3,3,6,5,-2,2,5,1,-9,4]
 * 输出：true
 * 解释：3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc009 {

    /**
     * 因为要分为三个区间，每个区间的和都是总和的三分之一
     * @param arr
     * @return
     */
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0; // 源数组所有元素之和
        int sumArr = 0; // 区间数组和
        int srcPos = 0; // 第一区间右边界
        int destPos = 0; // 第二区间的右边界
        int secSum = 0; // 第三个区间和
        // 遍历求和获取三个区间的和
        for (int j : arr) {
            sum += j;
        }
        System.out.println("数组和" + sum);
        // 必须要用double，不然不精准
        double temp = sum / 3.0 ;
        for (int i = 0; i < arr.length; i++) {
            // 为了避免temp == 0的时候先把sumArr加上一个元素
            sumArr += arr[i];
            if (temp == sumArr) {
                srcPos = i; // 确定第一区间的右边界
                sumArr = 0; // 初始化sumArr
                break; // 符合条件跳出一个区间到第二个区间
            }
            srcPos = arr.length - 1; // 如果没有跳出第一区间就证明不符合条件
        }
        for (int i = srcPos + 1; i < arr.length; i++) {
            sumArr += arr[i];
            if (temp == sumArr) {
                destPos = i;
                break;
            }
            destPos = arr.length - 1;
        }
        if (destPos + 1 == arr.length) {
            // 到第二区间结束之后如果有区间已经带到了数组长度证明只有两个区间不符合
            return false;
        }
        for (int i = destPos + 1; i < arr.length; i++) {
            // 确定两个区间之后第三个区间元素的和如果等于temp证明符合条件，否之不符合
            secSum += arr[i];
        }
        return secSum == temp;

    }
    public static void main(String[] args) {
        // int[] arr = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}; // true
        int[] arr = {24, -4, -5, -12, 5, 16, -12, 22, 2}; // false
        // int[] arr = {2, 2, 3}; // false
        // int[] arr = {1, -1, 1, -1}; // false
        // int[] arr = {0, 0, 0, 0}; // false
        // int[] arr = {18, 12, -18, 18, -19, -1, 10, 10}; // true
        Lc009 lc = new Lc009();
        System.out.println(lc.canThreePartsEqualSum(arr));
    }
}
