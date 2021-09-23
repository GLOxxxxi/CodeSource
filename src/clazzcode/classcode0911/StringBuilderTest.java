package clazzcode.classcode0911;

public class StringBuilderTest {

    public static void main(String[] args) {
     /*
     * 常用方法：
        1. StringBuilder append(Object obj) 在队尾添加字符串
        2. StringBuilder delete(int start, int end)  删除指定起始和结束位置之间的字符（含头不含尾）
        3. StringBuilder deleteCharAt(int index) 删除指定下标处的字符
        4. StringBuilder insert(int offset, Object obj) 在指定下标处插入一个任意类型数据
        5. StringBuilder reverse()将字符串翻转
        6. void setCharAt(int index, char ch) 修改指定下标处的字符为ch
        7. void setLength(int newLength)  设置字符串长度是newLength
        8. trimToSize() 将所有没有使用的数组空间去除	。 如果使用setLength,该方法无效
        9. int capacity() 返回当前容量。(理论值)
        10.public int length()返回长度(实际值，即已经存储的字符个数)
      */
        StringBuilder sb = new StringBuilder();
        // append 方法追加字符串
        sb.append("wan wan,hu wu");
        System.out.println("原串：" + sb);
        // delete 方法删除指定开始的位置到结束的为止
        sb.delete(7, 10);
        System.out.println("删除一段字符串：" + sb);
        // 删除指定下标元素
        sb.deleteCharAt(6);
        System.out.println("删除指定字符串：" + sb);
        // 插入指定字符串
        sb.insert(6, "nn");
        System.out.println("插入字符串：" + sb);
        // 字符串反转
        System.out.println("字符串反转：" + sb.reverse());
        // 设置新字符串的长度
        sb.setLength(11);
        System.out.println("设置新长度后：" + sb);
        // 去除字符串的空格
        sb.trimToSize();
        System.out.println("去除空格后" + sb);
        // 返回容量
        System.out.println("返回容量：" + sb.capacity());
        // 返回长度
        System.out.println("返回长度：" + sb.length());


    }
}
