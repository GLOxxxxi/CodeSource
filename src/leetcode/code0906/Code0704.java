package leetcode.code0906;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 *
 * 示例 1:
 *
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 示例 2:
 *
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Code0704 {
    /**
     * 二分查找法
     * @param nums 传入数组
     * @param target 目标值
     * @return 返回下标
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (nums.length < 2) {
            return nums[0] == target ? 0 : -1;
        }
        if (nums[left] == target) {
            return left;
        } else if (nums[right] == target) {
            return right;
        } else {
            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[mid] > target) {
                    right = mid;
                } else {
                    left = mid;
                }
                if (nums[mid] == target) {
                    return mid;
                }
                if(nums[left] != target && nums[right] != target && left + 1 == right) break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = {-1, 0, 3, 5, 9, 12};
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        Code0704 code0704 = new Code0704();
        System.out.println(code0704.search(nums, target));
    }
}
