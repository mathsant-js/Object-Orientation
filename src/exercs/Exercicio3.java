package exercs;

/*
 * Crie uma classe Televisao e uma classe ControleRemoto que pode controlar a televisão, 
 * como ligar e desligar, trocar canais e aumentar e diminuir o volume.
 * - O controle de volume permite aumentar ou 
 * diminuir a potência do volume de som em uma unidade de cada vez.
 * - O controle de canal permite aumentar ou diminuir o número do canal
 * em uma unidade, porém também possibilita trocar para um canal indicado.
 */

public class Exercicio3 {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		
		tv.liga_desliga();
		
		tv.aumentar_canal();
		tv.aumentar_canal();
		
		tv.mudar_canal(42);
		
		tv.diminuir_canal();
		
		tv.aumentar_volume();
		tv.aumentar_volume();
		tv.aumentar_volume();
		
		tv.diminuir_volume();
		tv.diminuir_volume();
		
		tv.liga_desliga();

	}

}
