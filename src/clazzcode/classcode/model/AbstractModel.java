package clazzcode.classcode.model;

import java.util.Objects;

/**
 * 抽象模特类
 */
public abstract class AbstractModel {
    /** 姓名 */
    private String name;

    /** 腰围 */
    private double waistline;

    /** 臀围 */
    private double hipline;

    /** 胸围 */
    private double chestline;

    // get,set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWaistline() {
        return waistline;
    }

    public void setWaistline(double waistline) {
        this.waistline = waistline;
    }

    public double getHipline() {
        return hipline;
    }

    public void setHipline(double hipline) {
        this.hipline = hipline;
    }

    public double getChestline() {
        return chestline;
    }

    public void setChestline(double chestline) {
        this.chestline = chestline;
    }
    public void walkThrough() {
        System.out.println("走个台");
    }
    public abstract void changeClothes();

    /**
     * 重写toString
     * @return 规范的输出
     */
    @Override
    public String toString() {
        return "[" + name + ", " + chestline + ", " + waistline + "]";
    }

    /**
     * 重写equals
     * @param o 对象
     * @return 是否相等
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractModel that = (AbstractModel) o;
        return Double.compare(that.waistline, waistline) == 0 && Double.compare(that.hipline, hipline) == 0 && Double.compare(that.chestline, chestline) == 0 && Objects.equals(name, that.name);
    }

}
