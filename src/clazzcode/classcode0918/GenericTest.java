package clazzcode.classcode0918;

import java.util.Arrays;

/**
 * 泛型测试类GenericTest 调用泛型方法
 */
public class GenericTest {
    public static void main(String[] args) {
        Integer[] ints1 = {1, 2, 7, 8};
        Integer[] ints2 = {5, 2, 5, 9};
        Integer[] merge = mergeAndSort(ints1, ints2);
        System.out.println("合并排序后：" + Arrays.toString(merge));

        String[] str1 = {"a", "d"};
        String[] str2 = {"c", "b"};
        String[] strings = mergeAndSort(str1, str2);
        System.out.println("合并后：" + Arrays.toString(strings));
    }

    /**
     * 泛型类型的方法，允许任何类型的数组
     * @param arr1 第一个数组
     * @param arr2 第二个数组
     * @param <T> 数组类型
     * @return 合并排序后的数组
     */
    public static<T> T[] mergeAndSort(T[] arr1, T[] arr2) {
        // 当传入的数组为空的时候 抛出异常
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("非法数据异常");
        }
        // 将数组增容
        T[] ts = Arrays.copyOf(arr1, arr1.length + arr2.length);
        // 数组复制
        System.arraycopy(arr2, 0, ts, arr1.length, arr2.length);
        // 数组排序
        Arrays.sort(ts);
        return ts;
    }

    /**
     * 泛型类型上限Number 不能是number子类类型的不能调用方法
     * @param arr1 第一个数组
     * @param arr2 第二个数组
     * @param <T> 数组类型
     * @return 合并排序后的数组
     */
    public static<T extends Number> T[] merge(T[] arr1, T[] arr2) {
        // 当传入的数组为空的时候 抛出异常
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("非法数据异常");
        }
        // 将数组增容
        T[] ts = Arrays.copyOf(arr1, arr1.length + arr2.length);
        // 数组复制
        System.arraycopy(arr2, 0, ts, arr1.length, arr2.length);
        // 数组排序
        Arrays.sort(ts);
        return ts;
    }
}

/**
 * 泛型类
 * @param <T> 泛型
 */
class Point<T> {
    T x;
    T y;
}