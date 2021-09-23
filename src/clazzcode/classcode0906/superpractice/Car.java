package clazzcode.classcode0906.superpractice;

/**
 * 车类
 */
public class Car {
    /** 价格 */
    public double price;

    /** 名称 */
    public String name;

    /** 年龄 */
    public int age;


    /**
     * 无参构造
     */
    public Car() {
        System.out.println("父类Car的无参构造被调用了");
    }

    /**
     * Car类 满参构造函数
     * @param price 价格
     * @param name 名称
     * @param age 年龄
     */
    public Car(double price, String name, int age) {
        this.price = price;
        this.name = name;
        this.age = age;
    }

    /**
     * get 方法
     * @return 价格
     */
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * get 方法
     * @return 名称
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 方法
     * @return 年龄
     */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 打印最高时速
     */
    public void getHighSpeed() {
        System.out.println("最高时速：60km/h");
    }
}
