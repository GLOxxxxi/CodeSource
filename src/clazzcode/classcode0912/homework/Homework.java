package clazzcode.classcode0912.homework;

import java.util.*;

public class Homework {

    public static void main(String[] args) {
        /*
        1. 将int[] arr = ｛22,11,44,8,2,80,77｝ 复制arr到新数组 newArr中连续4个元素,
        源数组从第3个元素开始赋值,
        新数组从第2个元素开始粘贴,新数组的长度根据复制的元素个数确定。最后升序排列		【必做】
        （提示：System方法和Arrays方法）
         */
        System.out.println("====================第一题=====================");
        int[] arr = {22, 11, 44, 8, 2, 80, 77};
        int[] newArr = new int[5];
        // 复制数组
        System.arraycopy(arr, 2, newArr, 1, 4);
        System.out.println("复制之后的数组：" + Arrays.toString(newArr));
        // 将数组排序
        Arrays.sort(newArr);
        System.out.println("排序后新数组：" + Arrays.toString(newArr));

        /*
        2. 统计字符串中数字个数			【必做】
        //如："abc21b4 16u" ===> 输出5
        public static int isNumeric(String str){
        代码
        }
        思路：首先通过String类里面的charAt()方法字符串中每个位置的字符，
        然后通过Character.isDigit()方法来判断得到的字符是否为数字并计数。
         */
        System.out.println("====================第二题=====================");
        String str = "abc21b4 16u";
        int numeric = isNumeric(str);
        System.out.println("数字个数：" + numeric);

        /*
        3. "peter piper picked a peck of pickled peppers"统计这段绕口令有多少个以p开头的单词【必做】
	    String中方法：split/startWith
         */
        System.out.println("====================第三题=====================");
        str = "peter piper picked a peck of pickled peppers";
        String[] ps = str.split(" ");
        int count = 0;
        for (String s : ps) {
            if (s.startsWith("p")) {
                count++;
            }
        }
        System.out.println("p的个数：" + count);

        /*
        4. 把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy【必做】
	    提示：遍历，判断奇偶性、然后调用toUpperCase方法，然后拼接到一起
         */
        System.out.println("====================第四题=====================");
        str = "lengendary";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            // 判断奇偶
            if (i % 2 == 0) {
                stringBuilder.append(String.valueOf(str.charAt(i)).toUpperCase());
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        System.out.println("改变之后：" + stringBuilder);

        /*
        5. String s = "113@ ere qqq yyui"请输出所有子串【split方法】
         */
        System.out.println("====================第五题=====================");
        String s = "113@ ere qqq yyui";
        // 调用split方法
        String[] s1 = s.split(" ");
        System.out.println("分割之后：" + Arrays.toString(s1));

        /*
        6. 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
        “To be or not to be"，将变成"oT eb ro ton ot eb"。
        【split方法、StringBuilder中reverse，最后拼接到一个字符串】
         */
        System.out.println("====================第六题=====================");
        String str6 = "To be or not to be";
        // 创建一个可变字符串，用于反转之后将字符串拼接起来
        StringBuilder sb6 = new StringBuilder();
        // 将字符串用空格分割成数组
        String[] str6Arr = str6.split(" ");
        // 遍历数组
        for (int i = 0; i < str6Arr.length; i++) {
            // 历史创建一个可变数组用于字符数组反转字符串
            StringBuilder tempSb = new StringBuilder();
            sb6.append(tempSb.append(str6Arr[i]).reverse());
            // 判断还有没有下一位，有的话添加空格
            if (i + 1 <= str6Arr.length - 1) {
                sb6.append(" ");
            }
        }
        System.out.println("反转后：" +sb6);

        /*
        7. String s=”name=zhangsan age=18 classNo=090728”;
        将上面的字符串拆分，结果如下 : zhangsan 18 090728
        【split方法、遍历substring截取=后，最后拼接到一个字符串】
         */
        System.out.println("====================第七题=====================");
        String str7="name=zhangsan age=18 classNo=090728";
        // 将字符串分割成字符串数组
        String[] str7Arr = str7.split(" ");
        // 创建可变字符串接收改变后的字符串
        StringBuilder sb5 = new StringBuilder();
        // 先遍历字符串数组
        for (int i = 0; i < str7Arr.length; i++) {
            // 在遍历字符串数组中的元素
            for (int j = 0; j < str7Arr[i].length(); j++) {
                // 查找字符串中的 =
                if (str7Arr[i].charAt(j) == '=') {
                    // 截取 = 后边的字符串，将其拼接到可变字符串中
                    sb5.append(str7Arr[i].substring(j + 1));
                }
            }
        }
        System.out.println("拆分结果：" +sb5.toString().trim());

        /*
        8. 现有一个Date对象【自己创建一个即可】，请将该对象中获取 年月日时分秒 分别打印输出。【中级-选做】
	    提示：用到Calendar和Calendar中方法
	    Calendar c = getInstance();
         */
        System.out.println("====================第八题=====================");
        Date date = new Date(); // 创建日期对象
        Calendar instance = Calendar.getInstance(); // 获取日历对象
        instance.setTime(date); // 将日历设为当前日期
        // 获取当前日期年月日时分秒
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH);
        int day_of_month = instance.get(Calendar.DAY_OF_MONTH);
        int hour = instance.get(Calendar.HOUR_OF_DAY);
        int minute = instance.get(Calendar.MINUTE);
        int second = instance.get(Calendar.SECOND);
        System.out.println(year + "年" + (month + 1) + "月" + day_of_month + "日" + " " + hour + ":" + minute + ":" + second);

        /*
        9. 请将下面所有的文件中选出所有是txt类型的文件，并将该类型文件所有首字母改为大写，
	    并且返回新数组（中级） 【选做】
	    String[] arr = {"hao.html", "Hello.exe", "haha.txt", "abc.txt",
		"cdf.doc", "test.png", "test2.jpg"};
         */
        System.out.println("====================第九题=====================");
        String[] arrs = {"hao.html", "Hello.exe", "haha.txt", "abc.txt", "cdf.doc", "test.png", "test2.jpg"};

        // 首先你要找出以txt结尾的字符串元素。找出元素之后将找出来的元素他们装到一起，然后可以找到类似“haha.txtabc.txt”这种字符串
        // 将这种字符串分割就可以装进新的数组
        StringBuilder sb1 = new StringBuilder();
        for (String arr1 : arrs) {
            if (arr1.endsWith("txt")) {
                // 添加到set中等待遍历
                sb1.append(arr1);
            }
        }

        System.out.println("txxxxxxxxt：" + sb1);
        System.out.println(Arrays.toString(sb1.toString().split("txt")));


        // 创建set接收txt结尾的字符串
        Set<String> set = new HashSet<>();
        // 遍历数组
        for (String value : arrs) {
            // 判断元素是否以txt结尾
            if (value.endsWith("txt")) {
                // 添加到set中等待遍历
                set.add(value);
            }
        }
        // 遍历set用迭代器
        Iterator<String> iterator = set.iterator();
        // 创建新数组。长度是set的size
        String[] txtArr = new String[set.size()];
        int i = 0; // 新数组下标
        while (iterator.hasNext()) {
            // 将字符串添加到数组
            txtArr[i] = iterator.next();
            i++;
        }
        System.out.println("txt数组：" + Arrays.toString(txtArr));

        /*
        10. 设计一个方法，给出一句英文句子： "let there be light"得到一个新的字符串，
        每个单词的首字母都替换为大写
	    得到的新字符串是"Let There Be Light"【选做】
         */
        System.out.println("====================第十题=====================");
        str = "let there be light";
        // 用 “ ”分隔字符串
        String[] sp10 = str.split(" ");
        // 创建可变字符串
        StringBuilder sb = new StringBuilder();
        // 遍历数组
        for (int j = 0; j < sp10.length; j++) {
            // 取第一个字符大写，在拼接之后的字符 最后将他们追加到可变字符串中
            sb.append(String.valueOf(sp10[j].charAt(0)).toUpperCase()).append(sp10[j].substring(1));
            // 判断是否还有下个单词
            if (j + 1 < sp10.length) {
                // 添加空格
                sb.append(" ");
            }
        }
        System.out.println("新字符串：" + sb);
    }

    /**
     * 判断字符串中是否有数字返回几个数字
     * @param str 需要判断的字符串
     * @return 数字个数
     */
    public static int isNumeric(String str){
        int count = 0; // 计数
        for (int i = 0; i < str.length(); i++) {
            // 判断字符是否是数字
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
