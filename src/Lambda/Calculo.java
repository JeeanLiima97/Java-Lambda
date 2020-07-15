package Lambda;
// anotação para forçar apenas a criação de um metodo abstrato
@FunctionalInterface
public interface Calculo {

    double executa(double a, double b);
}
