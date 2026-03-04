# Projeto Orientação a Objetos - Classe Mochila

## 🎒 Sobre o Projeto
Este projeto foi desenvolvido como prática de Programação Orientada a Objetos (POO). O objetivo é modelar um objeto do mundo real no código, definindo suas características (atributos) e seus comportamentos (métodos), além de proteger a integridade dos seus dados através de regras de negócio.

## 🌍 O que o objeto representa no mundo real?
A classe `Mochila` representa o acessório físico que usamos no dia a dia para transportar itens. 

No mundo real, uma mochila possui características de fábrica que não mudam (como sua cor, seu material e o limite de peso que suporta sem rasgar). Ao mesmo tempo, ela possui um estado dinâmico: o peso das coisas que estão guardadas dentro dela em um determinado momento. O nosso sistema simula essa interação de colocar e tirar coisas, garantindo que as leis da física sejam respeitadas no código.

## ⚙️ Estrutura da Classe (Atributos)
Para representar as características da mochila, a classe possui os seguintes atributos de estado:
* **`cor`** (String): Define a cor do tecido da mochila (ex: "Cinza", "Preta").
* **`material`** (String): Define do que ela é feita (ex: "Nylon", "Couro").
* **`capacidadeEmKg`** (int): O limite máximo de peso que a estrutura da mochila suporta.
* **`pesoAtual`** (double): O atributo que guarda o estado dinâmico. Toda mochila começa vazia (0.0) e esse valor é alterado pelos métodos.

## 🛠️ Comportamentos e Regras de Negócio (Métodos)
Para que a mochila deixe de ser apenas um molde de dados e passe a ter comportamentos, foram criados dois métodos. Eles possuem validações (`if`) para blindar o objeto contra estados inconsistentes.

* **`guardarItem(double pesoItem)`**: Simula a inserção de um item. 
  * *Regra de negócio:* O peso do item deve ser maior que zero. Além disso, a soma do peso do item com o `pesoAtual` não pode ultrapassar a `capacidadeEmKg` máxima da mochila. Se ultrapassar, a ação é bloqueada.
* **`retirarItem(double pesoItem)`**: Simula a remoção de um item.
  * *Regra de negócio:* O peso a ser retirado deve ser válido (positivo) e não pode ser maior do que o peso que já está contido na mochila, impedindo que o `pesoAtual` fique negativo.

## 🚀 Como usar e testar
No arquivo `SistemaPrincipal.java`, fazemos a instanciação e o teste prático da classe:

```java
// 1. Instanciando a mochila e definindo seus atributos fixos via construtor
Mochila minhaMochila = new Mochila("Cinza", "Nylon", 10);

// 2. Usando os métodos para alterar o estado (pesoAtual)
minhaMochila.guardarItem(5.0); // Sucesso: o peso atual passa a ser 5.0Kg
minhaMochila.guardarItem(6.0); // Bloqueado: 11Kg ultrapassa a capacidade de 10Kg
minhaMochila.retirarItem(2.0); // Sucesso: o peso atual cai para 3.0Kg
