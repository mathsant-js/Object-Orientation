package exercs;

/*
 *  Crie uma classe Agenda que pode armazenar contatos, podendo realizar as seguintes
operações:
- void armazenarContato(Contato contato);
- void removeContato(Contato contato);
- int buscaContato(String nome); // Informa em que posição da agenda está o contato.
- void imprimeAgenda(); // Imprime os dados de todos os contatos da agenda.
- void imprimeContato(int index); 
- // Imprime os dados do contato que está no índice informado.
 */

import java.util.ArrayList;

public class Agenda {
	ArrayList<Contato> contatos = new ArrayList<Contato>();
	
	void armazenarContato(Contato contato) {
		this.contatos.add(contato);
	}
	
	void removeContato(Contato contato) {
		this.contatos.remove(contato);
	}
	
	int buscaContato(String nome) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getNome() == nome) {
				return i;
			}
		}
		return -1;
	}
	
	void imprimeAgenda() {
		System.out.println("========AGENDA========");
			for (Contato contato : contatos) {
				contato.imprimirDados();
			}
		System.out.println("========FIM========");
	}
	
	void imprimeContato(int index) {
		contatos.get(index).imprimirDados();
	}
	
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		Contato contato1 = new Contato();
		contato1.setNome("Kevin De Bruyne");
		contato1.setEmail("17@gmail.com");
		contato1.setNumero("555-78956");
		
		Contato contato2 = new Contato();
		contato2.setNome("Eden Hazard");
		contato2.setEmail("EdHazard@gmail.com");
		contato2.setNumero("555-79999");

		Contato contato3 = new Contato();
		contato3.setNome("Luis Openda");
		contato3.setEmail("99@gmail.com");
		contato3.setNumero("555-85555");
		
		// void armazenarContato(Contato contato);
		agenda.armazenarContato(contato1);
		agenda.armazenarContato(contato2);
		agenda.armazenarContato(contato3);
		
		// void imprimeAgenda();
		agenda.imprimeAgenda();
		
		// void imprimeContato(int index);
		agenda.imprimeContato(2);
		
		// int buscaContato(String nome);
		System.out.println(agenda.buscaContato("Luis Openda"));
		
		// void removeContato(Contato contato);
		agenda.removeContato(contato3);
		
		// void imprimeAgenda
		agenda.imprimeAgenda();

	}

}
