package clazzcode.classcode0912;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期测试类DateTest 获取系统日期，SimpleDateFormat 格式化日期，解析日期
 */
public class DateTest {

    public static void main(String[] args) {
        // Date 无参构造
        Date date = new Date();
        System.out.println("当前系统日期：" + date);
        // Date 有参构造
        long l = System.currentTimeMillis();
        Date longDate = new Date(l);
        System.out.println("有参构造：" + longDate);
        // 创建模板simpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        // 调用方法格式化日期
        String format = simpleDateFormat.format(date);
        System.out.println("格式化之后的日期：" + format);

        // 创建需要解析的模板
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        // 接收解析后的日期
        Date parse = new Date();
        // 捕获异常
        try {
            // 获取解析后的日期
            parse = sdf.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("恢复系统时间格式：" + parse);
    }
}
