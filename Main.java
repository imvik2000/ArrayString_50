/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void kadane(int[] arr)
    {
        int size=arr.length;
       int  max_so_far=arr[0];
       int max_ending_here=0;
       int start=0;int end=0;int s=0;
        for(int i=0;i<size;i++)
		{
		    max_ending_here=max_ending_here+arr[i];
		    if(max_so_far<max_ending_here)
		    {
		        max_so_far=max_ending_here;
		        start=s;end=i;
		    }
		    if(max_ending_here<0)
		    {
		        max_ending_here=0;
		        s=i+1;
		    }
		    
		}
		System.out.println("max contigous sub array sum " + max_so_far);
		System.out.println("max contigous sum array starting sub index of array= " + start);
		System.out.println("max contigous sum array ending sub index of array = " + end);
    }
    
    
    
    
	public static void main(String[] args)
	{
	   
	   // int arr[]=new int[10];
	    int arr[]={4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
// 		System.out.println("Hello World");

		kadane(arr);
	}
}
