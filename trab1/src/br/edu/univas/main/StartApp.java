package br.edu.univas.main;

import br.edu.univas.list.List;
import br.edu.univas.list.Peca;


public class StartApp {
	
	public static void main(String[] args) {
		
		List list1 = new List();
		List list2 = new List();
		;
		
		
		for (int i = 0; i < 7; i++) {
			
			for(int j = 0; j < 7; j++) {
				
				Peca novaPeca = new Peca();
				novaPeca.setNum1(i);
				novaPeca.setNum2(j);
				list1.insert(novaPeca);
							
			}
			
		}
		
		
		
		System.out.println(list1.getAsString());
		System.out.println(list2.getAsString());
		System.out.println(list1.getAsString());
		System.out.println(list1.remove("(5,5)"));
		System.out.println(list1.getAsString());
		
		Peca aux = list1.remove("(4,4)");
		
		System.out.println(list1.getAsString());
		System.out.println();
		System.out.println();
		list1.jogada(aux);
		System.out.println(list1.getAsString());
		Peca aux2 = list1.remove("(6,6)");
		System.out.println(aux2);
		System.out.println(list1.getAsString());
		System.out.println();
		aux2.setNum1(6);
		aux2.setNum1(5);
		list1.jogada(aux2);
		 
		System.out.println(list1.getAsString());
		
		
		
		
	}
	
	

}
