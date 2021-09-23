package clazzcode.classcode0912;

/**
 * 正则表达式测试类RegexTest
 */
public class RegexTest {

    public static void main(String[] args) {
        // 添加一个需要验证的字符串
        String str = "asd233";
        // 验证的正则表达式
        String regex = "[a-zA-z0-9]*";
        // 字符串调用方法验证
        boolean matches = str.matches(regex);
        System.out.println(matches);

        // 准备一个手机号字符串
        str = "19882446950";
        regex = "1[3-9][0-9]{9}"; // 1[3-9][0-9]{9}
        boolean matches2 = str.matches(regex);
        System.out.println(matches2);
    }
}
