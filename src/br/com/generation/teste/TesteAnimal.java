package br.com.generation.teste;

import br.com.generation.Animal.Animal;
import br.com.generation.Animal.Cachorro;
import br.com.generation.Animal.Cavalo;
import br.com.generation.Animal.Preguica;

public class TesteAnimal extends Animal {

	public static void main(String[] args) {

			Cachorro cachorro1 = new Cachorro();
			Cavalo cavalo1 = new Cavalo();
			Preguica preguica1 = new Preguica();
			
			cachorro1.setNome(" Pit� ");
			cachorro1.setIdade(3);
			cachorro1.setComidas("Ra��o");
			
			
			System.out.println("=================> Cachorro < =========================");
			System.out.println(" ");
			System.out.println("Nome do Cavalo: " + cachorro1.getNome() + " \nIdade: "+
			cachorro1.getIdade() + "\nTipos de Comidas" + cachorro1.getComidas());
			cachorro1.Som();
			cachorro1.Correr();
			
			System.out.println(" ");
			
			System.out.println("=================> Cavalo < =========================");
			System.out.println(" ");
			System.out.println("Nome do Cavalo: " + cavalo1.getNome() + " \nIdade: "+
			cavalo1.getIdade() + "\nTipos de Comidas" + cavalo1.getComidas());
			cavalo1.Som();
			cavalo1.Correr();
			System.out.println(" ");
			
			System.out.println("=================> Pregui�a < =========================");
			System.out.println(" ");
			System.out.println("Nome do Cavalo: " + preguica1.getNome() + " \nIdade: "+
			preguica1.getIdade() + "\nTipos de Comidas" + preguica1.getComidas());
			preguica1.Som();
			preguica1.Subir();
			
			
			
			
			

	}

}
