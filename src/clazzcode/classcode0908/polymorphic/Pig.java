package clazzcode.classcode0908.polymorphic;

/**
 * 🐖类,继承Animals
 */

public class Pig extends Animals {
    /**
     * 重写猪类eat方法
     */
    @Override
    public void eat() {
        System.out.println("吃白菜");
    }

    /**
     * 猪类特有方法gongBaiCai
     */
    public void gongBaiCai() {
        System.out.println("拱白菜");
    }
}
