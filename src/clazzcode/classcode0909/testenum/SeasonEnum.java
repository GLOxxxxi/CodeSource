package clazzcode.classcode0909.testenum;

/**
 * 季节枚举SeasonEnum，包含四个季节字段
 */
public enum SeasonEnum {
    /** 季节字段，春天 */
    SPRING("春天"), // 有参构造 只写一个字段就相当于 SeasonEnum SPRING = new SeasonEnum("春天")

    /** 季节字段，夏天 */
    SUMMER("夏天"),

    /** 季节字段，秋天 */
    AUTUMN("秋天"),

    /** 季节字段，冬天 */
    WINTER("冬天");

    /** 实例变量只能写在字段下面 */
    private final String season;

    /**
     * 有参构造
     * @param season 字段中文
     */
    SeasonEnum(String season) {
        this.season = season;
    }

    /**
     * 重写toString
     * @return 季节中文名
     */
    @Override
    public String toString() {
        return this.season;
    }
}
