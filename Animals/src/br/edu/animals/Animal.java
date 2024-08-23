package br.edu.animals;

public class Animal {

protected String nome;
protected Double idade;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getIdade() {
		return idade;
	}
	public void setIdade(Double idade) {
		this.idade = idade;
	}

	public void Sonar(){
		System.out.println("Olha o barulhinho da cama renk renk renk");
	}
	public void Comer(){
		System.out.println("Nhami nhami");
	}
	public void Correr(){
		System.out.println("Run run run");
	}

}
