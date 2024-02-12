package JavaPrograms;
import java.util.Scanner;
public class switch_vowels {

	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter an alphabet which is vowel or consonant");
		
		char vowel;
		vowel = scanner.next().charAt(0);
		switch (vowel)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
		System.out.println( " Its a vowel " );
		break;
		
		default :
			System.out.println("Its a consonant");
		}	
	}
}
