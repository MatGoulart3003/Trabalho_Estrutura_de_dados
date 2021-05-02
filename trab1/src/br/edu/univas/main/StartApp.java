package br.edu.univas.main;



import java.util.Scanner;

import br.edu.univas.list.List;
import br.edu.univas.list.Peca;
import br.edu.univas.vo.View;

public class StartApp {
	static Scanner scan = new Scanner(System.in);
	static View vo = new View ();
	public static void main(String[] args) {
		
		
		List todasAsPecas = new List();
		List pecasPlayer = new List();
		List pecasBot = new List();
		List pecasJogadas = new List();
		boolean GameOver = false;
		
		
		todasAsPecas.createPeaces();
		todasAsPecas.setPeaces(pecasPlayer);
		todasAsPecas.setPeaces(pecasBot);
		vo.StartGame(pecasPlayer);
		int option = 0;
		
		do {
			
			vo.CaraCoroa();
			option = readInt();
			
			if (option > 2) {
				System.out.println("\n\nOpção incorreta, Escolha um numero entre 1 e 2!");
				
			}
			
		}while (option != 1 && option != 2);
		//int rand = 1 + (int) (Math.random() * 2);	
		if (option == 1) {
			
			do {
				
				gameplayPlayer(pecasPlayer, pecasJogadas);
				gameplayPlayer(pecasPlayer, pecasJogadas);
				gameplayPlayer(pecasPlayer, pecasJogadas);
				gameplayPlayer(pecasPlayer, pecasJogadas);
				gameplayPlayer(pecasPlayer, pecasJogadas);
				gameplayPlayer(pecasPlayer, pecasJogadas);
				gameplayPlayer(pecasPlayer, pecasJogadas);
				gameplayPlayer(pecasPlayer, pecasJogadas);
				gameplayPlayer(pecasPlayer, pecasJogadas);
				
				
				GameOver = true;
			}while(GameOver == false);
			
		}
		
		
		
		
		scan.close();
	}
	
	public static int readInt () {
		
		int number = scan.nextInt();
		scan.nextLine();		
		return number;
	}
	
	public static void gameplayPlayer (List list, List pecasJogadas) {
		
		Peca peca;
		int number;
		
		vo.Playing();
		System.out.println(list.getAsString());
		
		number = readInt();
		number--;
		peca = list.getElementAt(number);
		boolean aux = pecasJogadas.move(pecasJogadas, peca);
		if (aux == true) {
			peca = list.remove(peca.toString());
		}
		
		
		
		System.out.println(pecasJogadas.getAsString());
	}
	
	
}


