package Consumer;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// consumer -> Recebe um unico parametro e não retorna nada
public class Consumidor {

    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.50, 01);
        Produto p2 = new Produto("Lapis", 12.50, 01);
        Produto p3 = new Produto("Carderno", 12.50, 01);
        imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(p1, p2, p3);
        // exemplo com forEach
        produtos.forEach(imprimir);

        //exemplo com a lambda direto
        produtos.forEach(p -> System.out.println(p.nome));
    }
}
