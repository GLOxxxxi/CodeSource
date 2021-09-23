package clazzcode.classcode0918;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * HashMap测试类 HashMapTest
 * 调用HashMap的方法，遍历HashMap
 */
public class HashMapTest {
    public static void main(String[] args) {
		/*
		 * 构造方法：
		 * 		1. HashMap()构造一个空的 HashMap ，默认初始容量（16）和默认负载系数（0.75）。
		 * 			容量16：是键值对的数组长度16
		 * 			负载系数0.75：扩容机制是当容量达到75%的时候，开始扩容，就是创建新数组，复制元素
		 * 			一般就使用默认的负载系数，因为经过测试这是最优化的
		 *
				2. HashMap(int initialCapacity) 创建空的 HashMap具有指定的初始容量initialCapacity和默认负载因子（0.75）。
					避免哈希碰撞
				3. HashMap(int initialCapacity, float loadFactor) 构造一个空的 HashMap具有指定的初始容量和负载因子。  【少用】
				4. HashMap(Map m) 创建一个HashMap对象，并且传入另一个Map对象m，这样先创建对象就有了与m相同的数据
		 */
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>(); // 懒操作，用到的时候，才去执行。
        System.out.println(hashMap);

        // 1.V put(K key, V value)如果当前key，没有，则是添加操作，如果key是存在的则进行equals判断，如果equals相等，则是覆盖操作，如果equals不相等，value追加到末尾则会形成链表或者红黑树
        hashMap.put("一", 1);
        hashMap.put("三", 3);
        hashMap.put("二", 2);
        hashMap.put("六", 6);
        hashMap.put("九", 9);
        hashMap.put("五", 5);
        System.out.println(hashMap);

        hashMap.put("一", 111); // 重新修改key="一" 的值为 111
        // 重新打印hashMap
        System.out.println("后：" + hashMap);

        // HashMap判断key是否重复机制：1. 先看key的hashCode值  2. hashCode值相同，再看key的equals方法, 都想相同，才认为是相同的key
        // 2.void putAll(Map m) 将传入的Map作为参数，创建一个新的HashMap对象
        HashMap<String, Integer> hp = new HashMap<String, Integer>();
        hp.put("晚晚", 0);
        hp.put("然然", 1);
        hp.put("乐乐", 2);
        hashMap.putAll(hp);
        System.out.println("将传入的Map作为参数：" + hashMap);
        // 3.V get(Object key)根据key去获取value值,如果key不存在，则返回null
        Object o = hashMap.get("晚晚");
        System.out.println("根据key去获取value值：" + o);
        // 4.V remove(Object key)根据key删除当前map对象中的这一对键值对
        Object remove = hashMap.remove("一");
        System.out.println("根据key删除当前map对象中的这一对键值对：" + remove);
        // 5.boolean remove(Object key, Object value)只有key和value都存在的时候，才能删除
        hashMap.remove("二", 2);
        System.out.println("只有key和value都存在的时候删除：" + hashMap);
        // 6.V replace(K key, V value)根据key替换为新的value的值
        hashMap.replace("晚晚", 90);
        System.out.println("根据key替换为新的value的值：" + hashMap);
        // 7.boolean replace(K key, V oldValue, V newValue)  只有当key和value都存在的情况下，才能替换为新的  newValue值
        hashMap.replace("晚晚", 90, 100);
        System.out.println("只有当key和value都存在的情况下：" + hashMap);
        // 8.boolean containsKey(Object key)判断当前map集合对象中是否包含这个key
        boolean contain = hashMap.containsKey("晚晚");
        System.out.println("判断当前map集合对象中是否包含这个key：" + contain);
        // 9.boolean containsValue(Object value)判断当前map集合对象中是否包含这个value，包含则返回 true 。
        boolean b = hashMap.containsValue(100);
        System.out.println("判断当前map集合对象中是否包含这个value：" + b);
        // 10.void clear()清除所有的键值对对象
        hashMap.clear();
        // 11.boolean isEmpty()判段当前map对象是否是空集合 。
        System.out.println("判段当前map对象是否是空集合：" + hashMap.isEmpty());
        // 自定义类型作为key，判断key是否重复
        // HashMap判断key是否重复机制：1. 先看key的hashCode值  2. hashCode值相同，再看key的equals方法, 都想相同，才认为是相同的key
		User u1 = new User("苍苍");
		User u2 = new User("苍苍");
		User u3 = new User("苍苍2");
		User u4 = new User("苍苍2");

		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		System.out.println(u3.hashCode());
		System.out.println(u4.hashCode());

		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u3));
		System.out.println(u3.equals(u4));
		hashMap.clear();
        HashMap<String, User> userMap = new HashMap<>();
        userMap.put("1", u1);
        userMap.put("2", u2);
        userMap.put("3", u3);
        userMap.put("4", u4);
		System.out.println(userMap);

        System.out.println("========================keySet=======================");
        Set<String> strings = userMap.keySet();
        for (String string : strings) {
            System.out.println("键：" + string + "，值：" + userMap.get(string));
        }
        System.out.println("========================keySet迭代器=======================");
        Iterator<String> it = userMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println("键：" + next + "，值" + userMap.get(next));
        }

        Set<Map.Entry<String, User>> entries = userMap.entrySet();

        System.out.println("========================增强for=======================");
        for (Map.Entry<String, User> entry : entries) {
            System.out.println("键：" + entry.getKey() + "，值：" + entry.getValue());
        }
        System.out.println("========================Iterator=======================");
        Iterator<Map.Entry<String, User>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, User> next = iterator.next();
            System.out.println("键：" + next.getKey() + "，对应值：" + next.getValue());

        }
        System.out.println("========================lambda=======================");
        userMap.forEach((x, y) -> System.out.println("键：" + x + "，值：" + y));

        // 在hashmap的基础上添加了一个双向链表用于保存存储的顺序。
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        // 效率低
        Hashtable<Integer, Integer> table = new Hashtable<>();
        // 比hashtable效率高，同样有线程安全
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();

    }

}


/**
 *	验证HashMap判断key重复的机制
 */
class User {
    String name;

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
        return "[" + name + "]";
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
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}
