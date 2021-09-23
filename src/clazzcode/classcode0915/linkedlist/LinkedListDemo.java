package clazzcode.classcode0915.linkedlist;

public class LinkedListDemo {

    /** 集合大小 */
    private int size;

    /** 头结点 */
    private Node first;

    public LinkedListDemo() {}

    /**
     * LinkedList有参构造
     * @param initCapacity 初始化容量
     */
    public LinkedListDemo(int initCapacity) {
//         size = initCapacity;
//        for (int i = 0; i < size; i++) {
//
//        }
    }

    public int size(){
        return size;
    }

    /**
     * 添加对象到集合中
     * @param o 添加的元素
     */
    public void add(Object o) {
        // 创建新的结点
        Node node = new Node(o);
        // 判断是否是头结点
        if (first == null) {
            first = node;
        } else {
            // 将头结点暂存
            Node temp = first;
            // 将暂存的结点转移到最后一个结点
            while (temp.next != null) {
                temp = temp.next;
            }
            // 在最后一个结点的next存储新增节点的地址
            temp.next = node;
        }
        // 增加尺寸
        size++;
    }

    /**
     * 删除指定下标元素
     * @param index 下标
     */
    public void deleteByIndex(int index) {
        // 检查下标是否越界
        checkIndex(index);
        if (index == 0) {
            // 如果删除头结点，直接将头结点的下一结点当头结点
            first = first.next;
        } else {
            // 不是头结点就要开始遍历，将头结点暂存
            Node temp = first;
            // 头结点的上一结点
            Node pre = first;
            for (int i = 0; i < index; i++) {
                // 存储下标的上一结点
                pre = temp;
                temp = temp.next;
            }
            if (temp.next == null) {
                pre = null;
            } else {
                pre.next = temp.next;
            }
        }
        size--;

    }

    /**
     * 在指定下标插入元素
     * @param index 指定下标
     * @param o 元素
     */
    public void insertByIndex(int index, Object o) {
        // 插入的结点对象
        Node node = new Node(o);
        Node temp = first;
        Node pre = first;
        // 插入头结点
        if (index == 0) {
            node.next = first;
            first = node;

        } else {
            for (int i = 0; i < index; i++) {
                pre = temp;
                temp = temp.next;
            }
            pre.next = node;
            node.next = temp;
        }
        size++;
    }

    /**
     * 通过下标获取元素
     * @param index 下标
     * @return 获取元素
     */
    public Object getByIndex(int index) {
        // 检查是否越界
        checkIndex(index);
        // 将第一个存进 结点 对象
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
//        int count = 0;
//        // 判断是否有下一个 结点 遍历 各个结点获取下标元素
//        while (temp.next != null) {
//            if (count == index) {
//                return temp.value;
//            } else {
//                temp = temp.next;
//            }
//            count++;
//        }

        return temp.value;
    }

    /**
     * 根据指定下标更新元素
     * @param index 指定下标
     * @param o 更新的对象
     */
    public void updateByIndex(int index, Object o) {
        // 检查下标是否越界
        checkIndex(index);
        // 将头结点暂存
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = o;
    }

    /**
     * 检查下标是否越界
     * @param index 下标
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            // 抛出越界异常
            throw new IndexOutOfBoundsException("下标越界" + index);
        }
    }

    /**
     * 重写 toString
     * @return 集合字符串
     */
    @Override
    public String toString() {
        // 创建可变字符串
        StringBuilder sb = new StringBuilder("[");
        // 判断头结点是否为空
        if (first == null) {
            // 直接返回
            return sb.append("]").toString();
        }
        // 头结点不为空遍历链表
        Node temp = first;
        // 拼接结点的值
        sb.append(temp.value);
        // 遍历链表
        for (int i = 0; i < size - 1; i++) {
            sb.append(",");
            // 换下一结点
            temp = temp.next;
            sb.append(temp.value);
        }
        return sb.append("]").toString();
    }

    /**
     * 获取元素第一次出现在集合中的下标
     * @param o 获取的元素
     * @return 下标
     */
    public int getIndexOf(Object o) {
        // 下标标记
        int count = 0;
        // 暂存头结点
        Node temp = first;
        // 判断传进来的对象是否是空的
        if (o == null) {
            // 如果下一个节点不为空就遍历
            while (temp.next != null) {
                // 如果结点中的对象值是null
                if (null == temp.value) {
                    // 返回下标
                    return count;
                }
                // 没找到就接着遍历到下一个结点
                temp = temp.next;
                count++;
            }
        } else {
            while (temp.next != null) {
                if (o.equals(temp.value)) {
                    return count;
                }
                temp = temp.next;
                count++;
            }
        }
        return -1;
    }

    /**
     * 清空集合
     */
    public void clear() {
        first = null;
        size = 0;
    }


    /**
     * Node 类 结点对象包含下一结点地址，和当前结点的值
     */
    private static class Node{
        Object value;
        Node next;

        public Node() {}

        public Node(Object value) {
            this.value = value;
        }
    }

}
