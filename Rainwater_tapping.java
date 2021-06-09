package myfirst;

public class Rainwater_tapping {
	public static void main(String args[])
	
	{
		
		int building_heights[]= {3,1,2,4,0,1,3,2};
		System.out.print(water_trapped(building_heights));
		
	}
	public static int water_trapped(int building_heights[])
	{
		int no_of_building=building_heights.length;
		int left[]=new int[no_of_building];
		int right[]=new int[no_of_building];
		left[0]=building_heights[0];
		for(int i=1;i<no_of_building;i++)
		{
			left[i]=Math.max(left[i-1], building_heights[i]);
			
		}
		right[no_of_building-1]=building_heights[no_of_building-1];
		for(int i=no_of_building-2;i>=0;i--)
		{
			right[i]=Math.max(right[i+1], building_heights[i]);
			
		}
		int ans=0;
		for(int i=0;i<no_of_building;i++)
		{
			ans=ans+(Math.min(left[i],right[i])-building_heights[i]);
			
		}
		return ans;
	}
}
