package FirstWeek;
import java.util.Scanner;
public class SumDivisibleBy3Or5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Start Value :");
		int start=scan.nextInt();
		System.out.print("Enter the End Value :");
		int end=scan.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);	
	}
}
