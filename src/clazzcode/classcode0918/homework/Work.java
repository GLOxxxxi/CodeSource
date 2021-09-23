package clazzcode.classcode0918.homework;

import java.io.IOException;
import java.util.*;

public class Work {

    public static void main(String[] args) throws IOException {
        /*
            1、有如下的一个字符串  String str = “QWERTYUIQQQWJHDAADADBBBBCAD”;
            ① 请统计出其中每一个字母出现的次数，在控制台打印如下的格式：
            A----3
            B----4
            C----1
            D----2
            ② 请打印出字母次数最多的那一对
            请使用Map实现
            entrySet()
            values()
            Collections工具类中max()
            containsKey();
         */
        String str = "QWERTYUIQQQWJHDAADADBBBBCAD";
        // 创建hashmap创建字符和字符出现次数的映射关系
        HashMap<Character, Integer> map = new HashMap<>();
        // 遍历字符串
        for (int i = 0; i < str.length(); i++) {
            // 如果键值不存在
            if (!map.containsKey(str.charAt(i))) {
                // 添加键值对
                map.put(str.charAt(i), 1);
            } else {
                // 存在更新值
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        // 遍历打印
        map.forEach((x, y) -> System.out.println(x + "----" + y));

        // 获取出现最多的元素
        Collection<Integer> values = map.values();
        // 获取集合中的最大值
        Integer max = Collections.max(values);
        // 遍历map如果对应的值
        map.forEach((key, value) -> {
            // 如果通过键获取的值等于最大值
            if (map.get(key).equals(max)) {
                System.out.println(key + "-" + value);
            }
        });



        /*
            2、请写一个工具类 DisposeFileUtil，该类有两个方法，一个是从硬盘中读取文件，
            一个是写出到硬盘一个文件
            1. writeToDisk(String fileName, HashMap entry);
            2. readFromDisk(String fileName, String... keys);
            文件名称自定义
            测试类，只需要将两个方法完成功能后打印输出即可
         */

        // 创建传入的hashmap
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("xiangwan","ava");
        hashMap.put("beila","bella");
        hashMap.put("jiale","carol");
        hashMap.put("nailin","eileen");
        hashMap.put("jiaran","diana");
        // 创建键值数组
        String[] strings = {"xiangwan", "jiaran"};
        // 写入
        DisposeFileUtil.writeToDisk("laowang.properties", hashMap);
        // 读取
        DisposeFileUtil.readFromDisk("laowang.properties", strings);

    }

}
