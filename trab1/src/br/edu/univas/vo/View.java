package br.edu.univas.vo;

import br.edu.univas.list.List;

public class View {
	
	
	public void StartGame(List list) {
		
		System.out.println("Bem vindo ao Domin� louco!!!");
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
		System.out.println("Essas s�o suas pe�as!");
		System.out.println("Escolha uma delas usando: 1 para a primeira, 2 para a segunda e assim consecutivamente:");
		System.out.println("");
	}
	
}
