package JavaPrograms;
import java.util.Scanner;
public class Missing_Arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array with missing arary to find:");
        int n= scanner.nextInt();
        int[] nums = new int[n];
		int sum=0;
        n= nums.length;
       
        for(int i=0;i<n;i++) {
          nums[i]= scanner.nextInt();
        	sum=sum +nums[i];
        }
        int expectedsum = n*(n-1)/2 - sum;
        System.out.println("Print the missing Array:" +expectedsum);
    }
    }      