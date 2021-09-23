package javaadvanced.lambda;

public class Lambda {

    @FunctionalInterface
    interface Function<T, R> {
        R apply(T t);
    }

    interface MathOperator {
        // 有两个形参的接口
        int operator(int a, int b);
    }

    interface MathOperatorByOne {
        int operatorByOne(int a);
    }

    interface StringTemp {
        String str(String str);
    }

    interface MathTemp {
        void opp(String str);
    }

    public static void main(String[] args) {
        MathTemp mt = (message) ->
                System.out.println("azhe" + message);
        mt.opp("meishile");
        int x = 2;
        int y = 4;

        // lambda表达式的参数列表不用写参数类型，它会自动识别类型
        MathOperatorByOne temp = a -> 5;
        MathOperator add = (a, b) -> a + b;
        MathOperator addPlus = Integer::sum;
        MathOperator sub = (a, b) -> a - b;
        MathOperator mul = (int a, int b) -> {
            // 有大括号就需要返回语句
            if (a < b) {
                return a * b;
            } else {
                return (int) Math.pow(a, 2);
            }
        };
        MathOperator div = (int a, int b) -> a / b;
        // 引用类型
        StringTemp st = str -> "hel ava " + str;
        System.out.println(st.str("my prince"));

        System.out.println("加:" + add.operator(x, y));
        System.out.println("加Plus:" + addPlus.operator(x, y));
        System.out.println("减:" + sub.operator(x, y));
        System.out.println("乘:" + mul.operator(x, y));
        System.out.println("除:" + div.operator(x, y));
        System.out.println("一个参数:" + temp.operatorByOne(x));

        // 修改Lambda访问过的局部变量不能被修改
//        int port = 127;
//        Runnable runnable = () -> System.out.println(port);
//        port = 137;
//        System.out.println(port);

        // 匿名内部类 已经可以被Lambda替代
        MathOperator mo = new MathOperator() {
            @Override
            public int operator(int a, int b) {
                return a + b;
            }
        };

    }
}

