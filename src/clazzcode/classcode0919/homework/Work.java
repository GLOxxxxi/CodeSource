package clazzcode.classcode0919.homework;

import java.io.File;
import java.util.Arrays;

public class Work {
    /** 文件大小 */
    private static long length2;

    public static void main(String[] args) {

        /*
        1. 写一个方法，传入一个文件夹对象File file，删除当前文件夹中全部内容【必做】
	    【注意：要将当前文件夹删掉，注意删除方法的位置】
         */
        File file = new File("E:\\新建文件夹\\第4组0918作业");
//        deleteAll(file);


        /*
        2. 写一个方法，传入一个文件夹对象File file，统计该文件夹大小（递归）（中级）
            可能会使用到的方法：length() 、isFile()、isDirectory() 、listFiles(...)【选做】
            方法：至少有3种，只要会一种即可
            方法1：静态的
            方法2：两个参数，一个File对象，一个文件大小
            方法3：参考getSum
         */
        long sum = getSum(file);
        long sum1 = getSum(file,0);
        System.out.println("文件夹大小：" + sum);
        System.out.println("静态成员变量：" + length2);
        System.out.println("两个参数：" + sum1);

    }

    /**
     * 删除文件夹中所有的文件包括当前文件夹
     * 先遍历文件夹，打开到文件最子目录，删除里面的文件，同时删除当前文件夹。因为是递归，
     * 在最子目录先删除完了之后才会执行对父级目录的删除操作，这时因为子目录已经被删完了，
     * 所以父级目录也可以直接删除。达到包含当前文件夹一起删除的目的
     * @param file 需要删除的文件夹。
     */
    private static void deleteAll(File file) {
        // 判断传进来的文件是否存在
        if (file == null || !file.exists()) {
            return;
        }
        // 调用方法获取文件夹中所有文件，装进数组里
        File[] allFiles = file.listFiles();
        // 判断文件数组是否是空的
        if (allFiles != null) {
            for (File f : allFiles) {
                // 判断是不是文件夹
                if (f.isDirectory()) {
                    // 如果是文件夹 进行递归打开文件夹
                    deleteAll(f);
                } else {
                    // 如果是文件，直接删除
                    boolean delete = f.delete();
                    System.out.println(f + "======" + delete);
                }
            }
        }
        // 递归到最后的文件夹中所有的文件已经被清空，所以可以直接被删除。
        boolean delete = file.delete();
        System.out.println("传进来的文件删除状态：" + delete);
    }

    /**
     * 计算文件夹的大小，遍历文件夹，遇到文件将文件的大小加起来，遇到文件夹递归计算里面文件的大小返回
     * @param file 需要计算大小的文件夹
     * @return 文件夹的大小
     */
    public static long getSum(File file) {
        // 存储文件大小
        long allLarge = 0L;
        // 判断文件是否为空，空直接返回方法
        if (file == null || !file.exists()) {
            return -1;
        }
        // 将文件夹中的文件存到数组
        File[] files = file.listFiles();
        // 判断文件数组是不是空
        if (files != null) {
            // 遍历文件夹
            for (File f : files) {
                // 判断是不是文件 如果是文件累加大小
                if (f.isFile()) {
                    length2 += f.length();
                   allLarge += f.length();

                } else {
                    // 如果是文件夹，要累加之前遍历到的文件和当前文件夹中的文件大小，进行递归
                    allLarge =  getSum(f) + allLarge;
                }
            }
        }
        // 返回文件夹中文件的大小
        return allLarge;
    }

    public static long getSum(File file, long large) {

        // 判断文件是否为空，空直接返回方法
        if (file == null || !file.exists()) {
            return -1;
        }
        // 将文件夹中的文件存到数组
        File[] files = file.listFiles();
        // 判断文件数组是不是空
        if (files != null) {
            // 变量保存进来时候文件的大小
            long len = large;
            // 遍历文件夹
            for (File f : files) {

                // 判断是不是文件 如果是文件累加大小
                if (f.isFile()) {
                    large += f.length();
                } else {
                    // 如果是文件夹，要累加之前遍历到的文件和当前文件夹中的文件大小，进行递归
                   large = getSum(f, len) + large;
                }
            }
        }
        return large;
    }

}
