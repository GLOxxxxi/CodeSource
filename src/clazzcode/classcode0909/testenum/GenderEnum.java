package clazzcode.classcode0909.testenum;

/**
 * 性别枚举GenderEnum，包括三种性别字段
 */
public enum GenderEnum {
    /** 性别男 */
    MAN, // 相当于调用无参构造 写一个字段就相当于 GenderEnum MAN = new GenderEnum()

    /** 性别女 */
    WOMAN,

    /** 性别未知 */
    UNKNOWN;

    /**
     * 重写toString
     * @return 性别
     */
    @Override
    public String toString() {
        // 选择指定的字段返回其中文
        switch (this) {
            case MAN:
                return "男";
            case WOMAN:
                return "女";
            case UNKNOWN:
                return "未知";
            default:
                return "秀吉";
        }
    }
}
