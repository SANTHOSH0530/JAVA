package DsaJavaProgramming;
import java.util.*;
public class LoanEligibleOrNotProgram {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter Your Salary :");
			int salary = scan.nextInt();
			System.out.print("Enter Your Age :");
			int age = scan.nextInt();
			if (salary >= 20000 || age <= 25) {
				System.out.println("You are eligible for loan");
				System.out.print("your Required Loan amount :");
				int amount = scan.nextInt();
				if (amount <= 50000) {
					System.out.println("eligible for loan");
				} else {
					System.out.println("Maxiumum Loan Amount is 50000");
				}
			}
		}
	}
}
