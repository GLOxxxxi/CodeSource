package javaadvanced.hashset;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashSetErgodic {
    public static void main(String[] args) {
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
        System.out.println(map);
        // 遍历HashMap的方式
        System.out.println("遍历HashMap的7种方式：");
        /*
        第一种 二次取值
        */
        // 通过Map.keySey遍历key和value
        System.out.println("第一种：通过Map.keySey遍历key和value");
        for (Integer key:
                map.keySet()) {
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
        for (Map.Entry entry :
                map.entrySet()) {

            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        }
        /*
        第四种
         */
        // 通过Map.values()遍历所有的values,但是不能拿到key
        System.out.println("第四种：通过Map.values()遍历所有的values,但是不能拿到key");
        for (Integer value :
                map.values()) {

            System.out.println("value: " + value);

        }
        /*
        第五种 javaadvanced.lambda
         */
        System.out.println("第五种：javaadvanced.lambda");
        map.forEach((key, value) -> {
            System.out.println("key:" + key + " value:" + value);
        });

        /*
        第六种 Streams API 单线程
         */
        System.out.println("第六种：Streams API 单线程");
        map.entrySet().stream().forEach((entry) -> {
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        });

        /*
        第七种 Stream API 多线程
         */
        System.out.println("第七种：Streams API 多线程");
        map.entrySet().parallelStream().forEach((entry) -> {
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        });

    }
}
