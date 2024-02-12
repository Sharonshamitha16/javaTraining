package JavaPrograms;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number to find factorial");
		Scanner scanner = new Scanner (System.in);
		int num =scanner.nextInt();
		int fact =1;
		while (num>1) {
			fact= fact * num;
			num =num-1;
		}
		System.out.printf("The factorial of  given no. is:"  +fact);
	}
	

}
