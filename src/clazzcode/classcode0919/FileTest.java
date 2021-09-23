package clazzcode.classcode0919;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * 文件类测试 FileTest 添加文件或文件夹，和文件相关的方法
 */
public class FileTest {

    public static void main(String[] args) {
// 调用常量：
        /*
         * 常量 separator:根据系统分配一个路径分隔符\或者/，一般用在层级较少的情况
         * 一般情况下，层级结构较多的时候，我们还是写死 分隔符\或者/
         */
        System.out.println("路径分隔符：" + File.separator);
        // \

		/*
		 * 只要是文件夹都不要加后缀，只要是文件都必须加后缀。
		 * 	文件夹，最好不要调用文件相关方法
		 * 	文件，最好不要调用文件夹相关方法
		 *
		 * 构造方法：
			File(String pathname) 根据文件名创建一个File对象，
				pathname:（如果有后缀就是一个文件对象，如果没有后缀会默认为是一个文件夹对象）
					1. 相对路径：相对于当前Java类的项目
					2. 绝对路径：从根目录或者盘符开始	/都表示从根目录或者盘符开始

			File(String parent, String child) 在父级目录下parent创建一个child文件或文件夹
				parent：父级目录
				child：当前文件夹或者当前文件名字
		 *
		 * 	File(File parent, String child) 在父级目录parent下创建一个child文件或文件夹【注意：parent必须是文件夹】
		 */
        File dir = new File("a");// 表示相对路径（当前项目）下在内存中创建一个文件夹对象a(如果硬盘中对应路径下有该a文件夹，则就指代该a文件夹)
        File file = new File("a", "b.txt");// 相对路径下，父级目录a，当前文件对象 b.txt
        File dir2 = new File(dir, "dir2");// 相对路径下，父级目录是File对象dir，当前文件夹对象dir2

        /*
         * 表示绝对路径下在内存中创建一个文件夹对象a(如果硬盘中对应路径下有该a文件夹，则就指代该a文件夹)
         * 如果当前文件夹是多层级的文件夹，则当前对象就是指代最后一个层级的文件夹对象或者文件对象
         * 如：F:/a/b/c 就指代c这一层级
         */
         // 在内存中创建一个文件夹对象，当前文件夹对象是指最后一级c
        File dir3 = new File("a/b/c");
        // 常用方法：
        // 1.boolean mkdir() 在硬盘创建一个文件夹对象。如果已经有了，就不会创建。
//        boolean mkdir = dir.mkdir();
//		System.out.println("是否成功创建文件夹：" + mkdir);

//		boolean mkdir2 = dir2.mkdir();
//		System.out.println("是否成功创建文件夹dir2：" + mkdir2);
//
//		boolean mkdir3 = dir3.mkdirs();
//		System.out.println("是否成功创建文件夹dir3：" + mkdir3);

        // 用文件对象去调用文件夹的方法，语法正确，但是逻辑错误
//		boolean mkdir4 = file.mkdir(); // 文件调用文件夹方法，语法可以，但是逻辑错误，所以，不要这样用
//		System.out.println("文件调用文件夹方法是否成功：" + mkdir4);

        // 2.boolean mkdirs() 在硬盘创建多层级的文件夹对象。
        File dirs = new File("aa/bb/cc");
//        boolean mkdirs = dirs.mkdirs();
//		System.out.println("是否成功创建多层级文件夹：" + mkdirs);

        // 3.boolean createNewFile()  在硬盘创建一个文件对象
//        if (!file.exists()) {
//            try {
//                boolean newFile = file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


        // 用文件夹对象去调用文件的方法，语法正确，但是逻辑错误
//		boolean createNewFile2 = dir2.createNewFile();
//		System.out.println("文件夹调用文件方法是否成功 ：" + createNewFile2);

        // 4.boolean delete()删除文件或者文件夹（文件可以直接删除，如果是文件夹，该文件夹必须是空文件夹，才能删除成功）
//        boolean delete = dir2.delete();
//        System.out.println("删除文件是否成功：" + delete);

        // 删除dir文件夹【dir必须是空文件夹】
//        boolean delete2 = dir.delete();
//		System.out.println("删除文件夹是否成功：" + delete2);

        // 5.boolean exists()判段文件或目录是否在硬盘上存在。
//        boolean exists = file.exists();
//		System.out.println("文件硬盘上是否存在： " + exists);
//        boolean dir2Exists = dir2.exists();
//		System.out.println("文件夹硬盘上是否存在： " + dir2Exists);

        // 6.boolean isDirectory() 判断当前对象是不是文件夹
        boolean directory = dir.isDirectory();
		System.out.println("是否是文件夹：" + directory);
		System.out.println("是否是文件夹：" + file.isDirectory());

        // 7.boolean isFile()    判断当前对象是不是文件
		System.out.println("是否是文件：" + dir.isFile());
		System.out.println("是否是文件：" + file.isFile());

        // 8.long length()  获取文件的字节数，文件夹不能直接获取字节数
//        long length = file.length();
//        System.out.println("获取文件的字节数：" + length);
//		File dir6 = new File("D:/"); // 创建一个File文件夹对象,指代F盘
//		long FLength = dir6.length();// 不能直接获取文件夹中所有文件的大小
//		System.out.println("当前文件夹的长度是："  + FLength + "个字节");

//		File file2 = new File("F:/JAVA/数组Array.md"); // 创建一个File文件对象,指代F:/200道题.txt
//		long length2 = file2.length();
//		System.out.println("当前文件的长度是："  + length2 + "个字节");

        // 9.String getAbsolutePath() 获取文件夹或者文件绝对路径名字符串。
        // 类似的方法： File getAbsoluteFile() 获取文件夹或者文件绝对路径名字符串。
//		String absolutePath = dir.getAbsolutePath();
//		System.out.println("dir绝对路径:" + absolutePath);
//
//		File absoluteFile = file.getAbsoluteFile();
//		System.out.println("file绝对路径:" + absoluteFile);
//
//        // 10.String getName()  获取文件(或者文件夹)名（不包含上级目录）
//        System.out.println(file.getName());
        // 11.String getParent()获取父路径String格式，相对路径不能获取父级目录(没有层级结构的)
//		File dir7 = new File("bbb");
		String parent = dirs.getParent();// 只能获取创建对象的时候的父级目录
		System.out.println(parent);
//
//		File dir8 = new File("bb/bbb");
//		String parent2 = dir8.getParent();// 只能获取创建对象的时候的父级目录
//		System.out.println(parent2); // bb

        // 12.File getParentFile() 获取父类路径的File对象【跟上面的第11个方法相似】
        System.out.println(file.getParentFile());
        // 13.static File[] listRoots()  获取当前系统的所有盘符或者根目录
        System.out.println(Arrays.toString(File.listRoots()));
        // 14.boolean renameTo(File dest) 重命名当前文件或文件夹对象 【当前File对象和dest路径要一致】
//		File file5 = new File("a/bb.txt");// 相对路径下创建一个file5对象，指代a文件夹下面的b.txt文件
//		File file6 = new File("c.txt");// 相对路径下创建一个file6对象，指代a文件夹下面的d.txt文件
//		boolean renameTo = file5.renameTo(file6);
//		System.out.println("重命名是否成功：" + renameTo);

        /*
         * 16. static File createTempFile(String prefix, String suffix)
         * 	在默认临时文件目录中创建一个空文件，使用给定的前缀和后缀生成其名称。
         */
        try {
            File.createTempFile("newxf",".txt", dir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
         *  17. static File createTempFile(String prefix, String suffix, File directory)
         *  在指定的目录directory中创建一个新的空文件，使用给定的前缀和后缀字符串生成其名
         */

    }

}
