package clazzcode.classcode0911;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {

    public static void main(String[] args) {
        /*
         * 构造方法：
         *		BigDecimal(String val)  建议使用这种方式创建，因为其他方式有可能会有精度丢失
         */
        BigDecimal bigDecimal = new BigDecimal("3.1415926");
        BigDecimal bigDecimal2 = new BigDecimal("0.5926");

        // 加法：BigDecimal add(BigDecimal agenda) 返回 BigDecimal ，其值是 (this + agenda)
        BigDecimal add = bigDecimal.add(bigDecimal2);
        System.out.println("和：" + add);
        // 减法：BigDecimal subtract(BigDecimal subtrahend) 返回 BigDecimal ，其值是 (this - subtrahend)
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        System.out.println("减：" + subtract);
        // 乘法：BigDecimal multiply(BigDecimal multiplicand) 返回 BigDecimal ，其值是 (this × multiplicand)，
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        System.out.println("乘：" + multiply);
        // 除法：BigDecimal divide(BigDecimal divisor)返回BigDecimal ，其值为(this / divisor
        BigDecimal divide1 = bigDecimal.divide(bigDecimal2, 5, RoundingMode.FLOOR);
        System.out.println("商：" + divide1);
        // BigDecimal divide = bigDecimal.divide(bigDecimal2);// ArithmeticException 算数异常
        //		System.out.println("商：" + divide);
        /*
         * 当精度超出BigDecimal表示范围的时候，就需要用divide方法重载方法
         *
         * public BigDecimal divide(BigDecimal divisor,RoundingMode roundingMode)
         * 该方法现在没有能够设置小数位数的参数，如果需要设置指定小数位数，用重载方法
         * 	RoundingMode：就是一个枚举类，是决定取舍方式的。
         * 		使用方式：枚举名.字段；
         *
         * 建议使用：该方法可以决定保留小数的位数
         * BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
         * scale:保留的小数位数
         * roundingMode:	通过类.常量使用,例如：BigDecimal.ROUND_DOWN
         */
        // ArithmeticException 算数异常
        BigDecimal divide = bigDecimal.divide(bigDecimal2,10,BigDecimal.ROUND_DOWN);
        System.out.println("商：" + divide);
        // ArithmeticException 算数异常
        BigDecimal divide2 = bigDecimal.divide(bigDecimal2,12, RoundingMode.FLOOR);
        System.out.println("商：" + divide2);
    }
}
