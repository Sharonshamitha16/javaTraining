package JavaPrograms;

public class Foreachloop_missingArray {
	public static void main(String args[]) {
		int [] nums= { 1,0, 3};
		int n= nums.length;
		int sum =0;
		int i;
		for ( i =0; i<n; i++) {
			System.out.println(nums[i]);
		}
		for(int arr: nums) {
			sum+=arr;
		}
		int missingsum = n*(n+1)/2 - sum;
		System.out.println(" The  missing array is :"+missingsum);
	}

}
