import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class VisitorRequest {
	int requestID;
	Visitor visitor;
	Place place;
	static LocalDateTime myDateObj = LocalDateTime.now();  
    static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    static String Message;
    static String formattedDate = myDateObj.format(myFormatObj);
    String Status;
	
    public void setRequestId(int rid) {
    	requestID = rid;
    }
    public int getRequestId() {
    	return requestID;
    }
    
    public void setMessage(String msg) {
    	Message = msg;
    }
    public String getMessage() {
    	return Message;
    }
    	
public void AddVisitorRequest(VisitorRequest data) {
	FileWriter RequestFile = null;
	String record = null;
	
	try{
		RequestFile = new FileWriter("RequestFile.txt", true);
		//Check if record exist
		
		//create structure for record 
		record = data.requestID+ "\t" + data.visitor.getFirstName() + "\t" + data.visitor.getLastName()+ "\t" 
				+ data.visitor.getEmail() + "\t" + data.place.getId() + "\t" + data.place.getAttration() + "\t" 
				+ data.getMessage() + "\t" + "\t" + data.formattedDate + "\n";
		//Saves record
		RequestFile.write(record);
		System.out.println("\n"+"\n"+"*****Record was saved******"+"\n"+"\n");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}catch(IOException e) {
	System.err.println("Could not open file");
	}	
	
	try {
		RequestFile.close();
	} catch(IOException e) {
		e.printStackTrace();
	}
	
	}
	
	public void ViewVisitorsRequest() {
		VisitorRequest data = null;
		//As a Jamaica Tourist Board Administrator, 
		//I should be able to view the set of visitor requests in the order they were made.
		try {
			Scanner RequestFile = new Scanner(new File("RequestFile.txt"));
			System.out.println(" requestID" + "\t" + "  FirstName"+ "\t" + "\t" + " LastName"+ "\t"+ "\t" +" Email" + "\t" + "\t" +"Place ID" +"\t" + "   Attration Name"+ "\t" + "\t" +"Message");
			System.out.println("___________"+ "\t" + "_____________"+ "\t" +"_____________"+ "\t" +"____________"+ "\t" +"_____________"+ "\t" +"__________________" + "\t" + "__________________");
			 
			while(RequestFile.hasNext()){
				data.setRequestId(RequestFile.nextInt());
				data.visitor.setFirstName(RequestFile.next() );
				data.visitor.setLastName(RequestFile.next() );
				data.visitor.setEmail(RequestFile.next() );
				data.place.setId(RequestFile.nextInt() );
				data.place.setAttration(RequestFile.next() );
				data.setMessage(RequestFile.next() );
				data.formattedDate = RequestFile.next() ;
				//use to string to print out values
					
			}
			try {
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			RequestFile.close();
		}catch(IOException e) {
			System.err.println("Could not open file");
		}	
	}
	
	public void ProcessVisitorsRequest() {
		//As a Jamaica Tourist Board Administrator, I should be able to process the visitor requests in the order they were made. 
		//When a visitor request is identified as processed it is 5 of 7 removed from the set of visitor requests 
		//, awaiting to be processed and added to the processed log.
	}
	
	
	public void ProcessLog() {
		//As a Jamaica Tourist Board Administrator, I should be able to view the process log in the
		//order of most recently processed first. The process log contains the set of visitor requests
		//which have been processed.
	}


}
