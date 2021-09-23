package clazzcode.classcode0911.homework;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        // 1. 将String类型字符串”test” 翻转变为 “tset”，并且保证tset还是String类型
        String str = "test";
        StringBuilder stringBuilder = new StringBuilder();
        String reverseStr = stringBuilder.append(str).reverse().toString();
        System.out.println("翻转后：" + reverseStr);

        // 2. 写一个方法判断一个字符串是否对称【提示：StringBuilder中reverse方法】
        str = "abbxaxbba"; // 写一个回文串
        // StringBuilder进行接收并且反转
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        // 反转之后判断源串对比，一致对称，反之不对称
        if (str.equals(sb.reverse().toString())) {
            System.out.println("字符串对称");
        } else {
            System.out.println("字符串不对称");
        }

        // 3. String s = "113@ ere qqq yyui"请输出所有子串【split方法】
        String s = "113@ ere qqq yyui";
        // 调用split方法
        String[] s1 = s.split(" ");
        System.out.println("分割之后：" + Arrays.toString(s1));

        /*
        4. 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
        “To be or not to be"，将变成"oT eb ro ton ot eb"。【split方法、StringBuilder中reverse，最后拼接到一个字符串】
        */
        String str4 = "To be or not to be";
        // 创建一个可变字符串，用于反转之后将字符串拼接起来
        StringBuilder sb4 = new StringBuilder();
        // 将字符串用空格分割成数组
        String[] str4Arr = str4.split(" ");
        // 遍历数组
        for (int i = 0; i < str4Arr.length; i++) {
            // 历史创建一个可变数组用于字符数组反转字符串
            StringBuilder tempSb = new StringBuilder();
            sb4.append(tempSb.append(str4Arr[i]).reverse());
            // 判断还有没有下一位，有的话添加空格
            if (i + 1 <= str4Arr.length - 1) {
                sb4.append(" ");
            }
        }
        System.out.println("反转后：" +sb4);

        /*
        * 5. String s=”name=zhangsan age=18 classNo=090728”;
        * 将上面的字符串拆分，结果如下 : zhangsan 18 090728【split方法、遍历substring截取=后，
        * 最后拼接到一个字符串】
        * */
        String str5="name=zhangsan age=18 classNo=090728";
        // 将字符串分割成字符串数组
        String[] str5Arr = str5.split(" ");
        // 创建可变字符串接收改变后的字符串
        StringBuilder sb5 = new StringBuilder();
        // 先遍历字符串数组
        for (int i = 0; i < str5Arr.length; i++) {
            // 在遍历字符串数组中的元素
            for (int j = 0; j < str5Arr[i].length(); j++) {
                // 查找字符串中的 =
                if (str5Arr[i].charAt(j) == '=') {
                    // 截取 = 后边的字符串，将其拼接到可变字符串中
                    sb5.append(str5Arr[i].substring(j + 1));
                    // 判断还有没有下一位
                    if (i + 1 <= str5Arr.length - 1) {
                        sb5.append(" ");
                    }
                }
            }
        }
        System.out.println("拆分结果：" +sb5);

        /*
        *   6. 设计一个方法，参数任意输入一个整数（小于10位），求参数一共有多少位
        * public int getWeiShu(int a){【valueOf方法、length方法】
        * 代码
        * }
        * */
        int a = 199200;
        System.out.println("位数：" + getWeiShu(a));
    }

    /**
     * 获取位数的方法
     * @param a 判断位数的整数
     * @return 位数
     */
    public static int getWeiShu(int a) {
        // 将传进来的int类型转换成字符串类型，在获取长度返回
        String s = String.valueOf(a);
        return s.length();
    }
}
