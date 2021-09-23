package clazzcode.classcode0906.superpractice;

/**
 *
 * Person人类
 *
 */
public class Person extends Animal {
    /** 胸围 */
    double bust;

    /**
     * Person类无参构造
     */
    public Person() {
        // super(); // 调用无参构造
        super("子类", 19); // 调用父类两个参数的有参构造，构造方法必须写在第一行
        // 调用父类的方法访问非私有的成员变量
        this.setName("ss");
        super.setAge(90);
        System.out.println("父类年龄" + super.getAge());
        // 调用父类的eat方法
        super.eat();

    }

    /**
     * Person 类两个参数的构造方法
     * @param name 姓名
     * @param age 年龄
     */
    public Person(String name, int age) {
        super(name, age);
    }

    /**
     * 一个父类参数，一个子类参数的构造方法
     * @param name 姓名
     * @param bust 胸围
     */
    public Person(String name, double bust) {
        super(name);
        this.bust = bust;
    }

    // get,set 方法
    public double getBust() {
        return bust;
    }

    public void setBust(double bust) {
        this.bust = bust;
    }

    /**
     * 子类重写eat方法
     */
    @Override
    public void eat() {
        System.out.println("ren吃肉");
    }


    public static void main(String[] args) {
        // 调用本类的无参构造
        new Person();
    }
}
