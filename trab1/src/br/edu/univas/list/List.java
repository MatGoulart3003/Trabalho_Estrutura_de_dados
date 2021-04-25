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
		 
	        System.out.println("Removendo o produto: " + name);
	        if(head == null) { 
	            return null; 
	        }

	        Node aux = head;
	        Node previous = head.previous;
	        
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
	            previous.next = aux.next;
	            
	            aux.next.previous = previous;
	            
	            if(aux.next == null) {
	                this.last = previous.next;
	            }
	        }
	        
	        return RemovePeca;
	    }
	 
	 
	
}

	


