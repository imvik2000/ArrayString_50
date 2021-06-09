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
//here 1 stock price varies on the basis of days which are givn in form of arrays
// we need to buy stock at low price and sell it as high price on other days

//output is 24 (bought on price at 9 and sold when price reaches 33)