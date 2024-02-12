package JavaPrograms;
import java.util.Scanner;
public class Arthmeticopertors_diffDatatypes {
	public static void main(String[] args) { 
	
		int c, d, e , f , o;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter 1st number for datatype int:");
		int a1 = scanner.nextInt();
		
		System.out.println("enter 2nd number for datatype int:");
		int b1 = scanner.nextInt();
		c= a1+b1;
		System.out.println("The value for datatype double is :" +c);
		
		
		double d1;
		System.out.println("enter 1st number for datatype double:");
		double a2 = scanner.nextDouble();
		
		System.out.println("enter 2nd number for datatype double:");
		double b2 = scanner.nextDouble();
		d1= a2-b2;
		System.out.println("The value for datatype double is :" +d1);
		
		
		long o1;
		System.out.println("enter 1st number for datatype long:");
		long a4 = scanner.nextLong();
		
		System.out.println("enter 2nd number for datatype long:");
		long b4 = scanner.nextLong();
		o1= a4%b4;
		System.out.println("The value for datatype long is :" +o1);
		
		
		
		float e1;
		System.out.println("enter 1st number for datatype float:");
		float a5 = scanner.nextFloat();
		
		System.out.println("enter 2nd number for datatype float:");
		float b5 = scanner.nextFloat();
		e1= a5/b5;
		System.out.println("The value for datatype float is :" +e1);
		
		
		//short f;
		
		
	}
}
