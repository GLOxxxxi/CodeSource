package clazzcode.classcode0908.interfaceandabstract1;
/**
 * 继承教学类AbstractTeaching,实现作业接口IHomework,考试接口IExamination
 */
public class MathTeacher extends AbstractTeaching implements IHomework, IExamination{
    /**
     * 重写teaching
     */
    @Override
    void teaching() {
        System.out.println("数学教学");
    }

    /**
     * 布置考试
     */
    @Override
    public void assignExamination() {
        System.out.println("2周后考试");
    }

    /**
     * 布置作业
     */
    @Override
    public void assignHomework() {
        System.out.println("一堆作业");
    }
}
