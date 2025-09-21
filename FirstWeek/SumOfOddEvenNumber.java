package FirstWeek;
import java.util.Scanner;
public class SumOfOddEvenNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n=scan.nextInt();
		int oddsum=0;
		int evensum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				evensum=evensum+i;
			}
			else {
				oddsum=oddsum+i;
			}
		}
		System.out.println("Even Number Count :"+evensum);
		System.out.println("Odd Number Count :"+oddsum);
	}
}
