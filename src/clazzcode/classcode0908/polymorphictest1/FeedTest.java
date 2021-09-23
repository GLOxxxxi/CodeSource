package clazzcode.classcode0908.polymorphictest1;

/**
 * 喂食测试类FeedTest,包含创建了三个Cat子类的对象并向上造型,调用实现重写之后的eat方法,通过feedCat方法向下造型调用子类各自的方法
 */
public class FeedTest {

    public static void main(String[] args) {
        // 向上造型创建三个Cat子类对象
        Cat persian = new PersianCat();
        Cat ragDoll = new RagDollCat();
        Cat british = new BritishShortHairs();

        // 创建Master类调用feedCat方法,传入对应的Cat子类对象
        Master master = new Master();
        System.out.println("============波斯猫==============");
        master.feedCat(persian);
        System.out.println("============布偶猫==============");
        master.feedCat(ragDoll);
        System.out.println("============英国短毛猫==============");
        master.feedCat(british);
    }
}
