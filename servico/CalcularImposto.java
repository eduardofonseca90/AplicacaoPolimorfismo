package Polimorfismo.servico;

import Polimorfismo.Dominio.Produto;

public class CalcularImposto {
    public static void CalcularImposto (Produto produto) {
        System.out.println("---Imposto por produto---");
        double impostoProduto = produto.calcularImpostos();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + impostoProduto);
        System.out.println("Valor final do produto: " + (impostoProduto + produto.getValor()));
    }
}
