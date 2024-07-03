package exercs;

/*
 *  Crie uma classe para representar um contato, com os atributos privados de nome,
 * email e telefone. Crie os métodos públicos necessários para sets e gets
 * e também um método para imprimir os dados de uma pessoa. 
 * Crie também um programa, instancie um objeto desta classe
 * e imprima os dados do objeto.
 * */

public class Contato {
	private String nome, email, numero;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("Telefone: " + this.numero);
	}
	
	
}
