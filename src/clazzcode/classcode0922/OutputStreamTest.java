package clazzcode.classcode0922;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件输出流测试
 */
public class OutputStreamTest {

    public static void main(String[] args) {
        // 创建文件输出流
        FileOutputStream fos = null;
        try {
            // 创建文件输出流对象
            fos = new FileOutputStream("F:\\workspace\\coder\\ava.txt");
            // 创建需要输出的内容
            String str = "下雨天了怎么办";
            // 将输出的字符串转换成字节数组
            byte[] b = str.getBytes();
            // 将字节数组文件写入
            fos.write(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关流
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
