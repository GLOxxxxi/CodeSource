package clazzcode.classcode0917.homework;

import java.util.*;

public class WorkTest {
    public static void main(String[] args) {
         /*
        2. 设计一个方法，输入一个字符串参数，将字符串中重复的字符去除后返回新字符串。
			例如("abcdefa") => abcdef【高级，牛皮的做】
			char[] c = toCharArray();
			转换为Charactor[]
			List<Charactor> list = Arrays.asList(c);
			LinkedHashSet lhs = new LinkedHashSet(list);
			new StringBuilder().append(元素).toString
         */
        String str = "abcdefppzzeqdeszz";
        char[] chars = str.toCharArray();
        Set map = new LinkedHashSet();
        int count = 0;
        for (char aChar : chars) {
            if (!map.contains(aChar)) {
                map.add(aChar);

            }
        }
        StringBuilder sb = new StringBuilder();
        map.forEach((x) -> sb.append(x));
        System.out.println("去重之后：" + sb);
    }
}
