package clazzcode.classcode0906.superpractice;

import java.util.Objects;

/**
 * 动物类
 */
public class Animal {

    /** 姓名 */
    private String name;

    /** 年龄 */
    public int age;

    /**
     * Animal 无参构造
     */
    public Animal() {
        System.out.println("父类的无参构造");
    }

    /**
     * Animal只有一个参数的有参构造
     * @param name 姓名
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Animal 有参构造 两个参数
     * @param name 姓名
     * @param age 年龄
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        // 测试是否有调用
        System.out.println("父类有参构造被调用了-----:" + name + "都" + age + "岁了");
    }

    // get,set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int  age) {
        this.age = age;
    }

    /**
     * 重写toString
     * @return 固定格式的字符
     */
    @Override
    public String toString() {
        return "[" + name  + ", " + age + "]";
    }

    /**
     * 重写equals
     * @param o 对象
     * @return true，false
     */
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Animal animal = (Animal) o;
//        return age == animal.age && name.equals(animal.name);
//    }

    /**
     * 重写 hashcode
     * @return hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * eat方法
     */
    public void eat() {
        System.out.println("啥都吃");
    }
}
