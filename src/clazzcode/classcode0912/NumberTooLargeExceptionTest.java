package clazzcode.classcode0912;

/**
 * 异常测试类 ExceptionTest ，用自定义异常 NumberTooLargeExceptionTest 判断
 * 新传进来的值是否大于标准，要大于标准，存在抛出异常，在main方法中
 * 捕捉异常，打印异常名和地址
 */
public class NumberTooLargeExceptionTest {

    public static void main(String[] args) {
        // 超出范围的数值
        int num = 101;
        try {
            if (biggerThanStandard(num)) {
                System.out.println(num + ",太大了");
            }
        } catch (NumberTooLargeException e) {
            System.out.println(e.getMessage()); // 给用户看的
            e.printStackTrace(); // 用于代码追踪
            System.out.println(e); // 给程序员看的
        }
        // 没超的数据
        num = 34;

        try {
            if (biggerThanStandard(num)) {
                System.out.println(num + ",符合规定");
            }
        } catch (NumberTooLargeException e) {
            e.printStackTrace();
        }

    }

    /**
     * 对比数据是否大于标准 biggerThanStandard 大于抛出异常
     * @param num 比较的数据
     * @return 是否大于标准
     * @throws NumberTooLargeException 数据太大异常
     */
    public static boolean biggerThanStandard(int num) throws NumberTooLargeException {
        int standard = 100; // 定义一个标准
        // 比较数据
        if (num > standard) {
            // 抛出异常
            throw new NumberTooLargeException("数据太大了：" + num);
        }
        return true;

    }
}