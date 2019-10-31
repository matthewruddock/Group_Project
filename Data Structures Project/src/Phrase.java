
public class Phrase {
	private String creole;
	private String english;
	
	
	
	public Phrase(String creole, String english) {
		super();
		this.creole = creole;
		this.english = english;
	}
	public String getCreole() {
		return creole;
	}
	public void setCreole(String creole) {
		this.creole = creole;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	@Override
	public String toString() {
		return "Phrase [creole=" + creole + ", english=" + english + "]";
	}
	
	public void display() {
		System.out.println(this.toString() + "\n");
	}
}
