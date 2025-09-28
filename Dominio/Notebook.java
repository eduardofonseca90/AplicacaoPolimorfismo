package Polimorfismo.Dominio;

public class Notebook extends Produto {
    public static final double IMPOSTO_NOTEBOOK = 0.2;

    public Notebook(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpostos() {
        System.out.println("Imposto a ser pago Notebook: ");
        return valor * IMPOSTO_NOTEBOOK;
    }
}
