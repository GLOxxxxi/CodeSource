package clazzcode.classcode0915.linkedlist;

public class LinkedListDemoTest {

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        list.add("str");
        list.add(11);
        list.add(13);
        System.out.println("添加元素后：" + list);
        System.out.println("添加元素后集合大小：" + list.size());
        Object byIndex = list.getByIndex(0);
        System.out.println("指定下标元素：" + byIndex);
        list.updateByIndex(1, "晚晚");
        System.out.println("指定下标更新后：" + list);
        list.deleteByIndex(0);
        System.out.println("指定下标删除后：" + list);
        list.insertByIndex(0, "ava");
        System.out.println("插入指定下标之后的：" + list);
        int indexOf = list.getIndexOf(1);
        System.out.println("元素第一次出现在集合中的下标值：" + indexOf);
        list.clear();
        System.out.println("清空集合之后：" + list);


    }
}
