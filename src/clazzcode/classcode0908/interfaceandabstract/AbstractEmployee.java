package clazzcode.classcode0908.interfaceandabstract;

/**
 * 抽象类,包含上班下班打卡,必须实现的抽象方法work
 */
public abstract class AbstractEmployee {
    /**
     * 上班打卡方法
     */
    public void clockIn() {
        System.out.println("上班打卡");
    }

    /**
     * 下班打卡方法
     */
    public void clockOut() {
        System.out.println("下班打卡");
    }

    /**
     * 抽象方法 工作
     */
    public abstract void work();

}
