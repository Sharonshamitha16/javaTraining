 package JavaPrograms;
import java.util.Scanner;
public class Input {
	public static void main (String args [] ){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("what's your name");
	String name =  scanner.nextLine();
	System.out.println("what's ur rating from 1 to 5?");
	int rating = scanner.nextInt();
	scanner.nextLine();
	System.out.println("what's your emailid?");
	String email = scanner.nextLine();
	System.out.println("what's your phone number?");
	long phone = scanner.nextLong();
	System.out.println("Is this year is 2024 true or false?");
	boolean statement = scanner.nextBoolean();
	System.out.println("what is your age?");
	byte age = scanner.nextByte();
	System.out.println("what is your pincode mention last two digits?");
	short pincode = scanner.nextShort();
	System.out.println("your name is" + name);
	System.out.println("your rating from 1 to 5 is" + rating);
	System.out.println("your email id is "+ email);
	System.out.println("your phone numberis "+ phone);
	System.out.println( "This year is 2024 ," + statement);
	System.out.println( "your pincode is " + pincode);
	System.out.println("your age is " + age );
	}

}
