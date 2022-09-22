package basics;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	private static final String First_Name = "^[A-Z a-z]{1,3}$";
	public boolean verifyFirstName (String fname) {
		Pattern pattern = Pattern.compile(First_Name);
		return pattern.matcher(fname).matches();
	}
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	UserRegistration data = new UserRegistration();
	System.out.println("Enter the user Information");
	System.out.println("Enter First Name :");
	String fname = in.next();
	System.out.println(data.verifyFirstName(fname));
	
	
}
}
