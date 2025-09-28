package Polimorfismo.AppTest;

import Polimorfismo.Dominio.Bebidas;
import Polimorfismo.Dominio.Frutas;
import Polimorfismo.Dominio.Notebook;
import Polimorfismo.Dominio.Produto;
import Polimorfismo.Dominio.Televisao;
import Polimorfismo.servico.CalcularImposto;

public class AppTest01 {
    public static void main(String[] args) {
        Produto produto = new Notebook("Asus TUF16", 6200);
        
        Produto produto2 = new Televisao("TV 65\" LG", 2780);

        Produto produto3 = new Bebidas("Coca-cola", 8.75);

        Produto produto4 = new Frutas("Maçã", 6.85);

        CalcularImposto.CalcularImposto(produto);
        System.out.println("--------------------");
        
        CalcularImposto.CalcularImposto(produto2);
        System.out.println("--------------------");

        CalcularImposto.CalcularImposto(produto3);
        System.out.println("--------------------");

        CalcularImposto.CalcularImposto(produto4);

    }
}
