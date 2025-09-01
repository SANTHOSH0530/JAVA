package ForLoopPatternProblems;
import java.util.Scanner;
public class RhombusPattern {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter the Number of Rows :");
			int n=scan.nextInt();
			//Outer Loop for Rows
			for(int i=1;i<=n;i++) {
				//Inner Loop For Columns
				// Print Spaces 
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				//Print Stars
				for(int j=1;j<=n;j++) {
					System.out.print("*");
				}
				// print line by line 
				System.out.println();
			}
		}
}
