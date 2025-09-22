package FirstWeek;
import java.util.Scanner;
public class PrintDigitsRightToLeft {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=scan.nextInt();
		if(n<0) n=-n;
		while(n>0) {
			int digit=n%10;
			System.out.print(digit+" ");
			n=n/10;
		}
	}
}
