package basics;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	private static final String First_Name = "^[A-Z a-z]{1,6}$";
	private static final String Last_Name = "^[A-Z a-z]{1,5}$";
	private static final String Mobile_Number = "[0-9]{10}";
	private static final String Email_Id = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*@[a-zA-Z0-9_-]+\\.[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*$";
	private static final String Password1 = "^[a-zA-Z0-9_-]{8,}$";
	private static final String Password2 = "^[a-zA-Z0-9_-]{8,}(?=.*[A-Z])+$";
	private static final String Password3 = "^[a-zA-Z0-9_-]{8,}[?=.*A-Z]+[?=.*0-9]+$";
	
			
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
	public boolean verifyEmailId (String eid) {
		Pattern pattern = Pattern.compile(Email_Id);
		return pattern.matcher(eid).matches();
	}
	public boolean verifyPassword1 (String pswd1) {
		Pattern pattern = Pattern.compile(Password1);
		return pattern.matcher(pswd1).matches();
	}
	public boolean verifyPassword2 (String pswd2) {
		Pattern pattern = Pattern.compile(Password2);
		return pattern.matcher(pswd2).matches();
	}
	public boolean verifyPassword3 (String pswd3) {
		Pattern pattern = Pattern.compile(Password3);
		return pattern.matcher(pswd3).matches();
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
	System.out.println("Enter Email Id :");
	String eid = in.next();
	System.out.println(data.verifyEmailId(eid));
	System.out.println("Enter Password :");
	String pswd1 = in.next();
	System.out.println(data.verifyPassword1(pswd1));
	System.out.println("Enter Password2 :");
	String pswd2 = in.next();
	System.out.println(data.verifyPassword2(pswd2));
	System.out.println("Enter Password3 :");
	String pswd3 = in.next();
	System.out.println(data.verifyPassword3(pswd3));

}
}
