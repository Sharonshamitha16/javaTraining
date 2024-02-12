package JavaPrograms;
import java.util.Scanner;
public class week_switch {
	public static void main (String args []) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 7 to know the week of the day:");
		char week;
		week = scanner.nextLine().charAt(0);
		switch (week) {
		case '1':
			System.out.println("Its monday");
			break;
		case '2':
			System.out.println("Its Tuesday");
			break;
		case '3':
			System.out.println("Its Wednesday");
			break;
		case '4':
			System.out.println("Its Thursday");
			break;
		case '5':
			System.out.println("Its Friday");
			break;
		case '6':
			System.out.println("Its Saturday");
			break;
		case '7':
			System.out.println("Its Sunday");
			break;
		default:
			System.out.println("Incorrect number");
		}
	}

}
