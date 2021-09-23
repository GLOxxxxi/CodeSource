package clazzcode.classcode0908.testinterface;

/**
 * 接口实现类
 */
public class MyInterfaceImpl implements MyInterface {
    /**
     * 实现接口的抽象方法
     */
    @Override
    public void getMessage() {
        System.out.println("抽象方法" + "最小值:" + MyInterface.MIN_VALUE);
    }

    @Override
    public String setMessage(String str) {
        return str + "阿巴";
    }

    /**
     * 重写 testDefault 方法
     */
    @Override
    public void testDefault() {
        System.out.println("修改之后的默认方法");
    }



}
