package clazzcode.classcode0917;

import java.util.*;

/**
 * Collections 集合工具测试类 CollectionsTest
 * 调用Collections中的方法
 */
public class CollectionsTest {

    public static void main(String[] args) {
        // 1.static boolean addAll(Collection c, Object... elements)将所有指定的元素添加到指定的集合。
        ArrayList list = new ArrayList();

		/*
		 * 构造方法：
		 * 		1. ArrayList() 构造一个初始容量为十的空列表。
				2. ArrayList(Collection c) 构造一个包含指定集合的元素的列表，按照它们由集合的迭代器返回的顺序。
				3. ArrayList(int initialCapacity) 构造具有指定初始容量的空列表。
					如果可以预估集合可以装多少个元素，就要设置大小，节省数组扩容时间，提升效率
		 */
        Collections.addAll(list, 1, 2, "", true);
        System.out.println(list);
        // 2.static void fill(List list, Object obj)用指定的元素obj代替指定集合list中的所有元素。(批量初始化)
        Collections.fill(list, 3);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(8);
        list.add(9);
        // 3.static Object max(Collection coll)根据自然顺序返回给定集合coll的最大元素。（注意：元素必须是同一种类型,且实现Comparable接口）
        Comparable max = Collections.max(list);
        System.out.println(max);

        // 4.static Object max(Collection coll, Comparator comp)据定制排序comp，返回给定集合coll中的最大元素。（注意：元素必须是同一种类型）
        Integer max1 = Collections.max(list, (Comparator<Integer>) (o1, o2) -> o1 - o2);
        System.out.println("返回给定集合coll中的最大元素：" + max1);
        // 5.static Object min(Collection coll)根据自然顺序返回给定集合coll的最小元素。（注意：元素必须是同一种类型,且实现Comparable接口）
        Comparable min = Collections.min(list);
        System.out.println("根据自然顺序返回给定集合coll的最小元素：" + min);
        // 6.static Object min(Collection coll, Comparator comp)据定制排序comp，返回给定集合coll中的最小元素。（注意：元素必须是同一种类型）
        Collections.min(list, (Comparator<Integer>) (o1, o2) -> o2 - o1);
        System.out.println("自然排序的最小的元素：" + min);
        // 7.static void reverse(List list)反转指定集合list中元素的顺序。
        System.out.println("反转前：" + list);
        Collections.reverse(list);
        System.out.println("反转指定集合list中元素的顺序：" + list);
        // 8.static void shuffle(List list)将集合中list中元素的随机打乱顺序，常常用来洗牌。
        Collections.shuffle(list);
        System.out.println("将集合中list中元素的随机打乱顺序：" + list);
        // 9.static void sort(List list) 将list集合升序排序。（注意：元素必须是同一种类型）
        Collections.sort(list);
        System.out.println("将list集合升序排序：" + list);
        // 10.static void sort(List list, Comparator c)根据指定的比较器c对指定的集合list进行排序。（注意：元素必须是同一种类型）
        Collections.sort(list, (Comparator<Integer>) (o1, o2) -> o2 - o1);
        System.out.println("根据指定的比较器c对指定的集合list进行排序：" + list);
        // 11.static void swap(List list, int i, int j)交换集合list中下标i和下标j的元素位置。
        System.out.println("交换集合元素之前：" + list);
        Collections.swap(list, 0, 9);
        System.out.println("交换集合之后：" + list);

        // 12.static List synchronizedList(List list)将list对象转换为线程安全的。
        List synchronizedList = Collections.synchronizedList(list);

        // 13.static Map<K,V> synchronizedMap(Map<K,V> m)将map对象转换为线程安全的。
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> synMap = Collections.synchronizedMap(map);

        // 14.static Set<T> synchronizedSet(Set s)将set对象转换为线程安全的。
        Set set = new HashSet();
        Set synSet = Collections.synchronizedSet(set);

    }
}
