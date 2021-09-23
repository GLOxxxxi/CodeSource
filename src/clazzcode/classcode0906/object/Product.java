package clazzcode.classcode0906.object;

import java.util.Objects;

/**
 * 产品类
 */
public class Product {
    /** 产品序列码 */
    private String sequenceCode;

    /** 产品价格 */
    private double price;

    public Product() {}

    /**
     * 有参构造
     * @param sequenceCode 产品序列码
     * @param price 产品价格
     */
    public Product(String sequenceCode, double price) {
        this.sequenceCode = sequenceCode;
        this.price = price;
    }

    // get，set方法
    public String getSequenceCode() {
        return sequenceCode;
    }

    public void setSequenceCode(String sequenceCode) {
        this.sequenceCode = sequenceCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 重写toString方法
     * @return 规定格式的输出
     */
    @Override
    public String toString() {
        return "[" + sequenceCode + ", " + price + "]";
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
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(sequenceCode, product.sequenceCode);
    }

}
