package basics;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	private static final String First_Name = "^[A-Z a-z]{1,6}$";
	private static final String Last_Name = "^[A-Z a-z]{1,5}$";
	private static final String Mobile_Number = "[0-9]{10}"; 
	
	public boolean verifyFirstName (String fname) {
		Pattern pattern = Pattern.compile(First_Name);
		return pattern.matcher(fname).matches();
	}
	public boolean verifyLastName (String lname) {
		Pattern pattern = Pattern.compile(Last_Name);
		return pattern.matcher(lname).matches();
	}
	public boolean verifyMobileNumber (String mnumber) {
		Pattern pattern = Pattern.compile(Mobile_Number);
		return pattern.matcher(mnumber).matches();
	}
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	UserRegistration data = new UserRegistration();
	System.out.println("Enter the user Information");
	System.out.println("Enter First Name :");
	String fname = in.next();
	System.out.println(data.verifyFirstName(fname));	
	System.out.println("Enter Last Name :");
	String lname = in.next();
	System.out.println(data.verifyLastName(lname));	
	System.out.println("Enter Mobile Number :");
	String mnumber = in.next();
	System.out.println(data.verifyMobileNumber(mnumber));	

}
}
