package clazzcode.classcode0906.superpractice;

/**
 * 员工类
 */
public class Staff {
    /** 工号 */
    public String jobNumber;

    /** 姓名 */
    public String name;

    /** 年龄 */
    public int age;

    /** 性别 */
    public char sex;

    /**
     * Staff 无参构造
     */
    public Staff() {
        System.out.println("父类Staff无参构造被调用了");
    }

    /**
     * 两个参数的构造参数
     * @param jobNumber 工号
     * @param name 姓名
     */
    public Staff(String jobNumber, String name) {
        this.jobNumber = jobNumber;
        this.name = name;
    }

    // get,set 方法
    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * getMessage 方法只提示信息
     */
    public void getMessage() {
        System.out.println("我只是个普通员工");
    }
}
