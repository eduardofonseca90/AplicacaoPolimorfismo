package Polimorfismo.Dominio;

public class Frutas extends Produto {
    public static final double IMPOSTO_FRUTAS = 0.07;
    
    public Frutas(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpostos() {
        System.out.println("Imposto a ser pago na TV: ");
        return valor * IMPOSTO_FRUTAS;
    }
}
