package ForLoopPatternProblems;
import java.util.Scanner;
public class PalindromeTrianglePattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of rows :");
		int n = scan.nextInt();
		//Outer Loop for Rows
		for (int i = 1; i <= n; i++) {
			//Inner Loop for columns
			//print spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			//print Numbers and spaces
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			//print Numbers and spaces
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			//print line by line 
			System.out.println();
		}
	}
}
