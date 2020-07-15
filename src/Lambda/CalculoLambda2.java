package Lambda;

import java.util.function.BinaryOperator;

public class CalculoLambda2 {

    public static void main(String[] args) {
        /**
         * Binaryoperator = é uma interface do java que represeta uma operação sobre dois operadores do mesmo tipo.
         * com isso não é necessario criar a interface "Calculo"
         */
        BinaryOperator<Double> calc = (x, y) -> x + y;

        System.out.println(calc.apply(2.0, 3.0));

    }


}
