
public class JTBLinkedList {// for Users class
		private Node head;
		
		public JTBLinkedList() {
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
		
		public boolean add(Users data) {// add place to back
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
		
		public void destory() {
			Node current = new Node();
			
			while(head!=null) {
				
				current = head;
				
				head = head.getNext();
				
			}
		}
		
		public Place Retrieve(int sVal) {// search for user and return record
			if(isEmpty()) {
	 			System.out.println("List is empty \n");
	 		}
		 
		 else {
			 	Node current = head;

	 			while(current !=null) {
	 				if(current.getData().getId()==sVal) {	 				
		 				return current.getData();
	 				}
	 				else {
	 					current = current.getNext();
	 				}
	 			}
	 		}
		return null ;
		 
	 		
		}
		
		public void show() {// Show all the Users.....
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
	


}
