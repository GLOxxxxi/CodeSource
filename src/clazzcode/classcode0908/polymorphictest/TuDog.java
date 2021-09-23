package clazzcode.classcode0908.polymorphictest;
/**
 * TuDog子类继承Dog父类
 */
public class TuDog extends Dog {
    /**
     * 重写eat方法
     */
    @Override
    public void eat() {
        System.out.println("吃莽莽");
    }

    /**
     * TuDog特有方法
     */
    public void protectHome() {
        System.out.println("看家护院");
    }
}
