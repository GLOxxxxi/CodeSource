package clazzcode.classcode0922.third;

import java.io.*;

/**
 * 缓冲流测试类
 */
public class BufferedFileTest {
    public static void main(String[] args) {
        try(
                // 创建缓冲流输入对象传入字符输入流对象
                BufferedReader br = new BufferedReader(new FileReader("ava.txt"));
                // 创建输出缓冲流对象传入字符输出流对象
                BufferedWriter bw = new BufferedWriter(new FileWriter("javava"));
        ) {
            // 接收每一行数据
            String line;
            // 循环读取整行数据
            if ((line = br.readLine()) != null) {
                // 写入读取到的每一行
                bw.write(line);
                // 换行
                bw.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
