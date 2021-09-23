package clazzcode.classcode0908.polymorphictest1;

/**
 * 布偶猫猫类 RagDollCat 继承Cat,重写吃方法和一个私有方法
 */
public class RagDollCat extends Cat{

    /**
     * 重写eat方法
     */
    @Override
    public void eat() {
        System.out.println("吃零食");
    }

    /**
     * RagDollCat 特殊方法玩毛线playWool
     */
    public void playWool() {
        System.out.println("玩毛线");
    }
}
