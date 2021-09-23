package clazzcode.classcode0906.object;

/**
 * 用户类
 */
public class User {
    /** 姓名 */
    private String name;

    /** 年龄 */
    private int age;

    /** 性别 */
    private char sex;

    public User() {}

    /**
     * 有参构造
     * @param name 姓名
     * @param age 年龄
     * @param sex 性别
     */
    public User(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // get，set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * 重写toString方法
     * @return 规定格式的输出
     */
    @Override
    public String toString() {
        return "[" + name + ", " + age + ", " + sex + "]";
    }

    /**
     * 重写equals方法
     * @param o 对象
     * @return 是否相等
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && sex == user.sex && name.equals(user.name);
    }

}
