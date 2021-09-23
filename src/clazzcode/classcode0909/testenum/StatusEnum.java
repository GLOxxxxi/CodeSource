package clazzcode.classcode0909.testenum;
/**
 * 状态枚举 StatusEnum，包含五个状态字段
 */
public enum StatusEnum {
    /** 状态 在线 */
    ONLINE("在线"),

    /** 状态 离线 */
    OFFLINE("离线"),

    /** 状态 忙碌 */
    BUSY("忙碌"),

    /** 状态 工作中 */
    WORKING("工作中"),

    /** 状态 发车了 */
    DRIVING("发车了");

    /** 实例变量接收状态 */
    private final String status;

    /**
     * 有参构造
     * @param status 状态
     */
    StatusEnum(String status) {
        this.status = status;
    }

    /**
     * 重写toString
     * @return 当前状态
     */
    @Override
    public String toString() {
        return status;
    }
}
