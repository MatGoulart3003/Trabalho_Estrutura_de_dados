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
				System.out.println("\n\nOp��o incorreta, Escolha um numero entre 1 e 2!");
				
			}
			
		}while (option != 1 && option != 2);
		//int rand = 1 + (int) (Math.random() * 2);	
		if (option == 1) {
			
			do {
				
				GameOver = gameplayPlayer(pecasPlayer, pecasJogadas, todasAsPecas);
				GameOver = gameplayBot(pecasBot, pecasJogadas, todasAsPecas);
											
			}while(GameOver == false);
			
		}
		
		System.out.println("terminei com o game Over");
		
		
		scan.close();
	}
	
	private static boolean gameplayBot(List list, List pecasJogadas, List todasAsPecas) {
		
		String valida = "Voc� jogou todas as suas pe�as";
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
					System.out.println("Sua vez!\n");
					break;
				
				}else {
				
					number++;
				}
			
			}else {
				System.out.println("\nO BOT PASSOU A VEZ!!\n");
				insertRandonPeace(list, todasAsPecas);
				break;
			
			}
			
					
		}
		vo.pecasNaMesa(pecasJogadas);
		
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
	
	public static boolean gameplayPlayer (List list, List pecasJogadas, List todasAsPecas) {
		
		String valida = "Voc� jogou todas as suas pe�as";
		boolean gameFinished = false;
		Peca peca;
		int number;
		
		vo.Playing();
		
		while(true) {
			
			System.out.println("SUAS PE�AS S�O:");
			System.out.println(list.getAsString());
			number = readInt();
			
			if (number == 100) {
				
				vo.pecasParaComprar(todasAsPecas);
				
				number = readInt();
				
				if (number == 200) {
					
					System.out.println("Escolha uma pe�a usando: 1 para a primeira, 2 para a segunda e assim consecutivamente:");
					buyPeace(list, todasAsPecas);
					System.out.println("Voce passou a vez");
					break;
				
				}else if (number == 300) {
					
					System.out.println("Escolha uma pe�a usando: 1 para a primeira, 2 para a segunda e assim consecutivamente:");
					buyPeace(list,todasAsPecas);
							
					continue;
					
				}else {
					
					System.out.println("Op��o inv�lida, selecione uma solu��o v�lida, ");
					
				}
			}
			
			number--;
			int isValid = list.listLength(list);
			
			if (number <= isValid && number >= 0) {
				
				peca = list.getElementAt(number);
				boolean aux = pecasJogadas.move(pecasJogadas, peca);
				
				if (aux == true) {
					
					peca = list.remove(peca.toString());
					if (valida.equals(list.getAsString())) {
						
						gameFinished = true;
						
					}
					
					break;
				
				}else {
					System.out.println("Essa pe�a n�o � jogavel agora, selecione outra pe�a!");
					continue;
				}
				
				
			}
			
			System.out.println("Numero de Pe�a inv�lida, digite um numero v�lido");
			
		}
		vo.pecasNaMesa(pecasJogadas);
		
	
		return gameFinished;
	}
	
	
	public static void insertRandonPeace (List list, List todasAsPecas) {
		
		int number = todasAsPecas.listLength(todasAsPecas);;
		Peca peca;
		
		number = 1 + (int) (Math.random() * number);
		peca = todasAsPecas.getElementAt(number);
		peca = todasAsPecas.remove(peca.toString());
		list.insert(peca);
		
		
	}
	
	public static void buyPeace (List list, List todasAsPecas) {
		
		Peca peca;
		int number;

		System.out.println("Escolha uma pe�a usando: 1 para a primeira, 2 para a segunda e assim consecutivamente:");
		number = readInt();
		number--;
		peca = todasAsPecas.getElementAt(number);
		peca = todasAsPecas.remove(peca.toString());
		list.insert(peca);		
	}
	
}


