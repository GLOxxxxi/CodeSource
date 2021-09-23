package clazzcode.classcode0911;

import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String[] args) {

        BigInteger bigInteger = new BigInteger("55555555555554555545");
        BigInteger bigInteger1 = new BigInteger("666667");
        // BigInteger求和
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println("和：" + add);
        // BigInteger求和
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println("差：" + subtract);
        // BigInteger乘积
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println("乘：" + multiply);
        // BigInteger求商
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println("商：" + divide);
        // BigInteger二进制输出
        String str = bigInteger.toString(2);
        System.out.println("二进制：" + str);
    }
}
