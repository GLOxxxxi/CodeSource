package clazzcode.classcode0922;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * IO工具类，IO的关流
 */
public class IOUtils {

    /**
     * 关流工具类，关闭穿进来的流
     * @param closeable 需要关闭的流
     */
    public static void close(Closeable closeable) {
        try {
            // 判断传进来的对象是否是空
            if (closeable != null) {
                closeable.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
