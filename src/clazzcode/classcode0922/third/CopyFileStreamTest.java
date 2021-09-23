package clazzcode.classcode0922.third;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制测试，在内存中操作文件输入流直接文件输出，让文件复制到指定文件目录上
 */
public class CopyFileStreamTest {

    public static void main(String[] args) {
        try(
                // 创建文件输出流对象创建文件输入流对象
                FileInputStream fis = new FileInputStream("ava.txt");
                FileOutputStream fos = new FileOutputStream("avvvvvvvvvvvvva.txt")
        ) {
            // 创建存放字节的数组
            byte[] b = new byte[1024];
            // 记录数组长度
            int count;
            // 循环读取文件字节
            while ((count = fis.read(b)) != -1) {
                // 将读取的文件通过文件输出流重新写出，相当于复制了读取的文件数据
                fos.write(b, 0, count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
