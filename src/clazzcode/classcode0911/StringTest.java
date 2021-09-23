package clazzcode.classcode0911;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String str = "woaiwanwan,wanwanaiwo1";

        // 常用方法：
        // 1.char charAt(int index) 返回 char指定索引处的字符。 不能超过下标范围
        System.out.println("charAt:" + str.charAt(1));
        // 2.String concat(String str) 将指定的字符串连接到该字符串的末尾。 相当于：+
        System.out.println("concat:" + str.concat("haiyouwo"));


        /*
         * 3.boolean contains(CharSequence s) 判断当前对象是否包含连续的参数s。s可以是以下三个子类的对象
         * CharSequence接口，包含下面子类：String、StringBuffer、StringBuilder
         */
        //判断当前对象str是否包含连续的参数abc
        System.out.println("contains:" + str.contains("wanwan"));

        // 4.boolean endsWith(String suffix) 判断当前字符串是否以指定的后缀suffix结尾。（参数必须连续）
        System.out.println("endsWith:" + str.endsWith("wan"));
        // 5.boolean startsWith(String prefix) 判断当前字符串是否以指定的前缀prefix开头。  （参数必须连续）
        System.out.println("startsWith:" + str.endsWith("wo"));

        /*
         * 8.void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
         * srcBegin：字符串开始下标
         * srcEnd：字符串结束下标(不包含)
         * dstBegin：数组dst的下标
         * 将此字符串中的字符复制到目标字符数组dst中。  (含头不含尾)[srcBegin,srcEnd)
         */
        // 将字符串str中下标2开始到6结束【不包含6】的字符复制到数组dst中，从数组的下标1开始粘贴
        char[] chars = new char[20];
        str.getChars(0, 10, chars, 8);
        System.out.println("getChars:" + Arrays.toString(chars));


        // 9.int indexOf(String s) 返回s第一次在当前对象str中出现的索引 ，-1表示没有找到（注意：这里s必须也是匹配连续的字符串）
        System.out.println("indexOf(String s):" + str.indexOf("an"));

        // 10.int indexOf(String s, int fromIndex) 返回s在当前对象指定下标fromIndex后第一次出现的索引  (str是作为一个整体匹配下标的)
        System.out.println("indexOf(String s, int fromIndex):" + str.indexOf("an", 6));

        // 11.int lastIndexOf(String str) 返回指定子字符串最后一次出现的字符串中的索引。
        System.out.println("lastIndexOf(String s):" + str.lastIndexOf("an"));
        // 12.int lastIndexOf(String str, int fromIndex) 返回指定子字符串的最后一次出现的字符串中的索引，从指定索引开始向前搜索。
        System.out.println("lastIndexOf(String s, int fromIndex):" + str.lastIndexOf("an", 6));
        // 13.boolean isEmpty() 当 length()为 0时，返回 true 。
        System.out.println("isEmpty():" + str.isEmpty());
        // 14.int length() 返回此字符串的长度。
        System.out.println("length():" + str.length());
        // 15.boolean matches(String regex)  判断当前字符串对象是否匹配给定的正则表达式regex，通常用来进行权限限制，字符格式限制   	一般用了做校验：如，用户名和密码的合法性

        // 匹配a-z或者A-Z之间任意多个字符^[a-zA-Z]+$
        // 判断str是否满足a-z或者A-Z之间任意一个字符的要求
        System.out.println("matches(String regex):" + str.matches("^[a-zA-Z]+$"));


        /*
         * 16.String replace(CharSequence target, CharSequence replacement)   将当前字符串中的target替换为replacement,通常用来和谐用语
         * 父接口：CharSequence
         *			该接口的实现类：String、StringBuffer、StringBuilder
         */
        String replace = str.replace("wanwan", "xiangwan");
        System.out.println("replace(CharSequence target, CharSequence replacement):" + replace);

        /**
         * replace()和replaceAll()，replaceFirst()区别
         * replace()只能匹配String、StringBuffer、StringBuilder对象
         * replaceAll()和replaceFirst()可以匹配正则表达式，更灵活
         * 如：
         */
        // 17.String replaceAll(String regex, String replacement) regex是正则表达式，将当前字符串中的regex全部替换为replacement
        // 		regex = "\\.";// 正则表达式中的.表示匹配任意一个字符
        // 		regex = "\\.";// 正则表达式中的\\.表示匹配一个.
        String wan = str.replaceAll("wo", "ଳଳଳ");
        System.out.println("replaceAll(String regex, String replacement):" + wan);

        // 18.String replaceFirst(String regex, String replacement)  将当前字符串中的第一个regex替换为replacement
        String wan1 = str.replaceFirst("wo", "ଳଳ");
        System.out.println("replaceFirst(String regex, String replacement):" + wan1);
        // 19.String[] split(String regex)  将当前字符串对象按照给定的正则表达式regex分割为String[]
        System.out.println("split(String regex):" + Arrays.toString(str.split(",")));

        // 请将当前str中所有的ip地址打印出来
        System.out.println("split(String regex)ip:" + str.split(","));
        // 20.CharSequence subSequence(int beginIndex, int endIndex)  从当前字符串中beginIndex和endIndex之间截取子串（含头不含尾）
        CharSequence charSequence = str.subSequence(2, 11);
        System.out.println("subSequence(int beginIndex, int endIndex):" + charSequence);
        // 21.String substring(int beginIndex)   从当前字符串中截取beginIndex到最后的子串
        String substring = str.substring(2);
        System.out.println("substring(int beginIndex):" + substring);
        // 22.String substring(int beginIndex, int endIndex)  从当前字符串中beginIndex和endIndex之间截取子串（含头不含尾）
        String substring1 = str.substring(2, 11);

        System.out.println("(int beginIndex, int endIndex):" + substring1);
        // 请将字符串中ip是172开头的 最后一段打印出来
        /*
         * 思路：
         * 1. 将字符串str先进行按照;分割
         * 2. 遍历字符串数组，判断字符串以172开头的
         * 3. 在以172的字符串中，再截取最后一个.后面的字符，打印
         */
        str = "172.168.11.65;192.168.11.66;172.168.11.69;169.168.11.169;";
        String[] split = str.split(";");
        System.out.println(Arrays.toString(split));
        for (String s : split) {
            if (s.startsWith("172")) {
                System.out.println(s.substring(s.lastIndexOf(".") + 1));
            }
        }
        // 23.char[] toCharArray() 将此字符串转换为新的字符数组。  方便遍历当前所有的字符
        str = " Woaiwanwannie ";
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }

        // 24.String toUpperCase() 将此字符转换为全大写	一般用于验证码
        System.out.println(str.toUpperCase());
        // 25.String toLowerCase() 将此字符转换为全小写	一般用于验证码
        System.out.println(str.toLowerCase());

        // 26.String trim() 将当前字符串对象中字符前面和后面的空格去除	用了避免用户的一些不当输入
        System.out.println(str.trim());
        // 27.static String valueOf(Object obj) 将其他类型转换为String对象
        Integer i = 10011;
        String s = String.valueOf(i);
        // 这里其实是1的包装类Integer
        System.out.println(s);

    }

}
