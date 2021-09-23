package clazzcode.classcode0917.homework;

import java.util.*;

public class Work17 {
    public static void main(String[] args) {
        /*
        1. 将ArrayList集合中重复元素，用最简单的方式去重，必须保证原有顺序【必做】
            1. 运行效率最快
            2. 代码最简洁
         */
        ArrayList list = new ArrayList();
        // 添加元素
        list.add("1");
        list.add("22");
        list.add("22");
        list.add("122");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        boolean b = set.addAll(list);
        System.out.println("去除重复元素之后：" + set);

        /*
        2. 设计一个方法，输入一个字符串参数，将字符串中重复的字符去除后返回新字符串。
			例如("abcdefa") => abcdef【高级，牛皮的做】
			char[] c = toCharArray();
			转换为Charactor[]
			List<Charactor> list = Arrays.asList(c);
			LinkedHashSet lhs = new LinkedHashSet(list);
			new StringBuilder().append(元素).toString
         */

        String str = "abcdefacc";
        String s = removeRepeat(str);
        System.out.println("去重之后：" + s);

        /*
         3. 设计一个方法，查询一个字符串str在另外一个字符串src中出现的次数【高级，牛皮的做】
         */
        str = "acc";
        String src = "accacaacac";
        int count = count(str, src);
        System.out.println("出现次数：" + count);

    }

    /**
     * 查询 目标字符串有多少字串
     * @param str 目标字符串
     * @param src 源字符串
     * @return 出现字串的次数
     */
    private static int count(String str, String src) {
        // 计数器
        int count = 0;
        // 如果 源字符串包含目标字符串，说明存在字串
        while (src.contains(str)) {
            // 获取存在的下标，并后移一位，并让源字符串重新引用更新之后的字符串
            src = src.substring(src.indexOf(str) + 1);
            // 添加字符串
            count++;
        }
        // 返回计数器
        return count;
    }

    /**
     * 去重
     * @param str 去重的字符串
     * @return 去重后的str
     */
    public static String removeRepeat(String str) {
        // 将字符串转换成char数组
        char[] chars = str.toCharArray();
        // 将char数组转换成对应的包装类数组
        Character[] characters = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            characters[i] = chars[i];
        }
        // 将包装类数组转换成集合
        List<Character> list = Arrays.asList(characters);
        // 将集合传进有序不重复的集合中
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        // 准备拼接字符串
        StringBuilder sb = new StringBuilder();
        // 迭代集合
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            // 拼接字符串
            sb.append(iterator.next());
        }
        // 返回 String 类型的数据
        return sb.toString();
    }



}
