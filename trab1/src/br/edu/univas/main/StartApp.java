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
		todasAsPecas.setPeaces(pecasPlayer,todasAsPecas);
		todasAsPecas.setPeaces(pecasBot, todasAsPecas);
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
				
				GameOver = gameplayPlayer(pecasPlayer, pecasJogadas);
				GameOver = gameplayBot(pecasBot, pecasJogadas);
											
			}while(GameOver == false);
			
		}
		
		System.out.println("terminei com o game Over");
		
		
		scan.close();
	}
	
	private static boolean gameplayBot(List list, List pecasJogadas) {
		
		String valida = "Você jogou todas as suas peças";
		
		boolean gameFinished = false;
		boolean aux = false;
		
		Peca peca;
		
		int number = 0;
		
		
		while (true) {
			
			int isValid = list.listLength(list);
			
			if (number <= isValid) {
				
				peca = list.getElementAt(number);
		
				aux = pecasJogadas.move(pecasJogadas, peca);
				
				if (aux == true) {
				
					peca = list.remove(peca.toString());
					System.out.println("Sua vez!");
					break;
				
				}else {
				
					number++;
				}
			}else {
				
				System.out.println("O Bot passou a vez!");
				
				break;	
			
			}
			
					
		}
		
		System.out.println(pecasJogadas.getAsString());
		if (valida.equals(list.getAsString())) {
			
			gameFinished = true;
			
		}
		
		return gameFinished;
	}

	public static int readInt () {
		
		int number = scan.nextInt();
		scan.nextLine();		
		return number;
	}
	
	public static boolean gameplayPlayer (List list, List pecasJogadas) {
		
		String valida = "Você jogou todas as suas peças";
		boolean gameFinished = false;
		Peca peca;
		int number;
		
		vo.Playing();
		
		while(true) {
		
			System.out.println(list.getAsString());
			number = readInt();
			number--;
			int isValid = list.listLength(list);
			
			if (number <= isValid && number >= 0) {
				break;
			}
			
			System.out.println("Numero de Peça inválida, digite um numero válido");
			
		}
		
		
		
		peca = list.getElementAt(number);
		boolean aux = pecasJogadas.move(pecasJogadas, peca);
		if (aux == true) {
			peca = list.remove(peca.toString());
		}
		
		System.out.println(pecasJogadas.getAsString());
		if (valida.equals(list.getAsString())) {
			
			gameFinished = true;
			
		}
	
		return gameFinished;
	}
	
	
}


