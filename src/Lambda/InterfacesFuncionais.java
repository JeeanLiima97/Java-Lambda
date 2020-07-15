package Lambda;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class InterfacesFuncionais {
    /**
     * Assinatura | Nome
     * nada ->T | Supplier
     * T -> nada | Consumer
     * T -> T | UnaryOperator
     * T,T -> T | BinaryOperator
     * S -> T | Function
     * T -> boolean -> Predicate
     */

    BinaryOperator<Double> calc = (x, y) -> x + y;

}
