package clazzcode.classcode0922.second;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 用字符流复制文本文件
 */
public class CopyFileReaderTest {
    public static void main(String[] args) {
        try(
                // 创建字符流输入输出对象
                FileReader fr = new FileReader("avavava.txt");
                FileWriter fw = new FileWriter("avavavava.txt");
        ) {
            // 创建字符数组
            char[] c = new char[1024];
            int count;
            // 循环读取字符
            while ((count = fr.read(c)) != -1) {
                // 将字符重新写出
                fw.write(c, 0, count);
                // 当文件写出满8192自动刷新到磁盘中，在关流的时候也会自动刷新，将缓冲区的字符刷新到磁盘中去。
                fw.flush();
                // 在读取完一段数组之后追加数据
                fw.append("ybb");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
