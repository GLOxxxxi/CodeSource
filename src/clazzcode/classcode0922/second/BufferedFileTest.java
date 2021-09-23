package clazzcode.classcode0922.second;

import java.io.*;

/**
 * 缓冲流测试类
 */
public class BufferedFileTest {
    public static void main(String[] args) {
        try (
                // 创建字符输入输出流对象
                FileReader fr = new FileReader("wan.txt");
                FileWriter fw = new FileWriter("wanwan.txt");
                // 创建字符输入输出缓冲流对象，将字符输入输出流对象传进区，默认数组大小时8192
                BufferedReader br = new BufferedReader(fr);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {
            String line;
            // 循环读取字符，每次读取都是读取一行的字节
            while ((line = br.readLine()) != null) {
                // 将字符重新写出
                bw.write(line);
                // 写出一行之后换行
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
