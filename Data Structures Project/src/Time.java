import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class


public class Time {
	private int hr;
	private int min;
	private int sec;
	LocalDateTime myDateObj = LocalDateTime.now(); 
	
	public Time() {
		hr = 0;
		min = 0;
		sec = 0;
	}
	
  
	public int getHr() {
		return hr;
	}


	public void setHr(int hr) {
		this.hr = hr;
	}
	
		
	
	public int getMin() {
		return min;
	}
	
		
	
	public void setMin(int min) {
		this.min = min;
	}
	
	
		
	public int getSec() {
		return sec;
	}
	
	
	
	public void setSec(int sec) {
		this.sec = sec;
	}  

	public static void main(String[] args) {  
	    LocalDateTime myDateObj = LocalDateTime.now();  
	     
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	    
	    String formattedDate = myDateObj.format(myFormatObj);  
	    System.out.println(formattedDate);  
	  }





}