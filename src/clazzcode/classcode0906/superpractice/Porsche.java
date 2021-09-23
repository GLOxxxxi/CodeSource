package clazzcode.classcode0906.superpractice;

/**
 * 保时捷类
 */
public class Porsche extends Car{
    /** 车子速度 */
    private double speed;

    public Porsche() {
        // 调用父类的无参构造，只能在子类的构造函数中才能调用父类构造函数
        super();
        // 调用父类方法
        super.getHighSpeed();
        // 调用本类方法
        super.getHighSpeed();
    }

    /**
     * 子类有参构造
     * @param speed 速度
     */
    public Porsche(double speed) {
        this.speed = speed;
    }

    /**
     * 继承了父类属性的有参构造
     * @param price 价格
     * @param name 姓名
     * @param age 年龄
     * @param speed 速度
     */
    public Porsche(double price, String name, int age, double speed) {
        super(price, name, age);
        this.speed = speed;
    }

    // set，get方法
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    /**
     * 打印最高时速
     */
    @Override
    public void getHighSpeed() {
        System.out.println("最高时速：160km/h");
    }

    public static void main(String[] args) {
        new Car();
    }

}
