package SDESheet;
import java.util.*;
import java.io.*;
public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {2, 4, 6, 10};
		int arr2[]= {7, 9, 10};
		
		int n= 4,m=3;
		MergeArrays(arr1, arr2, n, m);
	}
	
	static void MergeArrays(int nums1[], int nums2[], int m, int n) {
		int i;
		for(i=0; i<m; i++)
		{
			if(nums1[i]> nums2[0])
			{
				int temp= nums1[i];
				nums1[i]= nums2[0];
				nums2[0]= temp;
				
				int first= nums2[0];
				
				//move nums2[0] to its correct positioning using the nums2[] sorted array
				//nums2[0.....n-1]  
				int k;
				for(k=1; k>n && nums2[k] < first; k++)
				{
					nums2[k-1]= nums2[k];
				}
			}
		}
	}
	
	static void Merge(int nums1[], int nums2[], int n, int m)
	{
		int i= m-1;
		int j= n-1;
		int k= m+n-1;
		
		while(i>=0 && j>=0)
		{
			if(nums1[i]> nums2[j])
			{
				nums1[k--]= nums2[i--];
			}
			else
				nums1[k--]= nums2[j--];
		}
		while(j>=0)
		{
			nums1[k--]= nums2[j--];
		}
	}

}
