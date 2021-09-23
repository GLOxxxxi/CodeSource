package leetcode.leetcode0831;

import java.util.Arrays;

/**
 *
 * 这里有 n 个航班，它们分别从 1 到 n 进行编号。
 *
 * 有一份航班预订表 bookings ，表中第 i 条预订记录 bookings[i] = [firsti, lasti, seatsi] 意味着在从 firsti 到 lasti （包含 firsti 和 lasti ）的 每个航班 上预订了 seatsi 个座位。
 *
 * 请你返回一个长度为 n 的数组 answer，其中 answer[i] 是航班 i 上预订的座位总数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
 * 输出：[10,55,45,25,25]
 * 解释：
 * 航班编号        1   2   3   4   5
 * 预订记录 1 ：   10  10
 * 预订记录 2 ：       20  20
 * 预订记录 3 ：       25  25  25  25
 * 总座位数：      10  55  45  25  25
 * 因此，answer = [10,55,45,25,25]
 * 示例 2：
 *
 * 输入：bookings = [[1,2,10],[2,2,15]], n = 2
 * 输出：[10,25]
 * 解释：
 * 航班编号        1   2
 * 预订记录 1 ：   10  10
 * 预订记录 2 ：       15
 * 总座位数：      10  25
 * 因此，answer = [10,25]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/corporate-flight-bookings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode0831_5 {
    /**
     * 差分法求区间增量
     * @param bookings
     * @param n
     * @return
     */
    public int[] corpFlightBookings(int[][] bookings, int n) {
        // 创建能接受每一行的数组
        int[] nums = new int[n];
        //差分只改变左边界，右边界的值
        for (int[] booking : bookings) {
            // 左边界加增量
            nums[booking[0] - 1] += booking[2];
            // 有边界的下标必须要比n小，不然会数组越界
            if (booking[1] < n ) {
                // 右边界减增量
                nums[booking[1]] -= booking[2];
            }
            System.out.println(Arrays.toString(nums));
        }
        // 将做好差分所有操作的数列合并到原数列,从第二个数开始
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[][] ints = {{1,2,10},{2,3,20},{2,5,25}};
        int n = 5;
        LeetCode0831_5 lc = new LeetCode0831_5();
        System.out.println(Arrays.toString(lc.corpFlightBookings(ints, n)));
    }
}
