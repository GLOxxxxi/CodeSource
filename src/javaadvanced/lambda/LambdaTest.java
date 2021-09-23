package javaadvanced.lambda;

import java.util.function.Function;

public class LambdaTest {
    interface MathTemp {
        void opp (String str);
    }

    public static void main(String[] args) {
        MathTemp mt = message -> System.out.println("azhe " + message);
        mt.opp("wori");

        // 模仿线程使用lambda
        System.out.println(new GetSumMessageImpl((a, b) ->
                2 * a + b / 2
        ).getMessage(4, 4));

        IGetSumMessage getSumMessage = (a, b) -> 2 * a + b / 2;
        System.out.println(getSumMessage.getMessage(4, 4));

        //
        String str = "adc";
        Function<String, Boolean> function = str::endsWith;
        System.out.println(function);
    }
}
