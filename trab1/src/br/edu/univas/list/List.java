package br.edu.univas.list;

public class List {
	
	
	private Node head;
	private Node last;
	
	public void insert(Peca peca) {
		
		Node novoNode = new Node();
		
		if (head == null) {
		
			head = novoNode;
		
		}else {
			
			last.next = novoNode;
			novoNode.previous = last;
		}
		
		last = novoNode;
		novoNode.peca = peca;
		
	}

	public String getAsString() {
        if(head == null) {
            return "Sua lista de peças está vazia!";
        }
        StringBuilder builder = new StringBuilder();
            
        Node aux = head;
        while(aux != null) {

            builder.append("(").append(aux.peca.getNum1());
            builder.append(",");
            builder.append(aux.peca.getNum2()).append(")");
            builder.append("  ");
            
            aux = aux.next;
        }
        return builder.toString();
    }

	 private Node getNodeAt(int index) {
	        if(index < 0) {
	            return null;
	        }
	       
	        int i = 0;
	        Node aux = head;
	        while(aux != null) {
	            
	            if(index == i) {
	                return aux;
	            }
	            i++; 
	            aux = aux.next; 
	        }
	        return null;
	    }
	
	 public Peca getElementAt(int index) {
	        Node node = getNodeAt(index);
	        if(node != null) {
	            return node.peca;
	        }
	        return null;
	    }
	 	 
	 public Peca remove(String name) {
		 
	        System.out.println("Removendo a peça: " + name);
	        if(head == null) { 
	            return null; 
	        }

	        Node aux = head;
	        Node previous = aux.previous;
	       	        
	        while(aux != null) {
	            if(aux.peca.toString().equals(name)) {
	               break;
	            }
	            previous = aux;
	            aux = aux.next;
	        }
	      
	        if(aux == null) { 
	            return null; 
	        }
	        
	        Peca RemovePeca = aux.peca;
	        
	        
	        if(this.head == this.last) { 
	            return RemovePeca;
	        }

	        if(previous == null) {
	            head = aux.next; 
	        } else {
	            System.out.println(previous.next);   
	        	previous.next = aux.next;
	        	System.out.println(previous);
	            this.last = previous;
	            
	        }
	        
	        return RemovePeca;
	    }
	 
	 public void jogada(Peca peca) {
		 
		 
		 
		 if (peca != null) {
			 
			 if (head.peca.getNum1() == peca.getNum1() || head.peca.getNum1() == peca.getNum2()) {
				 
				 Node novoNode = new Node();
				 head.previous = novoNode;
				 novoNode.peca = peca;
				 novoNode.next = head;
				 head = novoNode;
				 
			 }else if (last.peca.getNum2() == peca.getNum1() || last.peca.getNum2() == peca.getNum2()) {
				 
				 Node novoNode = new Node();
				 last.next = novoNode;
				 novoNode.peca = peca;
				 novoNode.previous = last;
				 last = novoNode;
				 
			 }else {
				 System.out.println("Movimento não permitido");
			 }
		 }else {

			 System.out.println("Movimento nao permitido");
			  
		 }
		 
	 }
	
}

	


