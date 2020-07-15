package Predicate;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {
        Predicate<Produto> isCaro =
                prod -> prod.preco >= 700;
        Produto produto = new Produto("Notebook", 5.0, 0.1);
        System.out.println(isCaro.test(produto));
    }


}
