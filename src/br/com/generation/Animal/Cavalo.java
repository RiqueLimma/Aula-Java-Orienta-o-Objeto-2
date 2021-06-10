package br.com.generation.Animal;

public class Cavalo extends Animal implements Animal1{
	
	@Override
	public void Som() {
		System.out.println("Som do Cavalo: Hi Hi Hi Hi Hi !! ");
	}
	
	@Override
	public void Correr() {
		System.out.println("Corre: Campeonato de Polo !!");
	}
}
