package clazzcode.classcode0917;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet 测试类 TreeSetTest
 * 调用 TreeSet 中的方法，重写判断不重复的方法
 */
public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(7);
        treeSet.add(6);
        treeSet.add(9);
        treeSet.add(1);
        System.out.println("自然排序的set：" + treeSet);

        // 取小于值的最大值
        Object ceiling = treeSet.ceiling(6);
        System.out.println("ceiling：" + ceiling);
        // 取大于值的最小值
        Object floor = treeSet.floor(8);
        System.out.println("floor：" + floor);
        // 清空集合
        treeSet.clear();

        treeSet.add("晚晚");
        treeSet.add("嘿嘿...");
        treeSet.add("口水黄豆");
        treeSet.add("晚晚");
        treeSet.add("然然");
        System.out.println("改变数据类型之后的treeSet：" + treeSet);
        treeSet.clear();

        Emp emp1 = new Emp("晚晚");
        Emp emp2 = new Emp("晚晚wan");
        Emp emp3 = new Emp("向");
        Emp emp4 = new Emp("碗");
        // 添加对象
        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        treeSet.add(emp4);
        // 名字长度升序排序
        System.out.println("对象集合：" + treeSet);

        // 定制排序 匿名内部类
        TreeSet set = new TreeSet((Comparator<Student>)
                (o1, o2) -> o1.getName().length() - o2.getName().length());

        Student stu1 = new Student("碗");
        Student stu2 = new Student("晚晚");
        Student stu3 = new Student("王嘉然");
        Student stu4 = new Student("王力口乐");
        Student stu5 = new Student("乃王木木");

        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        set.add(stu5);
        // 名字长度升序
        System.out.println("用自定义比较器：" + set);

    }

    /**
     * 静态内部类 Emp 测试 Comparable
     */
    static class Emp implements Comparable<Emp> {
        private String name;

        public Emp() {}

        public Emp(String name) {
            super();
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

        /**
         * 重写compareTo，该方法就是比较元素，自然排序的方法。默认都是升序。
         * 该方法返回值也决定了TreeSet中的元素是否相同。
         * @param o 对象
         * @return 是否相同
         */
        @Override
        public int compareTo(Emp o) {
            // 需求：根据Emp对象的名字长度比较，大小，升序排序
            return this.name.length() - o.name.length(); // this是指当前添加的元素       参数o：指集合中每一个元素
        }

    }
    static class Student {
        private String name;

        public Student() {}

        public Student(String name) {
            super();
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name ;
        }
    }
}
