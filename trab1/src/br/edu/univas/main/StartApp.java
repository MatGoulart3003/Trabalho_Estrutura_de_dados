package br.edu.univas.main;

import br.edu.univas.list.List;
import br.edu.univas.list.Peca;


public class StartApp {
	
	public static void main(String[] args) {
		
		List list1 = new List();
		List list2 = new List();
		List list3 = new List();
		
		list1.createPeaces();
		System.out.println(list1.getAsString());
		list1.setPeaces(list2);
		System.out.println(list1.getAsString());
		System.out.println(list2.getAsString());
		list1.setPeaces(list3);
		System.out.println(list3.getAsString());
		System.out.println(list1.getAsString());
		
		
		
		
		
	}
	
	
		
}


