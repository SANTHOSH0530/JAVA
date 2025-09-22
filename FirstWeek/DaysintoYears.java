package FirstWeek;
import java.util.Scanner;
public class DaysintoYears {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Days :");
		int n=scan.nextInt();
		int year=n/365;
		int remaindays=n%365;
		int Month=remaindays/30;
		int days=remaindays%30;
		System.out.println(year + " years " + Month + " months " + days + " days");
	}
}
