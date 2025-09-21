package FirstWeek;
import java.util.Scanner;
public class EvenNumberrange {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Start Point :");
		int start=scan.nextInt();
		System.out.print("Enter the End Point :");
		int end=scan.nextInt();
		for( int i=start;i<=end;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
}
