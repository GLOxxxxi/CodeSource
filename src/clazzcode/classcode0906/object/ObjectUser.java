package clazzcode.classcode0906.object;

/**
 * Object 测试类，创建对象，使用hashcode，equals，toString，getClass
 */
public class ObjectUser {

    public static void main(String[] args) {
        // 创建两个User对象赋相同的值
        User user = new User("mmr", 19, '女');
        User user1 = new User("mmr", 19, '女');

        // 获取对象的hashcode
        int i = user.hashCode();
        int i1 = user1.hashCode();
        System.out.println("user：" + i); // user：460141958
        System.out.println("user1：" + i1); // user1：1163157884

        // 直接打印对象
        System.out.println(user); // clazzcode.classcode0906.object.User@1b6d3586
        System.out.println(user1); // clazzcode.classcode0906.object.User@4554617c

        // 重写toString方法之后打印指定格式的字符串
        System.out.println("user的toString方法：" + user.toString());
        System.out.println("user1的toString方法：" + user1.toString());

        // 试用equals方法
        System.out.println(user == user1); // false
        boolean userEquals = user.equals(user1); // 重写equals方法
        System.out.println(userEquals); // true

        // getClass 获取字节码文件
        Class<? extends User> userClass = user.getClass();
        Class<? extends User> userClass1 = user1.getClass();
        // 字节码比较是否相等，用 ==
        System.out.println(userClass == userClass1);

    }
}
