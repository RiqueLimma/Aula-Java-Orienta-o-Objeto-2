package br.com.generation.Animal;

public class TesteAnimal {

	public static void main(String[] args) {

			Cachorro cachorro1 = new Cachorro();
			Cavalo cavalo1 = new Cavalo();
			Preguica preguica1 = new Preguica();
			
			cachorro1.setNome(" Pitó ");
			cachorro1.setIdade(3);
			cachorro1.setComidas(" Ração");
			
			cavalo1.setNome(" Alazão");
			cavalo1.setIdade(3);
			cavalo1.setComidas(" Ração e Capim");
			
			preguica1.setNome(" Zubumafu ");
			preguica1.setIdade(2);
			preguica1.setComidas(" Frutas e Coisas da Natureza");
			
			
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
			cavalo1.getIdade() + "\nTipos de Comidas:  " + cavalo1.getComidas());
			cavalo1.Som();
			cavalo1.Correr();
			System.out.println(" ");
			
			System.out.println("=================> Preguiça < =========================");
			System.out.println(" ");
			System.out.println("Nome Preguica: " + preguica1.getNome() + " \nIdade: "+
			preguica1.getIdade() + "\nTipos de Comidas" + preguica1.getComidas() + "Subir: ");
			preguica1.Som();
			preguica1.subir();
			
			
			
			
			

	}

}
