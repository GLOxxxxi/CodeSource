package clazzcode.classcode0918;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 配置测试类 PropertiesTest 添加配置键值对 获取硬盘中的数据，将数据存放到硬盘
 */
public class PropertiesTest2 {

    public static void main(String[] args) throws IOException {
        // 将硬盘中的数据，读取到内存
        // 1. 先创建Properties对象: 无参构造 Properties()
        Properties p = new Properties();

		/*
		 *  步骤2. 调用Properties对象的load方法，将硬盘中数据读取到内存
		 *		void load(InputStream inStream) 从输入字节流读取属性列表（键和元素对）。
		 *
		 *		这里需要InputStream对象，但是InputStream是抽象类，
		 *		所以需要从API中找到InputStream子类FileInputStream 构造方法
		 *			FileInputStream(String name)
		 *				name：文件名
		 *					1. 绝对路径：是从盘符（Windows）或者根目录（Linux）开始的
		 *					2. 相对路径：是从当前项目开始，保存到当前项目下
				 IO流必须要关闭，释放资源
		 */
        // 声明一个FileInputStream对象赋值为new出来的FileInputStream对象，创建对象的参数是"mysql.properties"。
        FileInputStream fis = new FileInputStream("mysql.properties"); // 文件mysql.properties是在项目下的已经存在的文件

        // Properties对象p调用load方法,将数据从硬盘读取到内存
        p.load(fis);

        // Properties对象p调用	 1. getProperty(String key);通过key取值
        String username = p.getProperty("username");
        String password = p.getProperty("password");

        // 打印获取值
        System.out.println(username + " = " + password);

        // 2. getProperty(String key, String defaultValue);该方法是在key获取不到对应value的时候，返回一个默认值defaultValue
        String email = p.getProperty("email", "没有此项！");
        System.out.println(email);
    }
}
