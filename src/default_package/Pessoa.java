// Classes

// Atributos

// Construtor

/*
 * O construtor de uma classe SEMPRE tem o mesmo nome da classe
 * Por padrão a JVM - Java Virtual Machine, cria um construtor vazio
 * Podemos ter mais de um construtor na classe
 */

/*
 * Estrutura de um método construtor
 * 
 * public NomeDaClasse {
 * 
 * }
 */
package default_package;

public class Pessoa {
	String nome;
	String email;
	int ano_de_nascimento;
	
	// Construtor vazio
	public Pessoa() {
		
	}
	
	// Construtor com parâmetros
	public Pessoa(String nome, String email, int ano_de_nascimento) {
		// this == Este objeto
		this.nome = nome;
		this.email = email;
		this.ano_de_nascimento = ano_de_nascimento;
	}
	
	void imprime_informacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("Ano de Nascimento: " + this.ano_de_nascimento);
	}
}
