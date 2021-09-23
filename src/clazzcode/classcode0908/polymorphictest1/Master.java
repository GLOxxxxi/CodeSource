package clazzcode.classcode0908.polymorphictest1;


/**
 * 主人类 Master 包含喂食方法
 */
public class Master {

    public void feedCat(Cat cat) {
        // 吃方法
        cat.eat();

        // 判断传入的猫类子类对象是那个子类对象,并调用该对象特有方法
        if (cat instanceof PersianCat) {
            PersianCat persianCat = (PersianCat) cat;
            persianCat.playBall();
        } else if(cat instanceof BritishShortHairs) {
            BritishShortHairs britishShortHairs = (BritishShortHairs) cat;
            britishShortHairs.playRice();
        } else if(cat instanceof RagDollCat) {
            RagDollCat ragDollCat = (RagDollCat) cat;
            ragDollCat.playWool();
        }

    }
}
