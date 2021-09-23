package clazzcode.classcode0919;

public class DP {
    public static void main(String[] args) {

    }

    /**
     * 动态规划 DP
     * @param n
     * @return
     */
    public static int fn(int n) {
        // p  q   r
        int p = 0; // 上一轮
        int q = 0; // 这一轮
        int r = 1; // 当前和
        for (int i = 0; i < n; i++) {
            //
            q = p;
            // 上一轮
            p = r;
            // 下一轮
            r = q + r;
            System.out.println(p + " + " + q + " = " + r);
        }

        return r;
    }
}
