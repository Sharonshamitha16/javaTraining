package JavaPrograms;
import java.util.Scanner;
public class practice_prime {
 public static void main ( String args[]) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter a number to check th given number is prim or not:");
	 int num = scanner.nextInt();
	 if (isprime(num)) {
		 System.out.println("Yes, It is a prime number");
	 }
	 else {
		 System.out.println("No, It is not  a prime number");
	 }
	 scanner.close();
 }
	 public static boolean isprime(int num) {
		 if (num<2) {
			 return false;
		 			}
		 for (int i =2; i<num; i++) 
		 {
			 if (num%2==0) 
			 {
				 return false;
			 }
		 }
		return true; 
	 }
	 
 }

