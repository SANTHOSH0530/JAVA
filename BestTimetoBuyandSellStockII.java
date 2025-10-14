package JavaProgram;
public class BestTimetoBuyandSellStockII {
	public static int maxprofit(int[] prices ) {
		int profit=0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i]>prices[i-1]) {
				profit=profit+prices[i]-prices[i-1];
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		int prices1[]= {7,1,5,3,6,4};
		int prices2[]= {1,2,3,4,5};
		int prices3[]= {7,6,4,3,1};
		System.out.println(maxprofit(prices1));
		System.out.println(maxprofit(prices2));
		System.out.println(maxprofit(prices3));
	}
}
