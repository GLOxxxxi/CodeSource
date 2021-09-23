package designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例模式——容器
 */

public class SingletonManager {
    /**
     * 创建静态容器
     */
    private static Map<String, Object> objectMap = new HashMap<>();

    /**
     * 私有构造
     */
    private SingletonManager() {}

    /**
     * 看是否存在实例没有就创建实例添加到容器
     * @param key key值
     * @param instance 实例
     */
    public static void registerService(String key, Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    /**
     * 获取实例
     * @param key key值
     * @return 实例
     */
    public static Object getService(String key) {
        return objectMap.get(key);
    }
}
