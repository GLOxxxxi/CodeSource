package clazzcode.classcode0912;

/**
 * 异常测试类 GetMessageExceptionTest ，用自定义异常 GetMessageException 判断
 * 新传进来信息进行对比，对比不成功抛出异常，在main方法中
 * 捕捉异常，打印异常名和地址
 */
public class GetMessageExceptionTest {

    public static void main(String[] args) {
        // 超出内存范围的数值
        String message = "该吃饭了";
        try {
            if (getMessage(message)) {
                System.out.println(message);
            }
        } catch (GetMessageException e) {
            System.out.println(e.getMessage()); // 给用户看的
            e.printStackTrace(); // 用于代码追踪
            System.out.println(e); // 给程序员看的
        }
        // 获取对等的消息
        message = "该玩了";
        try {
            if (getMessage(message)) {
                System.out.println(message + ",对咯");
            }
        } catch (GetMessageException e) {
            e.printStackTrace();
        }

    }

    /**
     * 对比获取到的信息是否对等 getMessage 不对等抛出异常
     * @param message 是否式对的信息
     * @return 是否大于标准
     * @throws GetMessageException 数据太大异常
     */
    public static boolean getMessage(String message) throws GetMessageException {
        String correctMessage = "该玩了"; // 定义一个标准
        // 比较数据
        if (!correctMessage.equals(message)) {
            // 抛出异常
            throw new GetMessageException("信息不对等" + message);
        }
        return true;

    }
}
