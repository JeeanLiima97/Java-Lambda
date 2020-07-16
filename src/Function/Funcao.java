package Function;

import java.util.function.Function;

// -> Aceita um unico argumento e produz um resultado
public class Funcao {

    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
        System.out.println(parOuImpar.apply(5));


        Function<String, String> oResultadoE = valor -> "O resultado é " + valor;

        Function<String, String> conc = nome -> "O nome é " + nome;

        Function<Integer, String> teste = num1 -> num1 > 10 ? "Maior que 10" : "Menor q 10";

        System.out.println(parOuImpar.andThen(oResultadoE).apply(14));

        System.out.println(conc.apply("Jean"));

        System.out.println(teste.apply(5));

    }

}
