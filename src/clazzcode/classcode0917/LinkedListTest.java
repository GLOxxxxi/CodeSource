package clazzcode.classcode0917;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedList 测试类 LinkedListTest
 * 调用测试 LinkedList 方法，有链表特性还有栈特性
 */
public class LinkedListTest {

    public static void main(String[] args) {
        /*
		 * 构造方法
		 * 		LinkedList() 构造一个空列表。
				LinkedList(Collection c) 构造一个包含指定集合的元素的列表，按照它们由集合的迭代器返回的顺序。
		 */
        LinkedList list = new LinkedList();

        // 常用方法：
        // void push(E e) 元素入栈（栈的特点）  相当于ArrayList中add方法
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("E");
        list.push("F");
        list.push("G");
        // [G, F, E, D, C, B, A]
        System.out.println(list);

        // 获取并且删除栈首元素
		System.out.println(list.pop());
        // 以下方法自己练习
        // boolean add(E e) 将指定的元素追加到此列表的末尾。
        list.add("T");
        System.out.println("add(E e)：" + list);
        // void add(int index, E element) 在此列表中的指定位置插入指定的元素。
        list.add(2, "O");
        System.out.println("add(int index, E element)：" + list);
        // boolean addAll(Collection<? extends E> c) 按照指定集合的迭代器返回的顺序将指定集合中的所有元素追加到此列表的末尾。
        ArrayList list1 = new ArrayList();
        list1.add("BzzB");
        list.addAll(list1);
        System.out.println("addAll(Collection<? extends E> c)：" + list);
        // boolean addAll(int index, Collection<? extends E> c) 将指定集合中的所有元素插入到此列表中，从指定的位置开始。
        list.addAll(0, list1);
        System.out.println("addAll(int index, Collection<? extends E> c)：" + list);
        // boolean contains(Object o) 如果此列表包含指定的元素，则返回 true 。
        System.out.println("contains(Object o)：" + list.contains("BzzB"));
        // E get(int index) 返回此列表中指定位置的元素。
        System.out.println("get(int index)：" + list.get(0));
        // int indexOf(Object o) 返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
        System.out.println("indexOf(Object o)：" + list.indexOf("BzzB"));
        // int lastIndexOf(Object o) 返回此列表中指定元素的最后一次出现的索引，如果此列表不包含元素，则返回-1。
        System.out.println("返回此列表中指定元素的最后一次出现的索引：" + list.lastIndexOf("BzzB"));
        // E remove() 检索并删除此列表的头（第一个元素）。
        list.remove();
        System.out.println("检索并删除此列表的头：" + list);
        // E remove(int index) 删除该列表中指定位置的元素。
        list.remove(8);
        System.out.println("删除该列表中指定位置的元素：" + list);
        // boolean remove(Object o) 从列表中删除指定元素的第一个出现（如果存在）。
        list.remove("BzzB");
        System.out.println("从列表中删除指定元素的第一个出现：" + list);
        // E set(int index, E element) 用指定的元素替换此列表中指定位置的元素。
        list.set(0, "晚晚");
        System.out.println("用指定的元素替换此列表中指定位置的元素：" + list);
        // int size()  返回此列表中的元素数。
        System.out.println("返回此列表中的元素数：" + list.size());
        // Object[] toArray()  将集合对象转换为数组
        Object[] objects = list.toArray();
        System.out.println("将集合对象转换为数组：" + Arrays.toString(objects));
        // void clear() 从列表中删除所有元素。
        list.clear();
        System.out.println("从列表中删除所有元素：" + list);

        // void addFirst(E e) 在该列表开头插入指定的元素。
        list.addFirst("嘿嘿...");
        // void addLast(E e) 将指定的元素追加到此列表的末尾。
        list.addLast("晚晚");
        // E element() 检索但不删除此列表的头（第一个元素）。
        Object element = list.element();
        System.out.println("检索但不删除此列表的头：" + element);
        // E getFirst() 返回此列表中的第一个元素。
        Object first = list.getFirst();
        System.out.println("返回此列表中的第一个元素：" + first);
        // E getLast() 返回此列表中的最后一个元素。
        Object last = list.getLast();
        System.out.println("返回此列表中的最后一个元素：" + last);
        // ListIterator<E> listIterator(int index) 从列表中的指定位置开始，返回此列表中元素的列表迭代器（按适当的顺序）。
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        // boolean offer(E e) 将指定的元素添加为此列表的尾部（最后一个元素）。
        list.offer("然然");
        System.out.println("将指定的元素添加为此列表的尾部：" + list);
        // boolean offerFirst(E e) 在此列表的前面插入指定的元素。
        list.offerFirst("a-soul");
        System.out.println("在此列表的前面插入指定的元素：" + list);
        System.out.println("在此列表的前面插入指定的元素：" + list);
        // boolean offerLast(E e) 在该列表的末尾插入指定的元素。
        list.offerLast("乃琳");
        System.out.println("在该列表的末尾插入指定的元素：" + list);
        // E peek() 检索但不删除此列表的头（第一个元素）。
        Object peek = list.peek();
        System.out.println("检索但不删除此列表的头：" + peek);
        // E peekFirst() 检索但不删除此列表的第一个元素，如果此列表为空，则返回 null 。
        Object o = list.peekFirst();
        System.out.println("检索但不删除此列表的第一个元素：" + o);
        // E peekLast() 检索但不删除此列表的最后一个元素，如果此列表为空，则返回 null 。
        Object o1 = list.peekLast();
        System.out.println("检索但不删除此列表的最后一个元素：" + o1);

        // E poll() 获取并删除此列表的头（第一个元素）。
        Object poll = list.poll();
        System.out.println("获取并删除此列表的头：" + list + ",删除的第一个元素:" + poll);
        // E pollFirst()检索并删除此列表的第一个元素，如果此列表为空，则返回 null 。
        Object o2 = list.peekFirst();
        System.out.println("获取并删除此列表的头：" + list + ",第一个元素:" + o2);
        // E pollLast()检索并删除此列表的最后一个元素，如果此列表为空，则返回 null 。
        Object o3 = list.pollLast();
        System.out.println("获取并删除此列表的头：" + list + ",最后一个元素:" + o3);
        // E removeFirst() 从此列表中删除并返回第一个元素。
        System.out.println("从此列表中删除并返回第一个元素：" + list.removeFirst());
        // E removeLast() 从此列表中删除并返回最后一个元素。
        System.out.println("从此列表中删除并返回最后一个元素：" + list.removeLast());
    }
}
