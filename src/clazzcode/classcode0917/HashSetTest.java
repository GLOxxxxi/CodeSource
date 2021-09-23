package clazzcode.classcode0917;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet 测试类 HashSetTest
 * 调用HashSet中的方法，遍历set，判断是否为重复元素
 */
public class HashSetTest {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("ava");
        set.add("bella");
        set.add("carol");
        set.add("diana");
        set.add("ellen");
        System.out.println("hashSet：" + set);
        // size()，获取集合元素个数
        System.out.println("集合中元素个数：" + set.size());
        // contains(),判断集合中是否存在元素
        boolean contains = set.contains("ava");
        System.out.println("集合中是否含有传入参数：" + contains);
        // isEmpty(), 判断集合中是否含有元素
        boolean empty = set.isEmpty();
        System.out.println("集合整体是否是空的：" + empty);
        // 清空集合
        set.clear();
        System.out.println("清空集合之后：" + set);

        // 遍历集合，迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("迭代ing：" + iterator.next());
        }

    }

    /**
     * 测试User类，用于判断HashSet判断重复机制
     */
    class User {
        private String name;

        public User() {}

        public User(String name) {
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

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            User other = (User) obj;
            if (name == null) {
                return other.name == null;
            } else return name.equals(other.name);
        }
    }
}
