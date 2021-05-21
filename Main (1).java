/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


public class Main
{
    public static void merging_sorted_array(int[] arr1,int [] arr2,int [] res,int s1,int s2)
    { 
        int i=0,j=0,k=0;
        
		while(i<s1 && j<s2)
		{
		    if(arr1[i]<arr2[j])
		    {
		        res[k]=arr1[i];
		        i++;k++;
		    }
		    else
		    {
		        res[k]=arr2[j];
		        j++;k++;
		    }
		}
		while (i<s1)
		res[k++]=arr1[i++];
		while(j<s2)
		res[k++]=arr2[j++];
		
    }
    
    
    
    
	public static void main(String[] args)
	{
	   int[] array1 = {1,3,5,7,9};
        int n1 = array1.length;
     
        int[] array2 = {2,4,8,10,11,12,16};
        int n2 = array2.length;
     
        int[] array3 = new int[n1+n2];
         
        merging_sorted_array(array1, array2,array3,n1, n2);
     
        System.out.println("Array after merging");
        for (int i=0; i < n1+n2; i++)
            System.out.print(array3[i] + " ");
	}
}