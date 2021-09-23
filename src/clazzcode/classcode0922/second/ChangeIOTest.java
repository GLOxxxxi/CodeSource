package clazzcode.classcode0922.second;

import java.io.*;

/**
 * 转换流测试类，将字节流转换成字符流
 */
public class ChangeIOTest {
    public static void main(String[] args) {
        try(
                // 创建字节流输入输出对象
                FileInputStream fis = new FileInputStream("avaChangeIO.txt");
                FileOutputStream fos = new FileOutputStream("afterAvaChangeIO.txt");
                ) {

            // 调用转换流方法
            changeIO(fis, fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void changeIO(InputStream is, OutputStream os) {
        // 判断字节流是不是空
        if (is == null || os == null) {
            throw new IllegalArgumentException("非法参数异常");
        }
        // 创建字符数组
        char[] c = new char[1024];
        int count;
        try(
                // 创建字符输入输出对象，字节输入输出流作为参数
                InputStreamReader  isr = new InputStreamReader(is);
                OutputStreamWriter osw = new OutputStreamWriter(os);
                ) {
            // 读取文件字节写出到新文件
            while ((count = isr.read(c)) != -1) {
                try {
                    osw.write(c, 0, count);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
