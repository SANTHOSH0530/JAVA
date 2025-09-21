package FirstWeek;
import java.util.Scanner;
public class CreditCardEligibility {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Age :");
		int primaryage=scan.nextInt();
		System.out.print("Enter Card Applicant Age : ");
		int addonage=scan.nextInt();
		System.out.print("Enter the Employee Type 1 to 4 :");
		int employeetype=scan.nextInt();
		System.out.print("Enter the Salary :");
		int salary=scan.nextInt();
		boolean primaryagevalid=(primaryage>=21 && primaryage<=60);
		boolean addonagevalid=(addonage>18);
		boolean employeetypevalid=(employeetype>=1 && employeetype<=4);
		boolean salaryvalid=(salary<=300000);
		if(primaryagevalid && addonagevalid && employeetypevalid && salaryvalid ) {
			System.out.println("Yes,You are Eligible for SBI Credit Card");
		}else {
			System.out.println("Not Eligible for SBI Credit Card ");
		}
	}
}
