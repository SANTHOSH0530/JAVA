package FirstWeek;
import java.util.Scanner;
public class DivisibleOrNot {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n=scan.nextInt();
		if(n%3==0 && n%5==0)
			System.out.println("Yes,Divisible by 3 and 5");
		else 
			System.out.println("Not Divisible by 3 and 5");
	}
}
