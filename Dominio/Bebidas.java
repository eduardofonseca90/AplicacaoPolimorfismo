package Polimorfismo.Dominio;

public class Bebidas extends Produto {
    public static final double IMPOSTO_BEBIDAS = 0.15;

    public Bebidas(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpostos() {
        System.out.println("Imposto a ser pago na TV: ");
        return valor * IMPOSTO_BEBIDAS;
    }
}
