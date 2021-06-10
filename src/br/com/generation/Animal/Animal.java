package br.com.generation.Animal;

public abstract class  Animal implements Animal1 {

	private String Nome;
	private int Idade;
	private String comidas;
	
	
	public String getComidas() {
		return comidas;
	}
	public void setComidas(String comidas) {
		this.comidas = comidas;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	
	void subir (String subir) {
		
	}
	
}
