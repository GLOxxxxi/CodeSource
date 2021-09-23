package clazzcode.classcode0912;

/**
 * 异常测试类 ExceptionTest ，用自定义异常 NameRepeatException 判断
 * 新传进来的值是否在数组中已经存在，不存在注册成功，存在抛出异常，在main方法中
 * 捕捉异常，打印异常名和地址
 */
public class NameRepeatExceptionTest {

    public static void main(String[] args) {
        // 重复的用户名
        String name = "三上悠亚";
        try {
            if (register(name)) {
                System.out.println("注册成功");
            }
        } catch (NameRepeatException e) {
            System.out.println(e.getMessage()); // 给用户看的
            e.printStackTrace(); // 用于代码追踪
            System.out.println(e); // 给程序员看的
        }
        // 不重复的用户名
        name = "深田咏美";
        try {
            if (register(name)) {
                System.out.println(name + ",注册成功");
            }
        } catch (NameRepeatException e) {
            System.out.println(e.getMessage()); // 给用户看的
            e.printStackTrace();
            System.out.println(e); // 给程序员看的
        }
    }

    /**
     * 用户注册方法register
     * 判断提供用户名是否存在在数据库中
     * @param name 用户名
     * @return 是否存在
     * @throws NameRepeatException 姓名重复异常
     */
    public static boolean register(String name) throws NameRepeatException {
        // 判断传进来的用户名是否为空，为空直接返回false
        if (name == null) {
            return false;
        }
        // 模拟数据库，创建字符串数组
        String[] names = {"苍井空", "波多野结衣", "三上悠亚", "小泽玛利亚", "加藤鹰", "武藤兰"};
        // 遍历数组，吧传进来的用户名和数组中的元素作比较
        for (String s : names) {
            // 如果相等
            if (name.equals(s)) {
                // 抛出异常
                throw new NameRepeatException(name + ",该用户已存在！");
            }
        }
        return true;

    }
}
