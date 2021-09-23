package clazzcode.classcode0908.interfaceandabstract1;

/**
 * 教学测试类TeachingTest,包含了创建三个老师对象,分别调用教学方法,实现有的作业方法或者考试方法
 */
public class TeachingTest {

    public static void main(String[] args) {

        System.out.println("=============语文老师=============");
        // 创建语文老师对象
        ChineseTeacher chineseTeacher = new ChineseTeacher();
        // 调用教学方法
        chineseTeacher.teaching();

        System.out.println("=============数学老师=============");
        // 创建数学老师对象
        MathTeacher mathTeacher = new MathTeacher();
        // 调用教学,考试,作业方法
        mathTeacher.teaching();
        mathTeacher.assignExamination();
        mathTeacher.assignHomework();

        System.out.println("=============英语老师=============");
        // 创建英语老师对象
        EnglishTeacher englishTeacher = new EnglishTeacher();
        // 调用教学,作业方法
        englishTeacher.teaching();
        englishTeacher.assignHomework();
    }
}
