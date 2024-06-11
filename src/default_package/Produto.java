// Classes

/*
 * Os nomes das classes iniciam com letra maiúscula
 * O nome não deve conter: Acentuação, caracteres especiais, espaço
 * Nas classes Java, não existe a implementação da função main()
 * Tudo que estiver dentro das "chaves" {}, está dentro da classe
 * Toda classe Java possui a seguinte forma:
 * 
 * public class NomeDaClasse {
 * 
 * } 
 */
package default_package;

// Atributos

/*
 * São as características da classe/molde/modelo de dados;
 * Podemos entender atributos como variáveis da classe;
 * Uma outra forma de nomenclatura para os atributos são os estados;
 * Atributos são nomeados em letras minúsculas, sem espaços, sem caracteres especiais,
 * sem acentuação.
 * */

// Métodos

/*
 * Podemos entender que métodos são ações realizadas por um objeto da classe
 * Podemos entender também que os métodos são comportamentos da classe
 * 
 * Mesmo requisitos para funções
 * 	a) Tipo de retorno (Tipo de dado que a função vai retornar);
 * 	b) Nome - corresponde a ação que o método irá realizar;
 * 	c) Parâmetros/Argumentos de entrada (Opcional);
 * 	d) Retorno (Opcional - Depende do tipo de dado do método);
 * */
public class Produto {
	String nome;
	float preco;
	float desconto;
	
	// Método para aumentar o valor do produto
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
}
