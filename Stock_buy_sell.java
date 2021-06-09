package myfirst;

class Stock_buy_sell{  
public static void main(String args[]){  
int Stock_buy[]={9,15,33,3,4,5};

System.out.print(buy_sell(Stock_buy));
}
public static int buy_sell(int stocks[])
{
	int maxProfit=0;
	int MinSoFar=stocks[0];
	for(int i=0;i<stocks.length;i++)
	{
		MinSoFar=Math.min(MinSoFar,stocks[i]);
		int profit=stocks[i]-MinSoFar;
		maxProfit=Math.max(maxProfit,profit);
	}
	return maxProfit;
}
}  
