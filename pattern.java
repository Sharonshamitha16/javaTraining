import java.util.Scanner;

public static void main(Strings args[])
{
 public class Pattern{
    int i, j, n;

    System.out.println("Enter value of n : ");
    Scanner Scanner = new Scanner(System.in);

    for(i=n/2; i<=n; i+=2)
    {
        for(j=1; j<n-i; j+=2)
        {
            System.out.print(" ");
        }

        for(j=1; j<=i; j++)
        {
            System.out.print("*");
        }

        for(j=1; j<=n-i; j++)
        {
            System.out.println(" ");
        }

        for(j=1; j<=i; j++)
        {
            System.out.print("*");
        }

        System.out.println("\n");
    }

    for(i=n; i>=1; i--)
    {
        for(j=i; j<n; j++)
        {
            System.out.print(" ");
        }

        for(j=1; j<=(i*2)-1; j++)
        {
            System.out.print("*");
        }

        System.out.print("\n");
    }

    
  }
}