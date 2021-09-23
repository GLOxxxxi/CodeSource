package clazzcode.classcode0923;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit4Test {

    public Junit4Test() {
        System.out.println("无参构造，在每一次调用方法前都会调用无参构造创建对象");
    }

    @Before
    public void before() {
        System.out.println("每一个方法开始之前都会执行");
    }

    @Test
    public void JunitTest1() {
        /*System.out.println(1 / 0);*/
        System.out.println("=================");
    }

    @Test
    public void JunitTest2() {
        System.out.println("单元测试第二个方法");
    }

    @After
    public void after() {
        System.out.println("每一次方法结束之后都会执行");
    }

}
