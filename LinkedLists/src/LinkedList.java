// Actual implementation of the linked list where all the functions are written


public class LinkedList {
	
	Node head;
	
	public void addToEnd(int val){
		Node n = new Node();       // Create a new node
		n.data = val;              // Set the value to what is received by the function
		
		if(head==null){
			head=n;                // Setting the head node if it isn't already
		}
		else{                      // If not the first node, traverse the list and find last element
			                       // and attach the node after it
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = n;
		}
	}
	
	public void addToStart(int val){
		Node n = new Node();
		n.data = val;
		n.next = head;
		head = n;
	}
	
	public void addAtIndex(int val, int index){
		Node n = new Node();
		n.data = val;
		Node temp = head;
		
		if(index == 0){
			addToStart(val);
		}
		else{
			for(int i=0;i<(index-1);i++){
				temp = temp.next;
			}
			n.next = temp.next;
			temp.next = n;
		}
	}

	public void removeLast(){
		if(head == null){
			System.out.println("Empty list, Nothing to remove");
		}
		else{
			Node n = head;
			Node temp = null;
			while (n.next!=null){
				temp = n;
				n = n.next;
			}
			temp.next=null;
		}
	}
	
	public void removeFirst(){
		Node temp = head;
		head = temp.next;
		temp = null;
	}
	
	public void removeAtindex(int index){
		Node n = head;
		
		if(index == 0){
			removeFirst();
		}
		else{
			for(int i=0; i<index-1;i++){
				n = n.next;
			}
			n.next = n.next.next;
		}
	}
	
	public void show(){
		Node n = head;
		if(n==null){
			System.out.println("Your Linked List is Empty");
		}
		else{
			System.out.print("Your Linked List: " + n.data);
			while(n.next!=null){
				n = n.next;
				System.out.print("->" + n.data);
			}
			System.out.println("");
		}
	}

}
