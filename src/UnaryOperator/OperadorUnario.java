package UnaryOperator;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {


        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadr = n -> n * n;

        System.out.println(maisDois.apply(5));
        System.out.println(vezesDois.apply(2));
        System.out.println(aoQuadr.apply(10));

        System.out.println(maisDois
                .andThen(vezesDois)
                .andThen(aoQuadr)
                .apply(0));

    }

}
