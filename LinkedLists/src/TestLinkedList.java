// A class that I am using to test what I have implemented 

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

		list.addToStart(1);
		list.show();
		
		list.addToEnd(56);
		list.show();
		
		list.addToStart(28);
		list.show();
		
		list.addToEnd(45);
		list.show();
		
		list.addAtIndex(30,3);
		list.show();
		
		list.removeAtindex(0);
		list.show();
	}

}
