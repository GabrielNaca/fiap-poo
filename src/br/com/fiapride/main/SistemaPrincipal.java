package br.com.fiapride.main;

// Importamos a classe Mochila para que o sistema a reconheça
import br.com.fiapride.model.Mochila;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// Dentro do main...// Fabriquei a primeira (Instância 1)
		Mochila minhaMochila = new Mochila();
		minhaMochila.cor = "Cinza";
		minhaMochila.material = "Nylon";
		minhaMochila.capacidadeEmKg = 10;
		// Fabriquei a segunda (Instância 2)
		Mochila mochilaDoColega = new Mochila();
		mochilaDoColega.cor = "Marrom";
		mochilaDoColega.material = "Couro";
		mochilaDoColega.capacidadeEmKg = 12;
		System.out.println("Minha mochila é: " + minhaMochila.cor + ", feita de " + minhaMochila.material
				+ " e aguenta aproximadamente " + minhaMochila.capacidadeEmKg + "Kg ");
		System.out.println("A do colega é: " + mochilaDoColega.cor + ", feita de " + mochilaDoColega.material
				+ " e aguenta aproximadamente " + mochilaDoColega.capacidadeEmKg + "Kg ");
	}
}