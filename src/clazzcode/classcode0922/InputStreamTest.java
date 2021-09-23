package clazzcode.classcode0922;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件输入流测试
 */
public class InputStreamTest {

    public static void main(String[] args) {
        // 创建一个文件输入流 初始化
        FileInputStream fis = null;
        try {
            // 创建一个对象
            fis = new FileInputStream("C:\\Users\\11695\\Desktop\\第4组0919作业\\aas.txt");
            /*  效率太低
            int read = 0;
            while ((read = fis.read()) != -1) {
                System.out.print((char)read);
            }*/
            // 创建字节数组
            byte[] b = new byte[5];
            // 计算读取数组的长度
            int count = 0;
            // 循环读取文件字节
            while ((count = fis.read(b)) != -1) {
                // 调用String的有参构造
                String s = new String(b, 0, count);
                System.out.print(s);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 判断文件是否为空
            if (fis != null) {
                try {
                    // 关闭流
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
