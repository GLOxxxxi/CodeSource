package clazzcode.classcode0922.third;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 用字符流复制文本文件
 */
public class CopyFileReaderTest {
    public static void main(String[] args) {
        try(
                // 创建字符输入输出流对象
                FileReader fr = new FileReader("ava.txt");
                FileWriter fw = new FileWriter("avvvvvvvvvva.txt")
        ) {
            // 创建读取字符的数组
            char[] c = new char[1024];
            int count;
            // 循环读取文件中的字符
            if ((count = fr.read(c)) != -1) {
                // 写入到指定文件
                fw.write(c, 0, count);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
