package br.com.fiapride.model;

public class Mochila {
    private String cor;
    private String material;
    private int capacidadeEmKg;
    private double pesoAtual;

    public Mochila(String cor, String material, int capacidadeEmKg) {
        this.setCor(cor);
        this.material = material; 
        this.setCapacidadeEmKg(capacidadeEmKg); 
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

    public String getCor() { 
        return this.cor; 
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() { 
        return this.material; 
    }

    public int getCapacidadeEmKg() { 
        return this.capacidadeEmKg; 
    }

    public void setCapacidadeEmKg(int capacidadeEmKg) {
        if (capacidadeEmKg > 0 && capacidadeEmKg <= 50) {
            this.capacidadeEmKg = capacidadeEmKg;
        } else {
            System.out.println("Erro de Segurança: A capacidade informada (" + capacidadeEmKg + "Kg) é inválida. Deve ser entre 1 e 50Kg.");
        }
    }

    public double getPesoAtual() { 
        return this.pesoAtual; 
    }
}