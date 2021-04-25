package br.edu.univas.main;

import br.edu.univas.list.List;
import br.edu.univas.list.Peca;


public class StartApp {
	
	public static void main(String[] args) {
		
		List list1 = new List();
		List list2 = new List();
		Peca [] peca = new Peca[8];
		
		
		for (int i = 0; i < 8; i++) {
			
			Peca novaPeca = new Peca();
			peca[i] = novaPeca;
			peca[i].setNum1(i);
			peca[i].setNum2(i);
			
			
		}
		
		for(int i = 0; i < peca.length; i++) {

			list1.insert(peca[i]);
			
			
		}
		
		System.out.println(list1.getAsString());
		System.out.println(list2.getAsString());
		System.out.println(list1.remove("(0,0)"));
		System.out.println(list1.getAsString());
		System.out.println(list1.remove("(5,5)"));
		System.out.println(list1.getAsString());
		
		Peca aux = list1.remove("(4,4)");
		aux.setNum1(2);
		aux.setNum2(1);
		System.out.println(list1.getAsString());
		list1.jogada(aux);
		System.out.println(list1.getAsString());
		Peca aux2 = list1.remove("(4,4)");
		System.out.println(aux2);
		System.out.println(list1.getAsString());
		aux2 = list1.remove("(6,6)");
		System.out.println(list1.getAsString());
		aux2.setNum1(7);
		aux2.setNum2(3);
		list1.jogada(aux2);
		System.out.println(list1.getAsString());

		
		
		
	}
	
	

}
