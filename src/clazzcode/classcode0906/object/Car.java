package clazzcode.classcode0906.object;

import java.util.Objects;

/**
 * 车类
 */
public class Car {
    /** 名称 */
    private String name;

    /** 速度 */
    private double speed;

    public Car() {}

    /**
     * 有参构造
     * @param name 名称
     * @param speed 速度
     */
    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    // get，set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * 重写toString方法
     * @return 规定格式的输出
     */
    @Override
    public String toString() {
        return "[" + name + ", " + speed + "]";
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
        Car car = (Car) o;
        return Double.compare(car.speed, speed) == 0 && Objects.equals(name, car.name);
    }

}
