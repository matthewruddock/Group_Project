import java.util.Scanner;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class Visitor extends Users{
	private String FirstName;
	private String LastName;
	private String Email;
	private String PassportNumber;
	
	private static Scanner input = new Scanner(System.in);
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	static LocalDateTime myDateObj = LocalDateTime.now();  
    static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    static String formattedDate = myDateObj.format(myFormatObj);
	private String pname;
	
	
	//Methods
	public void viewPhrases() {
		Tree tree = new Tree();
		tree.insert(new Phrase("Mi soon come","I will be right there"));
		tree.insert(new Phrase("Mi deh pan a endz","I'm out somewhere having fun"));
		tree.insert(new Phrase("Wah gwaan?","How are you doing? or What's up?"));
		tree.insert(new Phrase("Do u ting","Go ahead or Do whatever you want to do"));
		tree.insert(new Phrase("Hol' a medz/medi","Relaxing or meditating"));

		System.out.println("______________________________________________________________________"+"\n");
		System.out.println("Today's Date and Time: "+ formattedDate+"\n"); 
		System.out.println("\t\t"+"****The Di Good Place Dem!****"+"\n");
		System.out.println("\t\t"+"****Come learn the good phrase dem****\n");
		tree.display();
		System.out.println("______________________________________________________________________"+"\n");
		System.out.println("\t\t\tPRESS ANY KEY TO EXIT");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void RequestAttractionDetails() {
		PlaceLinkedList pl_list = new PlaceLinkedList();
		Place place = new Place();
		VisitorRequest VRObj = new VisitorRequest ();
		
		VRObj.requestID = ID_GENERATOR.getAndIncrement();
		System.out.println("______________________________________________________________________"+"\n");
		System.out.println("Today's Date and Time: "+ formattedDate+"\n"); 
		System.out.println("\t\t"+"****The Di Good Place Dem!****"+"\n");
		System.out.println("\t\t    Request Attraction Details \n");
		
		//As a visitor, I should be able to request the name, address, contact number and main attractions 
		//by typing the following creole statement : ​“Which part have di cheapest [Attraction Name]”​. 
		//Sample attractions include “jerk chicken”, “river tours”, “water slides”
		
		System.out.println("Type the following, *Which part have di cheapest [Attraction Name]*, to see cheapest attraction."
				+ "\nSample attractions include “jerk chicken”, “river tours”, “water slides” ");
		pname = input.next();
		pname = pname.substring(28); // get characters after cheapest
		
		//place = pl_list.showRequestAttraction(pname);
		VRObj.place = place;
		VRObj.visitor.setFirstName(getFirstName());
		VRObj.visitor.setLastName(getLastName());
		VRObj.visitor.setEmail(getEmail());
		
		System.out.println("______________________________________________________________________"+"\n");
		System.out.println("\n\t\t****Visitor Request****\n");
		System.out.println("Name: "+ getFirstName() + " " + getLastName() + " \n" 
							+ "Email: " + getEmail() + "\n"
							+ "Attraction ID : " + place.getId() +"\n"
							+ "Attraction: " + place.getAttration() + "\n"
							+ "Message: "+ "\n"
							+ "Request ID: " + VRObj.requestID +"\n"
							+ "Date and Time: " + formattedDate);
		//As a visitor, I should be able to request additional details on an attraction offered by a place. 
		//Each request should include my first name, last name, email, attraction generated id, attraction name 
		//and message, request id, date and time (id, date and time should be system generated).
		
		VRObj.AddVisitorRequest(VRObj);
		
		System.out.println("______________________________________________________________________"+"\n");
		System.out.println("\t\t\tPRESS ANY KEY TO EXIT");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void RequestListofPlaces() {
		PlaceLinkedList pl_list = new PlaceLinkedList();
		System.out.println("______________________________________________________________________"+"\n");
		System.out.println("Today's Date and Time: "+ formattedDate+"\n"); 
		System.out.println("\t\t"+"****The Di Good Place Dem!****"+"\n");
		System.out.println("\t\t    Request List of Places \n");
		
		//As a visitor, I should be able to request a listing of places in a parish by typing 
		//the following creole statement : ​“Gimmi all a di place dem inna [Parish Name]”​.
		
		System.out.println("\n ​“Gimmi all a di place dem inna [Parish Name]​. \n");
		pname = input.next();
		pname = pname.substring(30); //copy name after inna
		pl_list.showRequestLOP(pname);
		
		System.out.println("______________________________________________________________________"+"\n");
		System.out.println("\t\t\tPRESS ANY KEY TO EXIT");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	//Getters and Setters
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassportNumber() {
		return PassportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		PassportNumber = passportNumber;
	}
	

}
