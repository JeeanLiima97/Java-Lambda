package Lambda;

public class CalculoLambda {

    public static void main(String[] args) {
        // referencia ao metedo de calculo que recebe 2 parametros
        Calculo calc = (x, y) -> x + y;

        Calculo mult = (x, y) -> x * y;
        System.out.println(calc.executa(5, 4));
        System.out.println(mult.executa(4, 5));
    }
}
