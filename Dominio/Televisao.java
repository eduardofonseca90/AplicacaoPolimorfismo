package Polimorfismo.Dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO_TV = 0.18;
    
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpostos() {
        System.out.println("Imposto a ser pago na TV: ");
        return valor * IMPOSTO_TV;
    }
}
