package br.com.fiapride.model;

public class Mochila {
    public String cor;
    public String material;
    public int capacidadeEmKg;
    public double pesoAtual;

    public Mochila(String cor, String material, int capacidadeEmKg) {
        this.cor = cor;
        this.material = material;
        this.capacidadeEmKg = capacidadeEmKg;
        this.pesoAtual = 0.0;
    }

    public void guardarItem(double pesoItem) {
        if (pesoItem <= 0) {
            System.out.println("Erro: O peso do item deve ser maior que zero.");
            return;
        }
        if (this.pesoAtual + pesoItem > this.capacidadeEmKg) {
            System.out.println("Erro: Capacidade excedida! A mochila não suporta este item.");
            return;
        }
        this.pesoAtual += pesoItem;
        System.out.println("Item guardado com sucesso. Peso atual: " + this.pesoAtual + "Kg");
    }

    public void retirarItem(double pesoItem) {
        if (pesoItem <= 0) {
            System.out.println("Erro: O peso a ser retirado deve ser maior que zero.");
            return;
        }
        if (this.pesoAtual - pesoItem < 0) {
            System.out.println("Erro: Não há peso suficiente na mochila para ser retirado.");
            return;
        }
        this.pesoAtual -= pesoItem;
        System.out.println("Item retirado com sucesso. Peso atual: " + this.pesoAtual + "Kg");
    }
}