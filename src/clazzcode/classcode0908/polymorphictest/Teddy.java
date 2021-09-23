package clazzcode.classcode0908.polymorphictest;
/**
 * Teddy子类继承Dog父类
 */
public class Teddy extends Dog {
    /**
     * 重写eat方法
     */
    @Override
    public void eat() {
        System.out.println("吃灰");
    }

    /**
     * Teddy特有方法
     */
    public void fuck() {
        System.out.println("赵日天");
    }
}
