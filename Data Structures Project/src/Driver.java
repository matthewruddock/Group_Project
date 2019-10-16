import java.util.Scanner;

public class Driver {
	private static int choice = 0;
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Driver DriverObj = new Driver();
		Users UsersObj = new Users();
		int loginVerification = 0 ;
		int alive = 1; //state of main program
		
		while(alive==1) {
			//Initialise choice
			choice = 0;
			System.out.println("\t"+"****The Di Good Place Dem!****"+"\n");
			System.out.println("\t"+"   Welcomes all visting and returning residents"+"\n"+"\n");
			System.out.println("1. Visitor"+"\n");
			System.out.println("2. Admin"+"\n");
			System.out.println("3. Logout User"+"\n");
			System.out.println("0. Exit System"+"\n");
			
			
			//User Input choice of menu option
			choice = input.nextInt();
			
			//clear screen by printing multiple Lines
			for (int i = 0; i < 10; ++i) System.out.println();
			
			//Functions
			if(choice==1) { //Visitors
				loginVerification = UsersObj.loginUser();
			}
			else if(choice==2) {//Admin
				loginVerification = UsersObj.loginUser();
			}
			else if(choice==3) {//Logout
				loginVerification = UsersObj.logoutUser();
			}
			else if(choice==0) {
				alive = 0;
				System.exit(0);
			}
		}

	}

}
