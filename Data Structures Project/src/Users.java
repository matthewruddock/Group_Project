
public class Users {
	private int id;
	private String type;
	private Date date = new Date();
	private Time time = new Time();
	
	//Methods
		public Users AccessLogin() {
			Users login = null;
			
			return login;
		}
	
	
	public void createUser() {
		
	}
	
	public int loginUser(){
		//check passport number?
		return id;
		
		
	}
	public int logoutUser(){
		return id;
		
	}

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
