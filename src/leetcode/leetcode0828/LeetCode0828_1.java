package leetcode.leetcode0828;

import java.util.*;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，
 * 其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 输入: [2,2,1]
 * 输出: 1
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class LeetCode0828_1 {
    public int singleNumber(int[] nums) {
        /*
        双循环时间复杂度更高n^2
         */
//        int count = 0;
//        int out = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++){
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                out = nums[i];
//            }
//            count = 0;
//        }
//        System.out.println(out);
//        return out;
        /*
        利用HashMap时间复杂度n
         */
        // 创建键
        int key = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            if(map.containsKey(num)){
                map.remove(num);
            }else {
                map.put(num, 1);
            }
        }
        // 创建迭代器获取键值对
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            key = (int) entry.getKey();
            // value = (String) entry.getValue();
        }
        System.out.println(key);
        return key;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        LeetCode0828_1 lc = new LeetCode0828_1();
        lc.singleNumber(nums);

    }
}
