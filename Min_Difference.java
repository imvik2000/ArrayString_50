package myfirst;
import  java.util.Arrays;

public class Min_Difference {
	
	    
	    static int findMinDiff(int[] arr, int n)
	    {
	          
	           Arrays.sort(arr);
	          
	           
	           int diff = Integer.MAX_VALUE;
	          
	           
	           // pairs in sorted array
	           for (int i=0; i<n-1; i++)
	              if (arr[i+1] - arr[i] < diff)
	                  diff = arr[i+1] - arr[i];
	          
	           // Return min diff
	           return diff;
	    }
	 
	    public static void main(String[] args)
	    {
	        int arr[] = new int[]{1, 5, 3, 19, 18, 25};
	        System.out.println("Minimum difference is "+ findMinDiff(arr, arr.length));
	     
	    }
	}


