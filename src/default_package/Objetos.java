package default_package;

// Objetos

// Objetos são instâncias de uma classe

public class Objetos {

	public static void main(String[] args) {
		// Declaração de um objeto
		Produto produto;
		
		// Instanciação/Inicialização de um objeto
		produto = new Produto();
		
		// Declaração e instaciação de um objeto
		Produto produto1 = new Produto();
		Pessoa pessoa = new Pessoa();
		
		// Atributos sendo inicializados
		produto.nome = "Notebook";
		produto.preco = 3500f;
		produto.desconto = 15f;
		
		produto.nome = "Mouse";
		produto.preco = 75f;
		produto.desconto = 5f;
		
		pessoa.nome = "Cristiano Ronaldo";
		pessoa.email = "cr7_oficial@gmail.com";
		pessoa.ano_de_nascimento = 1985;
		
		System.out.println("====== Produtos ======");
		
		System.out.println("Nome: " + produto.nome);
		System.out.println("Preço: " + produto.preco);
		System.out.println("Desconto: " + produto.desconto);
		
		System.out.println();
		
		System.out.println("Nome: " + produto1.nome);
		System.out.println("Preço: " + produto1.preco);
		System.out.println("Desconto: " + produto1.desconto);
		
		System.out.println();
		
		System.out.println("====== Pessoa ======");
		
		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Email: " + pessoa.email);
		System.out.println("Ano de Nascimento: " + pessoa.ano_de_nascimento);
	}

}
