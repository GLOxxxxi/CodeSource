package clazzcode.classcode0908.homework;
/**
 * 开门测试类OpenDoorTest ,包含创建门类三个对象,分别调用开门,关门方法
 */
public class OpenDoorTest {
    public static void main(String[] args) {
        System.out.println("=============卷门===============");
        // 创建卷门对象
        RollingDoor rollingDoor = new RollingDoor();
        // 调用卷门开关门方法
        rollingDoor.openDoor();
        rollingDoor.closeDoor();

        System.out.println("=============安全门===============");
        // 创建安全门对象
        SecurityDoor securityDoor = new SecurityDoor();
        // 调用安全门开关门方法
        securityDoor.openDoor();
        securityDoor.closeDoor();

        System.out.println("=============智能门===============");
        // 创建智能门对象
        AiDoor aiDoor = new AiDoor();
        // 调用智能门开关门方法
        aiDoor.openDoor();
        aiDoor.closeDoor();
    }
}
