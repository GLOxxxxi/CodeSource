package clazzcode.classcode0922.first;

import clazzcode.classcode0922.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制测试，在内存中操作文件输入流直接文件输出，让文件复制到指定文件目录上
 */
public class CopyFileSteamTest {
    public static void main(String[] args) {
        // 创建文件输入流
        FileInputStream fis = null;
        // 创建文件输出流
        FileOutputStream fos = null;
        try {
            // 创建文件输入流对象
            fis = new FileInputStream("C:\\Users\\11695\\Desktop\\gmz\\晚晚.png");
            // 创建文件输出流对象
            fos = new FileOutputStream("ava.png");
            // 创建存放字节的数组
            byte[] b = new byte[1024];
            // 记录数组长度
            int count;
            // 循环读取文件字节
            while ((count = fis.read(b)) != -1) {
                // 将读取的文件通过文件输出流重新写出，相当于复制了读取的文件数据
                fos.write(b, 0, count);
            }
            System.out.println("文件复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭文件输出流 文件流先开后关

            IOUtils.close(fos);
            IOUtils.close(fis);
           /* try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 关文件输入流
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }*/
        }
    }

}
