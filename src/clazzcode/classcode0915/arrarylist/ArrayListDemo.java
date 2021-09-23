package clazzcode.classcode0915.arrarylist;

import java.util.Arrays;

public class ArrayListDemo {

    /** 元素个数 */
    private int size;

    /** 默认数组长度常量 */
    private final int DEFAULT_CAPACITY = 10;

    /** 对象数组长度是默认值 */
    private Object[] value = {};

    public ArrayListDemo() {
        value = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 有参构造 初始化大小
     * @param initCapacity 集合大小
     */
    public ArrayListDemo(int initCapacity) {
        value = new Object[initCapacity];
    }

    /**
     * 返回当前元素个数
     * @return 元数个数
     */
    public int size() {
        return size;
    }

    /**
     * 数组添加元素
     * @param obj 需要添加的元素
     */
    public void add(Object obj) {
        // 判断是否需要增容
        growArrayCapacity();
        value[size++] = obj;
    }

    /**
     * 将数组扩容1.5倍
     */
    private void growArrayCapacity() {
        // 判断当前元素是否到达数组长度,增减或者插入的时候都先判断size 是否已经到达临界值，不能先将size++否则size一直大于数组长度
        if (size == value.length) {
            // 扩容1.5倍
            value = Arrays.copyOf(value, value.length + (value.length >> 1));
        }
    }

    /**
     * 重写 toString
     * @return 字符串格式的数组
     */
    @Override
    public String toString() {
        // 缩容数组，不用将扩容之后的剩余的null打印出来
        Object[] objects = Arrays.copyOf(value, size);
        return Arrays.toString(objects);
    }

    /**
     * 通过下标获取元素
     * @param index 指定的下标
     * @return 下标代表的元素
     */
    public Object getByIndex(int index) {
        // 检查下标是否在数组下标之内
        checkIndex(index);
        return value[index];
    }

    /**
     * 检查给定的下标是否超出数组下标范围抛出异常
     * @param index 下标
     */
    private void checkIndex(int index) {
        // 判断是否超出下标范围
        if (index < 0 || index > size) {
            // 抛出异常
            throw new ArrayIndexOutOfBoundsException("越界，正常范围：" + "0~" + size + ",你的下标：" + index);
        }
    }


    /**
     * 通过指定下标删除下标代表的元素
     * @param index 指定的下标
     */
    public void deleteByIndex(int index) {
        checkIndex(index);
        // 将指定下标之后的元素复制到value中覆盖之前的元素，最后会多一个元素
        /*参数列表,
        * 源数组——
        * 源数组下标，因为要删除下标元素，所以会从下标之后以为开始复制——
        * 目标数组，可以将源数组设为目标数组，就在源数组上进行元素的赋值——
        * 目标数组下标，因为是之前下标元素已经被删除，所以从目标下标出开始复制——
        * 复制长度，要复制的长度是从下标之后的所有元素，具体的长度是 size - index - 1，-1减去删除元素的位置
        *
        * */
        System.arraycopy(value, index + 1, value, index, size - index - 1);
        // 删除之后 size - 1
        size--;
    }

    public void updateByIndex(int index, Object obj) {
        checkIndex(index);
        value[index] = obj;

    }

    /**
     * 获取元素第一次出现在数组中的下标
     * @param o 想要获取的元素
     * @return 下标
     */
    public int getIndexByObject(Object o) {
        // 先判断传进来的对象时候为null，null只能用 == 比较，其他的对象可以用equals
        if (o == null) {
            // 遍历数组 查找对应元素是null
            for (int i = 0; i < value.length; i++) {
                if (null == value[i]) {
                    // 返回下标
                    return i;
                }
            }
        } else {
            for (int i = 0; i < value.length; i++) {
                if (o.equals(value[i])) {
                    return i;
                }
            }
        }
        // 没找到返回 -1
        return -1;
    }

    /**
     * 10.插入指定下标处一个指定元素 void insertByIndex(int index,Object obj)
     *    也要考虑3种情况，首、尾和中间
     * @param index 需要插入的下标
     * @param obj 需要插入的元素
     */
    public void insertByIndex(int index, Object obj) {
        // 检查下标是否超出下标范围
        checkIndex(index);
        // 判断增加数组长度之后是否到达临界值
        growArrayCapacity();
        /*
        参数列表
        源数组——
        源数组组下标，因为是插入元素，复制是从当前下标开始到最后都要复制——
        目标数组，目标数组是自身就可以在源数组上面重新赋值——
        目标数组下标，从给定的下标后一位开始复制元素，
        复制长度，源数组的给定下标之后都要复制，所以要复制的长度是 总长度 - 下标
         */
        System.arraycopy(value, index, value, index + 1, size - index);
        // 将传进来的新obj给指定下标代表的元素赋值
        value[index] = obj;
        // 增加数组长度
        size++;

    }

    /**
     * 判断集合是否为空
     * @return true false
     */
    public boolean isEmpty() {
        // size 为 0 没有元素即空
        return size == 0;
    }

    /**
     * 元素是否存在在集合中
     * @param obj 想要查找的元素
     * @return 是否存在
     */
    public boolean contains(Object obj) {
        return getIndexByObject(obj) >= 0;
    }

    /**
     * 清除集合中所有的元素
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            value[i] = null;
        }
        size = 0;
    }
}
