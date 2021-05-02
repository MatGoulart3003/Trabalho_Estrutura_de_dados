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
            return "Sua lista de pe�as est� vazia!";
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
		 
	      
	        if(head == null) { 
	            return null; 
	        }
	        
	       
	        Node current = head;
	        Node previous = head.previous;
	        Node next = head.next;
	       	        
	        while(current != null) {
	            if(current.peca.toString().equals(name)) {
	               break;
	            }
	            previous = current;
	            current = current.next;
	            next = next.next;
	        }
	      
	        if(current == null) { 
	            return null; 
	        }
	        
	        Peca RemovePeca = current.peca;
	        
	        
	        if(this.head == this.last) { 
	            return RemovePeca;
	        }

	        if(previous == null) {
	            head = next; 
	            next.previous = null;
	        } else {
	        	
	        	if (current.next != null) {
	        		previous.next = next;
	        	    next.previous = previous;
	        	} else{
	        		
		            this.last = previous;
		           	previous.next = null;
	        	}
	            
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
				 System.out.println("Movimento n�o permitido");
			 }
		 }else {

			 System.out.println("Movimento nao permitido");
			  
		 }
		 
	 }
	
	public void createPeaces () {
		
		int aux = 0;
		
		for (int i = 0; i < 7; i++) {
			
			for(int j = 0; j+aux < 7; j++) {
				
				Peca novaPeca = new Peca();
				novaPeca.setNum1(i);
				novaPeca.setNum2(j+aux);
				insert(novaPeca);
							
			}
			aux++;
		}
	
	}
	
	public void setPeaces(List list) {
		
		Node aux = head;
		Node aux2 = last;
		Peca peca;
		
		int auxiliar = 0;
			
		while (!aux.peca.toString().equals(aux2.peca.toString())) {
			
			aux = aux.next;
			auxiliar++;
			if(aux == null) {
				break;
			}
			System.out.println(auxiliar);
		}
		
		for (int i = 0; i < 7; i++) {
			int rand = 1 + (int) (Math.random() * auxiliar);
			System.out.println(rand);
			peca = getElementAt(rand);
			peca = remove(peca.toString());
			list.insert(peca);
			auxiliar--;
		}
		
		
		
	
	
	}

	
	
	
}

	


