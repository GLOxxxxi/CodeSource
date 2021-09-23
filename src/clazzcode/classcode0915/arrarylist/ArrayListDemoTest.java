package clazzcode.classcode0915.arrarylist;

/**
 * 集合ArrayList测试类 ArrayListDemoTest
 * 集合的创建，元素的增删改查插入，判断是否存在，返回存在的下标位置，清空集合。
 */
public class ArrayListDemoTest {

    public static void main(String[] args) {
        ArrayListDemo list = new ArrayListDemo();
        boolean empty = list.isEmpty();
        System.out.println("是否为空：" + empty);
        // ArrayList 添加数据
        list.add("abb");
        list.add(null);
        list.add(1);
        list.add(1.2);
        list.add(1.21);
        list.add(1.22);
        list.add(1.232);
        list.add('c');
        list.add(1.2);
        list.add("1.2");
        list.add(1.11);
        // 获取当前list的size
        int size = list.size();
        System.out.println("list的size：" + size);
        // 重写 ArrayList 的 toString 方法
        System.out.println(list);
        // ArrayList 查询方法
        // 越界的下标
//        Object byIndex = list.getByIndex(13);
//        System.out.println("元素：" + byIndex);
        // ArrayList 删除指定下标元素
        list.deleteByIndex(10);
        System.out.println("删除之后的list：" + list);
        // ArrayList 更新指定下标元素
        list.updateByIndex(5, "ava");
        System.out.println("更新之后的list：" + list);

         // 查找指定元素第一次出现的下标位置
        int indexOf = list.getIndexByObject(null);
        System.out.println("指定元素：" + null + ",下标位置：" + indexOf);

        /*
        *  10.插入指定下标处一个指定元素 void insertByIndex(int index,Object obj)
        * 也要考虑3种情况，首、尾和中间
        * */

        // 插入元素在指定下标
        list.insertByIndex(1, 'a');
        System.out.println("插入元素：" + 'a' + "，在下标位置：" + 1 + "，之后的list：" + list);

        // 判断集合中是否存在元素
        boolean contains = list.contains("abb");
        System.out.println("元素：" + "abb" + "，是否存在在集合中：" + contains);

        // 清除集合中所有的元素
        list.clear();
        System.out.println("清空之后的集合：" + list);
    }
}
