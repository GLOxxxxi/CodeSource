package clazzcode.classcode0918;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;

/**
 * 配置测试类 PropertiesTest 添加配置键值对
 */
public class PropertiesTest {
    public static void main(String[] args) throws FileNotFoundException {
        // 将内存中的数据，写出到硬盘
        // 1. 先创建Properties对象: 无参构造 Properties()
        Properties properties = new Properties();
        properties.setProperty("username", "admin");
        properties.setProperty("password", "admin");
        /*
         * 步骤3. p调用void list(PrintStream out) 方法将内存中的p的数据写到硬盘
         * 		这里需要PrintStream对象，所以需要从API中找到构造方法(找最熟悉)
         *			构造方法 PrintStream(String fileName) 使用指定的文件名创建新的打印流，无需自动换行。
         *				fileName：文件名
         *					1. 绝对路径：是从盘符（Windows）或者根目录（Linux）开始的
         *						例如：F:/test/mysql.properties
         *					2. 相对路径：是从当前项目开始，保存到当前项目下【必须刷新项目才能看到文件】
         *						例如：mysql.properties
         */
        // 先创建一个PrintStream对象ps,赋值为new出来的PrintStream对象，参数是String类型的，值:"mysql.properties"
        PrintStream printStream = new PrintStream("mysql.properties");
        properties.list(printStream);
        System.out.println("添加成功");
        PrintStream p = new PrintStream("F:\\工作空间\\coder\\src\\clazzcode\\classcode0918\\mysql.properties");
        properties.list(p);
    }
}
