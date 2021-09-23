package clazzcode.classcode0909.testenum;

/**
 * 状态测试类StatusTest， 创建当前状态对象，switch语句选择输出的语句
 */
public class StatusTest {

    public static void main(String[] args) {
        // 创建枚举对象
        StatusEnum driving = StatusEnum.DRIVING;
        // 选择状态，并打印对应的语句
        switch (driving) {
            case BUSY:
                System.out.println("忙碌中...");
                break;
            case ONLINE:
                System.out.println("在线...");
                break;
            case DRIVING:
                System.out.println("开车中...滴滴...");
                break;
            case OFFLINE:
                System.out.println("离线...");
                break;
            case WORKING:
                System.out.println("工作中...");
                break;
        }

    }
}
