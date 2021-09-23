package javaadvanced.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapErgodic {
    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

        int[] nums = {1, 3, 2};
        int target = 3;
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>(args.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
            if(map.containsValue(target)){
                map.remove(i, target);
                length--;
            }

        }
        // 遍历HashMap的方式
        System.out.println(map);

    /*
    第一种 二次取值
     */
        // 通过Map.keySey遍历key和value
        System.out.println("第一种：通过Map.keySey遍历key和value");
        for (Integer key: map.keySet()) {

            System.out.println("key:" + key + " value:" + map.get(key));
        }
    /*
    第二种
     */
        // 通过Map.entrySet使用Iterato遍历key和value
        System.out.println("第二种：通过Map.entrySet使用Iterato遍历key和value");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();

            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());

        }
    /*
    第三种 大容量时推荐
     */
        // 通过Map.entrySet遍历key和value
        System.out.println("第三种：通过Map.entrySet遍历key和value");
        for (Map.Entry entry : map.entrySet()) {

            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        }
    /*
    第四种
     */
        // 通过Map.values()遍历所有的values,但是不能拿到key
        System.out.println("第四种：通过Map.values()遍历所有的values,但是不能拿到key");
        for (Integer value : map.values()) {
            System.out.println("value: " + value);

        }


        int[] newNums = new int[length];
        // 迭代器取值键值对重新赋值到数组中 阿里规范中使用entrySet
        Iterator iterators = map.entrySet().iterator();
        // 判断迭代器中是否还有下一个值
        while (iterators.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            newNums[(int) entry.getKey()] = (int) entry.getValue();

        }

        System.out.println(Arrays.toString(newNums));

    }

}
