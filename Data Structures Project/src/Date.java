public class Date {
	private int Day;
	private int Month;
	private int Year;
	
	//Default Constructor 
	public Date() {
		Day = 1;
		Month = 1;
		Year = 1900;
	}
	//Primary Constructor
	public Date(int d, int m, int y) {
			Day = d;
			Month = m;
			Year = y;
	}
	//Setters and Getters
	public void setDay(int d) {
		Day = d;
	}
	public int getDay() {
		return Day;
	}
	
	public void setMonth(int m) {
		Month = m;
	}
	public int getMonth() {
		return Month;
	}
	
	public void setYear(int y) {
		Year = y;
	}
	public int getYear() {
		return Year;
	}

	
	public String DateString() {
		return Day + "/" + Month + "/" + Year;
	}


}
