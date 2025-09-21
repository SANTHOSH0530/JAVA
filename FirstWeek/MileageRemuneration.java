package FirstWeek;
import java.util.Scanner;
public class MileageRemuneration {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Start Point :");
		double start=scan.nextDouble();
		System.out.print("Enter the End Point :");
		double end=scan.nextDouble();
		double distance=(end-start);
		System.out.println("You Traveled :"+distance);
		double remuneration=distance*25;
		System.out.println("Your Remuneration is  :"+remuneration);
	}
}
