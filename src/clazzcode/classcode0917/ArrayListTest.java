package clazzcode.classcode0917;

import java.io.Serializable;
import java.util.*;

/**
 * 数组集合测试类 ArrayListTest
 * ArrayList 的常用方法
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(5);
        list.add("ava");
        list.add("向晚");
        list.add("bella");
        list.add("贝拉");
        list.add("diana");
        System.out.println(list);

        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("嘉然");
        list1.add("carol");
        list1.add("珈乐");
        list1.add("ellen");
        list1.add("乃琳");
        list1.add(1);

        list.addAll(list1);
        System.out.println("addAll：" + list);

        // 在指定下标添加元素
        list.add(0, "A-soul");
        System.out.println("在指定下标添加元素后：" + list);

        // 判断集合中是否含有元素
        boolean contains = list.contains("ava");
        System.out.println("是否包含" + " ava " + "元素：" + contains);

        // 判断当前集合是否是空的
        System.out.println("当前集合是否是空的：" + list.isEmpty());

        // 根据下标index获取指定的元素。
        Object o = list.get(2);
        System.out.println("获取指定下标元素：" + o);

        // 返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回
        int ava = list.indexOf("ava");
        System.out.println("第一次出现该元素的下标：" + ava);

        // 返回此列表中指定元素的最后一次出现的索引，如果此列表不包含元素，则返回
        int bella = list.lastIndexOf("bella");
        System.out.println("最后一次出现的下标：" + bella);

        // 删除该列表中指定位置的元素并且返回。
        Object remove = list.remove(0);
        System.out.println("删除元素：" + remove);

        // 删除元素中的Integer包装类就需要将元素装箱，不然会自动识别成int类型获取下标
        boolean remove1 = list.remove(Integer.valueOf(1));
        System.out.println("删除int的包装类：" + remove1);

        // 删除元素，只能删除第一次出现的元素
        boolean ava1 = list.remove("ava");
        System.out.println("删除指定元素：" + ava1);

        // 将c中和当前集合对象共有的元素全部删除
        boolean b = list.removeAll(list1);
        System.out.println("删除集合交集是否成功：" + b);

        // 将指定下标index处的元素修改为element
        list.set(1, "晚晚");
        System.out.println("将指定下标index处的元素修改后：" + list);

        // 获取集合大小
        int size = list.size();
        System.out.println("集合大小：" + size);

        // 将对象再转换成数组
        Object[] objects = list.toArray();
        System.out.println("传唤成数组：" + Arrays.toString(objects));

        // 将数组转换成对象
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        List<String> strings = Arrays.asList("晚晚", "拉姐", "", "", "");
        // 要想将基本数据类型的数组需要包装类的数组
        int[] intArr = {1, 2, 30};
        List<int[]> ints = Arrays.asList(intArr);
        System.out.println("ints：" + ints);
        // 包装类数组
        Integer[] integers = {1, 2, 30};
        List<Integer> list3 = Arrays.asList(integers);
        System.out.println("将包装类数组转换成集合：" + list3);
        List<? extends Serializable> newObjects = Arrays.asList("ava", 100, true);
        System.out.println("newObjects：" + newObjects);

        System.out.println("==================================迭代器================================");
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("迭代ing..." + iterator.next());
            // iterator.remove();
        }
        System.out.println("==================================for================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("for：" + list.get(i));
        }

        System.out.println("==================================增强for================================");
        for (Object o1 : list) {
            System.out.println("foreach：" + o1);
        }
        System.out.println("==================================forEach()================================");
        list.forEach(x -> System.out.println("forEach():" + x));

        System.out.println("========================双向迭代器ListIterator================================");
        ListIterator<Object> objectListIterator = list.listIterator();
        System.out.println("========================正向迭代============================");

        while (objectListIterator.hasNext()) {
            Object next = objectListIterator.next();
            System.out.println("从前往后迭代：" + next);
        }
        System.out.println("========================逆向迭代=============================");
        // 从后往前迭代只需要最后一位的下标才能开始迭代
        while (objectListIterator.hasPrevious()) {
            Object previous = objectListIterator.previous();
            System.out.println("从后往前迭代：" + previous);
        }
        System.out.println("==================================stream================================");
        list.stream().forEach(x -> System.out.println("stream()：" + x));

        System.out.println("===================并行流，抢占式。parallelStream================================");
        list.parallelStream().forEach(x -> System.out.println("parallelStream()：" + x));

        System.out.println("===================并行流，抢占式。stream().parallel()================================");
        list.stream().parallel().forEach(x -> System.out.println("stream().parallel()：" + x));


    }
}
