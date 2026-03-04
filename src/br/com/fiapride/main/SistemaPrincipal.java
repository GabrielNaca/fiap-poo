package br.com.fiapride.main;

import br.com.fiapride.model.Mochila;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Mochila minhaMochila = new Mochila("Cinza", "Nylon", 10);
        System.out.println("Guardando item na minha mochila");
        minhaMochila.guardarItem(10.0);

        Mochila mochilaDoColega = new Mochila("Marrom", "Couro", 12);
        System.out.println("Guardando item na mochila do colega");
        mochilaDoColega.guardarItem(3.0);

        System.out.println("--- Sistema de Mochilas ---");
        System.out.println("Mochila: " + minhaMochila.cor + " de " + minhaMochila.material + " | Peso Atual: " + minhaMochila.pesoAtual + "Kg | Capacidade: " + minhaMochila.capacidadeEmKg + "Kg");
        System.out.println("Mochila: " + mochilaDoColega.cor + " de " + mochilaDoColega.material + " | Peso Atual: " + mochilaDoColega.pesoAtual + "Kg | Capacidade: " + mochilaDoColega.capacidadeEmKg + "Kg");
        
        System.out.println("Retirando item da minha mochila");
        minhaMochila.retirarItem(3.0);
        
        System.out.println("Retirando item da mochila do colega");
        mochilaDoColega.retirarItem(5.0);
    }
}