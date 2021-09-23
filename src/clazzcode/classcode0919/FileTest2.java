package clazzcode.classcode0919;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * 文件类测试 FileTest2 包含文件过滤器的使用，
 *
 */
public class FileTest2 {

    public static void main(String[] args) {
        // 在硬盘上存在一个文件夹dir(E:\\a)，并且该文件夹还有下一级子文件夹或子文件
        File dir = new File("E:/");
		/*
		 * 3.String[] list(FilenameFilter filter)
				获取根据文件名过滤后的文件名
				FilenameFilter：文件名过滤器接口
		 */
        // 需求：获取所有的 .mp4文件
        // 直接使用匿名内部类，将设计FilenameFilter接口子类和创建子类对象合二为一
        String[] list1 = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                return name.endsWith(".xml");
            }
        });
        System.out.println("匿名内部类：" + Arrays.toString(list1));

        String[] list = dir.list((dir1, name) -> name.endsWith(".xml"));
		// 打印数组
		System.out.println("lambda：" + Arrays.toString(list));

		/*
		 * 4.File[] listFiles(FilenameFilter filter)
				获取根据文件名过滤后的文件对象
				FilenameFilter：文件名过滤器接口
		 */
        File[] files = dir.listFiles((dir1, name) -> name.endsWith(".xml"));
        System.out.println("lambda获取文件：" + Arrays.toString(files));

        File[] files1 = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".xml");
            }
        });
        System.out.println("匿名内部类获取文件：" + Arrays.toString(files1));


		/*
		 * 5.File[] listFiles(FileFilter filter)【该方法扩展性强】
				获取根据文件过滤后的文件对象
				FileFilter：文件过滤器接口
		 */
        // 需求：获取所有的 .doc文件或者 文件长度>=20000kb的文件 20000kb = 20000 * 1024b
        File[] filesFilter = dir.listFiles(x -> x.getName().endsWith(".xml") || x.length() > 1024 * 8);
        System.out.println("lambda高级文件过滤：" + Arrays.toString(filesFilter));

        File[] filesFilter1 = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                boolean b = pathname.getName().endsWith(".xml");
                boolean a = pathname.length() > 1024 * 8;
                return a || b;
            }
        });
        System.out.println("匿名内部类高级文件过滤：" + Arrays.toString(filesFilter1));

        // 测试 获取子文件夹或者子文件方法

        // 方法1.String[] list()获取当前文件夹下所有的子文件夹或者子文件的名	// 文件没有下一级

        // 情况一： 在硬盘上存在一个文件夹dir(E:/a)，并且该文件夹还有下一级子文件夹或子文件
        File dir3 = new File("E:/a");
        // dir调用String[] list()
		String[] listFileName = dir.list();
		System.out.println(listFileName);
		System.out.println(Arrays.toString(listFileName));

        // 情况二：在硬盘上存在一个文件夹 dir2(E:/dir2) ，该文件夹没有下一级	返回空数组
        File dir2 = new File("E:/dir2");
		// dir2调用String[] list()
		String[] list2 = dir2.list();
		System.out.println(list2);
		System.out.println(Arrays.toString(list2));

        // 情况三：在硬盘上不存在一个文件夹对象dir3(E:/test)  调用exist()返回false	硬盘不存在的文件夹，就没有下一级，返回null
        File dir4 = new File("E:/test"); // dir3调用String[] list()
		String[] list3 = dir3.list();
		System.out.println(list3);
		System.out.println(Arrays.toString(list3));

        // 情况四：在硬盘上存在一个文件对象file(F:/test.txt) 	文件没有下一级，返回null
        File file = new File("F:/test.txt"); // file调用String[] list()
		String[] list4 = file.list();
		System.out.println(list4);
		System.out.println(Arrays.toString(list4));

        // 方法2.File[] listFiles() 获取当前文件夹下所有的子文件夹或者子文件对象
		File[] listFiles = dir.listFiles();
		System.out.println(listFiles);
		System.out.println(Arrays.toString(listFiles));
    }
}


