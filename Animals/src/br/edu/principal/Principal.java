package br.edu.principal;
import br.edu.animals.*;
public class Principal {

	public static void main(String [] args) {
		Cachorro c1 = new Cachorro();
		Cavalo ca1 = new Cavalo();
		Preguica p1 = new Preguica();
		
		c1.Comer();
		c1.Correr();
		c1.Sonar();
		
		ca1.Comer();
		ca1.Correr();
		ca1.Sonar();
		
		p1.Comer();
		p1.Correr();
		p1.Sonar();
	}
}
