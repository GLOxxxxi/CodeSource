package clazzcode.classcode;

/**
 * 该类用于测试String的各个方法
 */
public class StringTest {
    public static void main(String[] args) {
        // 创建String类对象
        String str = new String("beautiful Baby");
        // 字符长度
        int length = str.length();
        // 字符全转小写
        String lowStr = str.toLowerCase();
        // 字符全部大写
        String upStr = str.toUpperCase();
        // 获取下标位置的字符
        char c = str.charAt(4);
        // 获取下标区间的一段字符
        String substring = str.substring(0, 4);
        // 判断是否有公共后缀
        boolean aby = str.endsWith("aby");
        // 判断是否有公共前缀
        boolean bee = str.startsWith("bee");
        // 打印测试
        System.out.println(length);
        System.out.println(lowStr);
        System.out.println(upStr);
        System.out.println(c);
        System.out.println(substring);
        System.out.println(aby);
        System.out.println(bee);
    }
}
