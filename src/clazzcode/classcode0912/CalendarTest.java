package clazzcode.classcode0912;

import java.util.Calendar;

/**
 * 日历测试类CalendarTest 获取实例，获取当前日期，日期计算
 */
public class CalendarTest {

    public static void main(String[] args) {
        // 获取一个日历类实例
        Calendar instance = Calendar.getInstance();
        System.out.println("获取日期实例：" + instance);

        // 获取实例中的年月日的各个值
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH);
        int day_of_month = instance.get(Calendar.DAY_OF_MONTH);

        // 获取当前年月日
        System.out.println("年：" + year);
        System.out.println("月：" + month);
        System.out.println("日：" + day_of_month);
        System.out.println(year + "/" + month + "/" + day_of_month);

        // 日期计算，并重新赋值
        instance.add(Calendar.YEAR, 2);
        year = instance.get(Calendar.YEAR);
        instance.add(Calendar.MONTH, 4);
        month = instance.get(Calendar.MONTH);
        instance.add(Calendar.DAY_OF_MONTH, -11);
        day_of_month = instance.get(Calendar.DAY_OF_MONTH);
        // 打印计算后的值
        System.out.println("年：" + year);
        System.out.println("月：" + month);
        System.out.println("日：" + day_of_month);
        System.out.println(year + "/" + month + "/" + day_of_month);

        // 判断日期前后
        Calendar instance1 = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.add(Calendar.YEAR, 5);
        boolean after = instance1.after(instance2);
        boolean before = instance1.before(instance2);
        System.out.println("判断日期是否在传入日期之后：" + after);
        System.out.println("判断日期是否在传入日期之前：" + before);
    }
}
