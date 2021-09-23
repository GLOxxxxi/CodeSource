package clazzcode.classcode0908.testinterface;

public class TestInterface {
    public static void main(String[] args) {
        // 创建接口实现类对象
        MyInterfaceImpl my = new MyInterfaceImpl();
        // 调用接口中的全局变量
        System.out.println("最大:" + MyInterface.MAX_VALUE);
        System.out.println("最小:" + MyInterface.MIN_VALUE);
        // 实现接口抽象方法
        my.getMessage();
        System.out.println(my.setMessage("阿巴"));
        // 实现接口默认方法
        my.testDefault();
        // 实现接口静态方法 接口名.方法名
        MyInterface.testStatic();
    }
}
