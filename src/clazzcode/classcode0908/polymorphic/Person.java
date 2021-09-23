package clazzcode.classcode0908.polymorphic;

/**
 * 人类Person继承
 */
public class Person extends Animals {

    /**
     * 重写人类eat方法
     */
    @Override
    public void eat() {
        System.out.println("吃点小鱼");
    }

    /**
     * 人类特有方法coding
     */
    public void coding() {
        System.out.println("撸代码");
    }
}
