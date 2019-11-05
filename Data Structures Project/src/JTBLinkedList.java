
public class JTBLinkedList {// for Users class
		private UserNode head;
		
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
			UserNode current = new UserNode();
			
			if(current==null)
				return true;
			else
				return false;
		}
		
		public boolean add(Users data) {// add place to back
			if(isFull())
				System.out.println("List is full, unable to add \n");
			
			else {
				UserNode next = new UserNode();
				next.setData(data);
				
				if(isEmpty()) {
					head = next;
				}
				else {
					UserNode current = head;
					while(current.getNext()!=null) {
						current = current.getNext();
						
					}
					current.setNext(next);
				}
			}
			return false;
		}
		
		public void destory() {
			UserNode current = new UserNode();
			
			while(head!=null) {
				
				current = head;
				
				head = head.getNext();
				
			}
		}
		
		public Users Retrieve(int sVal) {// search for user and return record
			if(isEmpty()) {
	 			System.out.println("List is empty \n");
	 		}
		 
		 else {
			 	UserNode current = head;

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
				UserNode current = head;
				while (current !=null) {
					current.getData().display();
					current = current.getNext();
				}
			}
		}
	


}
