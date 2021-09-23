package clazzcode.classcode0908.polymorphictest1;

/**
 * 英国短毛猫类BritishShortHairs继承Cat类 重写eat 添加自己特有方法
 */
public class BritishShortHairs extends Cat {

    /**
     * 重写eat方法
     */
    @Override
    public void eat() {
        System.out.println("吃点昨天猫粮");
    }

    /**
     * BritishShortHairs 特有方法
     */
    public void playRice() {
        System.out.println("玩老鼠");
    }
}
