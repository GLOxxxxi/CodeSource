package clazzcode.classcode0912;

/**
 * 异常测试类 DirectionExceptionTest ，用自定义异常 DirectionException判断
 * 新传进来就离进行对比是否在危险范围内，对比成功抛出异常，在main方法中
 * 捕捉异常，打印异常名和地址
 */
public class DirectionExceptionTest {

    public static void main(String[] args) {
        // 超出内存范围的数值
        int direction = 394;
        try {
            if (compareDirection(direction)) {
                System.out.println(direction);
            }
        } catch (DirectionException e) {
            System.out.println(e.getMessage()); // 给用户看的
            e.printStackTrace(); // 用于代码追踪
            System.out.println(e); // 给程序员看的
        }
        // 超出危险距离的
        direction = 599;
        try {
            if (compareDirection(direction)) {
                System.out.println(direction + ",已超出范围，安全！");
            }
        } catch (DirectionException e) {
            e.printStackTrace();
        }

    }

    /**
     * 对比获取到的信息是否对等 compareDirection 不对等抛出异常
     * @param direction 是否式对的信息
     * @return 是否大于标准
     * @throws DirectionException 数据太大异常
     */
    public static boolean compareDirection(int direction) throws DirectionException {
        // 比较数据
        if (direction > 200 && direction < 400) {
            // 抛出异常
            throw new DirectionException("锁定范围了，" + direction);
        }
        return true;

    }
}
