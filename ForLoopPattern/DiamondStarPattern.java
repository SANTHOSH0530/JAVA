package ForLoopPatternProblems;
import java.util.Scanner;
public class DiamondStarPattern {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter the Number :");
			int n=scan.nextInt();
			//Upper Pattern 
			//Outer Loop For Rows
			for(int i=1;i<=n;i++) {
				//print spaces
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				//print stars
				for(int j=1;j<=2*i-1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			//Lower Pattern
			//Outer Loop For Rows
			for(int i=1;i<n;i++) {
				//Print Spaces
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}
				//Print Stars
				for(int j=1;j<=(n-i)*2-1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
