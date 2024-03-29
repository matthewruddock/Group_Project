
public class PlaceLinkedList { //For Place Class

	private Node head;
	
	public PlaceLinkedList() {
		head=null;
	}
	
	public boolean isEmpty() {
		if(head==null) 
			return true;
		
		else
			return false;	
	}
	
	public boolean isFull() {
		Node current = new Node();
		
		if(current==null)
			return true;
		else
			return false;
	}
	
	public boolean add(Place data) {// add place to back
		if(isFull())
			System.out.println("List is full, unable to add \n");
		
		else {
			Node next = new Node();
			next.setData(data);
			
			if(isEmpty()) {
				head = next;
			}
			else {
				Node current = head;
				while(current.getNext()!=null) {
					current = current.getNext();
					
				}
				current.setNext(next);
			}
		}
		return false;
	}
	
	
	
	public Place Retrieve(String sVal) {// search for place and return record
		if(isEmpty()) {
 			System.out.println("List is empty \n");
 		}
	 
	 else {
		 	Node current = head;

 			while(current !=null) {
 				if(current.getData().getName().equals(sVal)) {	 				
	 				return current.getData();
 				}
 				else {
 					current = current.getNext();
 				}
 			}
 		}
	return null ;
	 
 		
	}
	
	public Place remove() { //Remove a record of Place..Edit to delete
		if(isEmpty()) {
			System.out.println("List is Empty\n");
		}
		else {
			
			//Pine data = head.getData(); 
			Node current = head;
			Node DeleteItem = current;
			while(current!=null) {
				if(current.getNext()==null) {
					DeleteItem.setData(current.getData() ); 
					DeleteItem.setNext(current.getNext() ); 
					//current.setData(null);
					//current.setNext(null);
					
					return DeleteItem.getData();
				}
				else {
					current = current.getNext();
 				}
			}
			
		}
		
		return null;
	}
	
	public int Search(String sVal) {// search for place and return record
		if(isEmpty()) {
 			System.out.println("List is empty \n");
 		}
	 
	 else {
		 	Node current = head;

 			while(current !=null) {
 				if(current.getData().getName().equals(sVal)) {	 				
	 				return 1;
 				}
 				else {
 					current = current.getNext();
 				}
 			}
 		}
	return 0 ;
	 
 		
	}
	
	

	
	public void show() {// Show all the places.....
		if (isEmpty()) {
			System.out.println("List is Empty\n");
		}
		else {
			Node current = head;
			while (current !=null) {
				current.getData().display();
				current = current.getNext();
			}
		}
	}
	
	public void showRequestLOP(String sVal) {// Show all the places in a specific parish.....
		if (isEmpty()) {
			System.out.println("List is Empty\n");
		}
		else {
		 	Node current = head;

 			while(current !=null) {
 				if(current.getData().getName().equals(sVal)) {	 				
	 				current.getData().display();
 				}
 				else {
 					current = current.getNext();
 				}
 			}
 		}
	}
	
	public Place showRequestAttraction(String sVal) {
		if (isEmpty()) {
			System.out.println("List is Empty\n");
		}
		else {
		 	Node current = head;

 			while(current !=null) {
 				if(current.getData().getAttration().equals(sVal)) {	 				
 					return current.getData();
 				}
 				else {
 					current = current.getNext();
 				}
 			}
 		}
		return null ;
	}
	
	public void destory() {
		Node current = new Node();
		
		while(head!=null) {
			
			current = head;
			
			head = head.getNext();
			
		}
	}

	
	

}



