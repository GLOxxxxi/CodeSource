package clazzcode.classcode0908.polymorphictest;

/**
 * Husky子类继承Dog父类
 */
public class Husky extends Dog {
    /**
     * 重写eat方法
     */
    @Override
    public void eat() {
        System.out.println("吃土");
    }

    /**
     * Husky特有方法
     */
    public void breakHome() {
        System.out.println("拆家了");
    }
}
