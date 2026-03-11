package br.com.fiapride.main;

import br.com.fiapride.model.Mochila;

public class TesteMochila {

    public static void main(String[] args) {
        
        Mochila minhaMochila = new Mochila("Cinza", "Nylon", 10);
        System.out.println("Guardando item na minha mochila");
        minhaMochila.guardarItem(10.0);

        Mochila mochilaDoColega = new Mochila("Marrom", "Couro", 12);
        System.out.println("\nGuardando item na mochila do colega");
        mochilaDoColega.guardarItem(3.0);

        System.out.println("\n--- Sistema de Mochilas ---");
        System.out.println("Mochila: " + minhaMochila.getCor() + " de " + minhaMochila.getMaterial() + " | Peso Atual: " + minhaMochila.getPesoAtual() + "Kg | Capacidade: " + minhaMochila.getCapacidadeEmKg() + "Kg");
        System.out.println("Mochila: " + mochilaDoColega.getCor() + " de " + mochilaDoColega.getMaterial() + " | Peso Atual: " + mochilaDoColega.getPesoAtual() + "Kg | Capacidade: " + mochilaDoColega.getCapacidadeEmKg() + "Kg");
        
        System.out.println("\nRetirando item da minha mochila");
        minhaMochila.retirarItem(3.0);
        
        System.out.println("\nRetirando item da mochila do colega");
        mochilaDoColega.retirarItem(5.0);

        // Provando que a minha classe está protegida
        System.out.println("\n--- Tentando Burlar o Sistema ---");
        
        System.out.println(">> Tentando alterar capacidade para -5Kg:");
        minhaMochila.setCapacidadeEmKg(-5);

        System.out.println("\n>> Tentando alterar capacidade para 70Kg:");
        minhaMochila.setCapacidadeEmKg(70);
        System.out.println("\nStatus final: A capacidade da minha mochila continua segura em " + minhaMochila.getCapacidadeEmKg() + "Kg!");
    }
}