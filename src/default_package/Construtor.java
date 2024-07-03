// Construtor

/*
 * O construtor de uma classe SEMPRE tem o mesmo nome da classe
 * Por padrão a JVM - Java Virtual Machine, cria um construtor vazio
 * Podemos ter mais de um construtor na classe
 */

package default_package;

public class Construtor {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Cristiano Ronaldo";
		pessoa1.email = "cr7_oficial@gmail.com";
		pessoa1.ano_de_nascimento = 1985;
		
		pessoa1.imprime_informacoes();
		
		System.out.println();
		
		Pessoa pessoa2 = new Pessoa("Lionel Messi", "messi10_oficial@gmail.com", 1986);
		pessoa2.imprime_informacoes();
	}
}
