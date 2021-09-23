package clazzcode.classcode0922;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 自动关流结构测试类
 */
public class AutoCloseableTest {
    public static void main(String[] args) {
        try (
                FileReader fr = new FileReader("ava.txt");
                FileWriter fw = new FileWriter("wan.txt")
        ) {
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
