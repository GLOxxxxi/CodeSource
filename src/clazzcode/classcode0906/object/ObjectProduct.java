package clazzcode.classcode0906.object;

/**
 * Object 测试类，创建对象，使用hashcode，equals，toString，getClass
 */
public class ObjectProduct {
    public static void main(String[] args) {
        // 创建两个Product对象,给相同的值
        Product product = new Product("XHS-17556", 50);
        Product product1 = new Product("XHS-17556", 50);

        // 获取对象的hashcode
        int p = product.hashCode();
        int p1 = product1.hashCode();
        System.out.println("product：" + p); // product：1735600054
        System.out.println("product1：" + p1); // product1：21685669

        //直接打印对象
        System.out.println(product); // clazzcode.classcode0906.object.Product@677327b6
        System.out.println(product1); // clazzcode.classcode0906.object.Product@677327b6

        // 重写toString方法之后打印指定格式的字符串
        System.out.println("product的toString方法：" + product.toString());
        System.out.println("product1的toString方法：" + product1.toString());

        // 试用equals方法
        System.out.println(product == product1); // false
        boolean productEquals = product.equals(product1); // 重写equals方法
        System.out.println(productEquals); // true

        // getClass 获取字节码文件
        Class<? extends Product> productClass = product.getClass();
        Class<? extends Product> productClass1 = product1.getClass();
        // 字节码比较是否相等，用 ==
        System.out.println(productClass == productClass1);
    }
}
