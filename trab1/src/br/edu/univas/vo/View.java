package br.edu.univas.vo;

import br.edu.univas.list.List;

public class View {
	
	
	public void StartGame(List list) {
		
		System.out.println("BEM VINDO AO DOMIN� LOOOUUUCCOOO!!!");
		System.out.println("Estas aqui s�o as suas pe�as!!");
		System.out.println(list.getAsString());
		
	}

	public void CaraCoroa () {
		
		System.out.println("Hora de escolher quem ir� jogar primeiro!");
		System.out.println("Escolha uma dessas op��es abaixo:");
		System.out.println("1 - Cara");
		System.out.println("2 - Coroa");
		System.out.println("Qualquer outra op��o ser� desconsiderada!");
		
		
	}
	
	public void Playing (){
		
		System.out.println("\nSua vez de jogar!!");
		System.out.println("Escolha uma pe�a usando: 1 para a primeira, 2 para a segunda e assim consecutivamente:");
		System.out.println("Para comprar pe�as, digite 100!!");
		System.out.println("");
		
	}
	
	public void pecasNaMesa (List pecasJogadas) {
		System.out.println("PECAS NA MESA");
		System.out.println("==============================================================================================================================================================================");
		System.out.println(pecasJogadas.getAsString());
		System.out.println("==============================================================================================================================================================================");
		
	}

	public void pecasParaComprar (List list) {
		
		System.out.println("T� na hora de comprar pecinhas, selecione 1 para a primeira, 2 a segunda e assim consecutivamente!");
		System.out.println("Digite 200 para comprar e passar a vez, ou 300 para comprar e jogar\n");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(list.getAsString());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
	}

}
