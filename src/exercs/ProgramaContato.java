package exercs;

public class ProgramaContato {

	public static void main(String[] args) {
		// Instaciando o objeto
		Contato contato = new Contato();
		
		// Setando os dados
		contato.setNome("Kevin De Bruyne");
		contato.setEmail("kdb17@gmail.com");
		contato.setNumero("99999-5555");
		
		// Imprimindo os dados
		contato.imprimirDados();
	}

}
