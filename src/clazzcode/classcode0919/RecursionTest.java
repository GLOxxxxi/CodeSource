package clazzcode.classcode0919;

import java.io.File;

/**
 * 文件使用递归的方式，打印出所有文件夹下的指定后缀的所有文件
 */
public class RecursionTest {

    public static void main(String[] args) {
        File test = new File("F:/");
        searchFile(test);
    }
    /**
     * 递归查找指定后缀文件
     * @param file 文件夹
     */
    public static void searchFile(File file) {
        // 判断传进来的文件是不是空的
        if (file == null || !file.exists()) {
            // 如果是空的直接返回方法
            return;
        }
        // 将当前文件夹过滤成只有 markdown文件和文件夹
        File[] files = file.listFiles(x -> x.getName().endsWith(".md") || x.isDirectory());
        // 文件数组是否为空
        if (files != null) {
            // 遍历这个文件数组
            for (File f : files) {
                // 判断文件是否为文件夹
                if (f.isDirectory()) {
                    // 递归调用
                    searchFile(f);
                } else {
                    // 不是文件夹就是文件 因为已经被过滤了所以只剩下以xml结尾的文件
                    System.out.println("md文档：" + f);
                }
            }
        }
    }
}


