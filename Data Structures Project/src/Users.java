import java.util.Scanner;

public class Users {
	private int id;
	private String type;
	private Date date = new Date();
	private Time time = new Time();
	
	//Getters and Setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
