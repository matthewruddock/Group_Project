import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Place {

	private int id; //System generated
	private String Name; 
	private String  Description;
	private String  Address;
	private int Parish_code; 
	private float Entry_cost; 
	private String Opening_hours;
	private String Contact_number;
	private String Photo;
	private String Attration;
	
	//Default Constructor 
	public Place() {
		id = 0;
		Name=""; 
		Description="";
		Address="";
		Parish_code  = 0; 
		Entry_cost=0; 
		Opening_hours ="";
		Contact_number ="";
		Photo  = "";
		Attration="";
		
	}
	
	//Primary Constructor
	public Place(int i, String name, String description, String address, int parish_code, float entry_cost, String opening_hours, String contact_number, String photo, String attraction) {
		id = i;
		Name= name; 
		Description= description;
		Address= address;
		Parish_code  = parish_code; 
		Entry_cost = entry_cost; 
		Opening_hours = opening_hours;
		Contact_number = contact_number;
		Photo  =  photo;
		Attration= attraction;
		
	}
	
	//Copy Constructor
	public Place(Place PlaceObj) {
		id = PlaceObj.id;
		Name= PlaceObj.Name; 
		Description= PlaceObj.Description;
		Address= PlaceObj.Address;
		Parish_code  = PlaceObj.Parish_code; 
		Entry_cost= PlaceObj.Entry_cost; 
		Opening_hours = PlaceObj.Opening_hours;
		Contact_number = PlaceObj.Contact_number;
		Photo  = PlaceObj.Photo;
		Attration = PlaceObj.Attration;
		
	}
	
	//Methods
	
	public PlaceLinkedList AddPlace() {
		
		//clear screen by printing multiple Lines
				for (int i = 0; i < 10; ++i) System.out.println();
		Scanner input = new Scanner(System.in);
		Files FilesObj = new Files();
		PlaceLinkedList pl_list = new PlaceLinkedList();
		Place data = new Place();
		System.out.println("\t\t"+"****The Di Good Place Dem!****"+"\n");
		System.out.println("\t\t\t"+"   Add Place  "+"\n"+"\n");
		int flag = 1;
		do {
			try{
				//system generated id
				System.out.println(" Enter name of Place: ");
				data.setName(input.next());
				System.out.println("\n Enter Description: ");
				data.setDescription(input.next());
				System.out.println("\n Enter Address: ");
				data.setAddress(input.next());
				System.out.println("\n Enter Parish Code: ");
				parish_codes();
				data.setId(input.nextInt());
				System.out.println("\n Enter Entry Cost: ");
				data.setEntry_cost(input.nextFloat());
				System.out.println("\n Enter Opening hours: ");
				data.setOpening_hours(input.next());
				System.out.println("\n Enter Contact Number: ");
				data.setContact_number(input.next());
				System.out.println("\n Enter Photo: ");
				data.setPhoto(input.next());
				System.out.println("\n Enter Attraction: ");
				data.setAttration(input.next());
			}catch(InputMismatchException e){
				System.err.println("Wrong input type entered");
			}
			flag = pl_list.Search(data.Name);
			
			if (flag==0) {
				//Save to File
				pl_list.add(data);
			}
			if (flag==1)
				System.out.println("\n*****Name already exist******");
			try {
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while(flag == 1);
		return pl_list;
	}
	
	public void ViewPlace() {
		//As a Jamaica Tourist Board Administrator, I should be able to view all places in the system.
		//clear screen by printing multiple Lines
				for (int i = 0; i < 10; ++i) System.out.println();
				PlaceLinkedList pl_list = new PlaceLinkedList();

				
				System.out.println("\t\t"+"****The Di Good Place Dem!****"+"\n");
				System.out.println("\t\t\t"+"   View Places  "+"\n"+"\n");
				
				//Function retrieve Places
				pl_list.show();
	}
	
	
	
	
	//Setters and Getters 
	public int getId() {
		return id;
	}
	public void setId(int i) {
		this.id = i;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public int getParish_code() {
		return Parish_code;
	}
	public void setParish_code(int parish_code) {
		this.Parish_code = parish_code;
	}
	public float getEntry_cost() {
		return Entry_cost;
	}
	public void setEntry_cost(float entry_cost) {
		this.Entry_cost = entry_cost;
	}
	public String getOpening_hours() {
		return Opening_hours;
	}
	public void setOpening_hours(String opening_hours) {
		this.Opening_hours = opening_hours;
	}
	public String getContact_number() {
		return Contact_number;
	}
	public void setContact_number(String contact_number) {
		this.Contact_number = contact_number;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		this.Photo = photo;
	}
	public String getAttration() {
		return Attration;
	}
	public void setAttration(String attration) {
		this.Attration = attration;
	}
	public void parish_codes() {
		int [] code = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		String [] parish_name = {"Kingston & St. Andrew","St. Thomas","Portland", "St. Mary","St. Catherine","Clarendon"
				,"Manchester","St. Ann","St. Elizabeth", "St. James","Hanover","Westmoreland","Trelawny"};
		System.out.println("Code" + " | " + " Parish Name\n______________________________\n");
		for(int i=0;i<=12;i++) {
			System.out.println("  " + code[i] + "  -  " + parish_name[i] );
		}
	}

	public void display(){
		System.out.println("ID: " + getId() + " " + "Name: " + getName() + " " + "Description: " + getDescription() 
			+ " " + "Parish Code: " + getParish_code() + " " + "Entry Cost: " + getEntry_cost() + " " 
			+ "Opening Hrs: " + getOpening_hours() + " " + "Contract#: " + getContact_number() + " " 
			+"Photo: " + getPhoto() + " " + "Attration: " + getAttration() + "\n");
	}

}
