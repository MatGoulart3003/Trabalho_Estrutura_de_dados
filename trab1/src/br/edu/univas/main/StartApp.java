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

		
		
	}
	
	

}
