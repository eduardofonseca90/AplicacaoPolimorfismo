🧠 #Polimorfismo em Java – Sistema de Cálculo de Impostos

Este projeto foi desenvolvido com o objetivo de praticar conceitos fundamentais de Programação Orientada a Objetos (POO) em Java, com foco especial em polimorfismo e interfaces.

A aplicação simula um sistema simples de cálculo de impostos para diferentes tipos de produtos, mostrando como diferentes classes podem compartilhar comportamentos através de uma interface e ao mesmo tempo ter implementações específicas.

🚀 ##Funcionalidades

Cálculo de imposto para diferentes produtos (Notebook, Televisão, Bebidas e Frutas).

Uso de interface (Impostos) para garantir que todas as classes tenham o método de cálculo.

Aplicação do polimorfismo, permitindo que diferentes objetos sejam manipulados pela mesma referência (Produto).

Exibição do valor do imposto e do valor final de cada produto.

🧩 ##Conceitos aplicados

🔁 Polimorfismo: Permite que objetos de diferentes classes sejam tratados de forma uniforme, usando a referência da classe pai (Produto) para chamar métodos específicos de cada classe filha.

⚙️ Interface: A interface Impostos define o método calcularImpostos() que todas as classes de produto devem implementar.

🏗️ Herança: As classes Notebook, Televisao, Bebidas e Frutas herdam de Produto, aproveitando atributos e comportamentos comuns.

📂 ##Estrutura do projeto
Polimorfismo/
├── Dominio/
│   ├── Produto.java
│   ├── Impostos.java
│   ├── Notebook.java
│   ├── Televisao.java
│   ├── Bebidas.java
│   └── Frutas.java
├── servico/
│   └── CalcularImposto.java
└── AppTest/
    └── AppTest01.java

##Tecnologias utilizadas

☕ Java 17+

💻 IDE VS Code


