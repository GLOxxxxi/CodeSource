package clazzcode.classcode0912;

/**
 * 异常测试类 MemoryCacheExceptionTest ，用自定义异常 MemoryCacheException 判断
 * 新传进来内存值进行对比，大于已有内存抛出异常，在main方法中
 * 捕捉异常，打印异常名和地址
 */
public class MemoryCacheExceptionTest {

    public static void main(String[] args) {
        // 超出内存范围的数值
        String memory = "1025KB";
        try {
            if (memoryCache(memory)) {
                System.out.println(memory + ",太大了");
            }
        } catch (MemoryCacheException e) {
            System.out.println(e.getMessage()); // 给用户看的
            e.printStackTrace(); // 用于代码追踪
            System.out.println(e); // 给程序员看的
        }
        // 没超的内存
        memory = "1000kb";

        try {
            if (memoryCache(memory)) {
                System.out.println(memory + ",符合规定");
            }
        } catch (MemoryCacheException e) {
            e.printStackTrace();
        }

    }

    /**
     * 对比内存空间是否大于标准溢出 memoryCache 大于抛出异常
     * @param memory 比较的数据
     * @return 是否大于标准
     * @throws MemoryCacheException 数据太大异常
     */
    public static boolean memoryCache(String memory) throws MemoryCacheException {
        String standard = "1024kb"; // 定义一个标准
        int standardCache = Integer.parseInt(standard.substring(0, standard.length() - 2));
        int tempCache = Integer.parseInt(memory.substring(0, standard.length() - 2));
        // 比较数据
        if (tempCache > standardCache) {
            // 抛出异常
            throw new MemoryCacheException("空间不够了：" + memory);
        }
        return true;

    }
}
