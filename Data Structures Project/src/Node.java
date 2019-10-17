
public class Node {
	private Place data;
	private Users data1;
	
	private Node next;
	
	public Node() {
		data=null;
		next=null;
	}
	public Node(Place data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	public Node(Users data, Node next) {
		super();
		this.data1 = data;
		this.next = next;
	}
	
	//Places
	public Place getData() {
		return data;
	}
	public void setData(Place data) {
		this.data = data;
	}
	
	//Users
	public Users getData1() {
		return data1;
	}
	public void setData(Users data) {
		this.data1 = data;
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "] \n";
	}
	//Users
	public String toString1() {
		return "Node [data=" + data1 + ", next=" + next + "] \n";
	}
	
	public void display() {
		String disp=toString();
		System.out.println(disp );
		
	}

}
