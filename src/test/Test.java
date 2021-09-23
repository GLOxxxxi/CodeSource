package test;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        // 三元操作符 类型转换规则 若两个操作数都是直接量的数字，返回值是范围较大的那个
        Object o = true ? new Integer(1) : new Double(2.0);
        Object o1 = (double) new Integer(1);
        System.out.println(o);
        double a = (double)o;
        System.out.println(a);

    }

}
