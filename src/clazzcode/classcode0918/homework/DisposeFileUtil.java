package clazzcode.classcode0918.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * 读写文件工具类 DisposeFileUtil 将map写入指定文件，通过文件名获取指定的value
 */
public class DisposeFileUtil {

    /**
     * 写入硬盘
     * @param fileName 写入的文件名
     * @param entry 传入的键值对
     * @param <T> 泛型hashmap
     * @throws FileNotFoundException 未找到文件
     */
    public static<T> void writeToDisk(String fileName, HashMap<T, T> entry) throws FileNotFoundException {
        // 创建配置类文件
        Properties properties = new Properties();
        // 遍历将键值对传入配置文件中
        entry.forEach((key, value) -> properties.setProperty(String.valueOf(key), String.valueOf(value)));
        // 创建写入流
        PrintStream printStream = new PrintStream(fileName);
        // 将配置文件写入硬盘
        properties.list(printStream);

    }

    /**
     * 读取从配置文件中的想要的键值对的值
     * @param fileName 想要获取的文件名
     * @param keys 传入的键值
     * @throws IOException IO异常
     */
    public static void readFromDisk(String fileName, String... keys) throws IOException {
        // 创建文件写入流
        FileInputStream fis = new FileInputStream(fileName);
        // 创建配置文件类
        Properties properties = new Properties();
        // 配置文件加载写入流
        properties.load(fis);
        // 遍历键值数组，通过键值获取对应值
        for (String key : keys) {
            System.out.println(key + "--" + properties.get(key));
        }

    }
}
