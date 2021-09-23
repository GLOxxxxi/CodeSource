package clazzcode.classcode0906.superpractice;

/**
 * 工具人类继承员工类
 */
public class ToolsStaff extends Staff{

    /** 具体工作的员工 */
    String tool;

    public ToolsStaff() {
        // 调用父类的无参构造，只能在子类的构造函数中才能调用父类构造函数
        super();
        // 调用父类方法
        super.getMessage();
        // 调用本类方法
        getMessage();
    }

    /**
     * 有参构造 有两个父类的属性
     * @param jobNumber 员工号
     * @param name 姓名
     * @param tool 具体什么员工
     */
    public ToolsStaff(String jobNumber, String name, String tool) {
        super(jobNumber, name);
        this.tool = tool;
    }

    // get,set 方法
    public ToolsStaff(String tool) {
        this.tool = tool;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    /**
     * 打印信息
     */
    @Override
    public void getMessage() {
        System.out.println("老子是高级工具人");
    }

    public static void main(String[] args) {
        new ToolsStaff();
    }
}
