package br.com.generation.Animal;

public class Cachorro  extends Animal implements Animal1 {

	@Override
	public void Som() {
		System.out.println("Som do Cachorro: Au Au Au Au Au !! ");
	}
	
	@Override
	public void Correr() {
		System.out.println("Corre: Brincar no Parte !!");
	}
	
}
