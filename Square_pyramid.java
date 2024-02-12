package JavaPrograms;
import java.util.Scanner;
public class Square_pyramid {

	public static void main(String[] args) {
		int  i, j;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the no. of rows to be present in square pyramid:");
		int row = scanner.nextInt();
		
		for (i=1;i<=row; i++) 
		{
			for (j=1;j<=row;j++)
			{ 
				System.out.print( " * ");
			}
			System.out.println();
		}
		
		
	}

}
