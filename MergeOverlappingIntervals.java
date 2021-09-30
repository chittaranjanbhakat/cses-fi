//A simple approach is to start from the first interval and compare it with all other intervals for overlapping,
//if it overlaps with any other interval, then remove the other interval from the list and merge the other into
//the first interval. Repeat the same steps for remaining intervals after first. 
//This approach cannot be implemented in better than O(n^2) time.


package SDESheet;
import java.util.*;
import java.io.*;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval arr[]= new Interval[4];
		arr[0]= new Interval(6,8);
		arr[1]= new Interval(1, 9);
		arr[2]= new Interval(2, 4);
		arr[3]= new Interval(4, 7);
		mergeIntervals(arr);
	}
	
	public static void mergeIntervals(Interval arr[])
	{
		
		if(arr.length <= 0)
		{
			return;
		}
		
		//create an empty stack of Intervals
		Stack<Interval> stack= new Stack<>();
		 
		Arrays.sort(arr, new Comparator<Interval>() {
			public int compare(Interval i1, Interval i2) {
				return i1.start- i2.start;
			}
		});
		
		stack.push(arr[0]);
		for(int i=1;i < arr.length ;i++)
		{
			Interval top= stack.peek();
		}
	}
}
class Interval{
	int start, end;
	Interval(int start, int end)
	{
		this.start= start;
		this.end= end;
	}
}