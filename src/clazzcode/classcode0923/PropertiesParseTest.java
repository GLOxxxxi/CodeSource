package clazzcode.classcode0923;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesParseTest {

    public static void main(String[] args) {
        // 创建配置文件对象
        Properties properties = new Properties();
        try (
                // 创建字节流对象
                FileInputStream fis = new FileInputStream("resource/laowang.properties")
        ) {

            properties.load(fis);
            String str = properties.getProperty("xiangwan");
            System.out.println("通过key获取资源文件夹的配置文件：" + str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
