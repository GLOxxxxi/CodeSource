package clazzcode.classcode0908.polymorphictest1;

/**
 * 波斯猫类PersianCat继承Cat,重写吃方法和一个私有方法
 */
public class PersianCat extends Cat {

    /**
     * 重写eat方法
     */
    @Override
    public void eat() {
        System.out.println("吃小鱼干");
    }

    /**
     * 特有方法playBall
     */
    public void playBall() {
        System.out.println("玩个球");
    }
}
