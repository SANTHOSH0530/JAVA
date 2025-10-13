package JavaProgram;
public class SellProduct {
	public static void main(String[] args) {
		int price[]= {7,1,5,3,6,4};
		int left=0;
		int right=1;
		int maxprofit=0;
		while(right<price.length) {
			if(price[right]>price[left]) {
			int profit=price[right]-price[left];
			maxprofit=Math.max(maxprofit, profit);
			}
			else {
				left=right;
			}
			right++;
		}
		System.out.println(maxprofit);
	}
}
