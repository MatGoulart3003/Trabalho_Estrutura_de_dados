package br.edu.univas.vo;

import br.edu.univas.list.List;

public class View {
	
	
	public void StartGame(List list) {
		
		System.out.println("BEM VINDO AO DOMINÓ LOOOUUUCCOOO!!!");
		System.out.println("Estas aqui são as suas peças!!");
		System.out.println(list.getAsString());
		
	}

	public void CaraCoroa () {
		
		System.out.println("Hora de escolher quem irá jogar primeiro!");
		System.out.println("Escolha uma dessas opções abaixo:");
		System.out.println("1 - Cara");
		System.out.println("2 - Coroa");
		System.out.println("Qualquer outra opção será desconsiderada!");
		
		
	}
	
	public void Playing (){
		
		System.out.println("\nSua vez de jogar!!");
		System.out.println("Escolha uma peça usando: 1 para a primeira, 2 para a segunda e assim consecutivamente:");
		System.out.println("Para comprar peças, digite 100!!");
		System.out.println("");
		
	}
	
	public void pecasNaMesa (List pecasJogadas) {
		System.out.println("PECAS NA MESA");
		System.out.println("==============================================================================================================================================================================");
		System.out.println(pecasJogadas.getAsString());
		System.out.println("==============================================================================================================================================================================");
		
	}

	public void pecasParaComprar (List list) {
		
		System.out.println("Tá na hora de comprar pecinhas, selecione 1 para a primeira, 2 a segunda e assim consecutivamente!");
		System.out.println("Digite 200 para comprar e passar a vez, ou 300 para comprar e jogar\n");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(list.getAsString());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
	}

}
