package clazzcode.classcode0911;

import java.util.Arrays;

public class SystemTest {

    public static void main(String[] args) {

        // 试用System.arraycopy()
        // 创建源数组
        int[] src = {0, 1, 2, 2, 5, 6, 7, 8, 9, 7, 8};
        // 目标数组
        int[] dest = new int[20];
        // 调用方法复制数组
        System.arraycopy(src, 5, dest, 7,2);
        System.out.println("复制后：" + Arrays.toString(dest));
        // System.err.println()输出模式 只是让结果变红
        System.err.println(111);
        // 试用System.currentTimeMills()
        long startTime = System.currentTimeMillis();
        // 创建个大点的数组
        int[] newArr = new int[9999999];
        for (int i = 0; i < newArr.length; i++) {
            // 赋值
            newArr[i] = i;
        }
        long endTime = System.currentTimeMillis();
        // 获取这个循环使用的时间，单位毫秒
        System.out.println("数组赋值运行时间：" + (endTime - startTime) + "毫秒");
    }
}
