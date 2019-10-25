
public class StringSplitTest {

	static String [] b ;
	static int x =0;
	public static void main(String[] args) {
		String str = "Which part have di cheapest jerk chicken";
        String[] arrOfStr = str.split(" ");
        for (x=5;x<7;x++) {
        	b[x] = arrOfStr[x];
        	System.out.println(b[x]);
        }
            
        
	}

}
