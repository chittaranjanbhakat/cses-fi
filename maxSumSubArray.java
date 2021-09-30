package SDESheet;

public class maxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-2, -3, 4, -1, -2, 1, 5, 3};
		int n= a.length;
		int max_sum= maxSubArraySum(a, n);
		System.out.println("Maximum contigous sum is "+ max_sum);
	}
	
	static int maxSubArraySum(int a[], int n) {
		int max_so_far= Integer.MIN_VALUE;
		int max_ending_here= 0;
		
		for(int i=0; i< a.length; i++)
		{
			max_ending_here= max_ending_here+ a[i];
			
			if(max_so_far < max_ending_here)
			{
				max_so_far= max_ending_here;
			}
			if(max_ending_here<0)
			{
				max_ending_here=0;
			}
		}
		return max_so_far;
	}
	
	//DP Apporoach of Kadane's Algorithm
	
	static int maxSubArraySum1(int a[], int size)
	{
		int max_so_far= a[0];
		int max_ending_here= a[0];
		
		for(int i=1; i < size; i++)
		{
			max_ending_here= Math.max(max_ending_here, max_ending_here+ a[i]);
			max_so_far= Math.max(max_so_far, max_ending_here);
		}
		return max_so_far;
	}
}
