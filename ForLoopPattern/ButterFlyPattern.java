package ForLoopPatternProblems;
import java.util.Scanner;
public class ButterFlyPattern {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number of Rows :");
		int n=scan.nextInt();
		//Upper Pattern 
		//Outer Loop for rows
		//Left side 
		for(int i=1;i<=n;i++) {
			//left Stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//Print Spaces
			for(int j=1;j<=(n-i)*2;j++) {
				System.out.print(" ");
			}
			//Print  Right Stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Down pattern
		//Outer Loop for rows
		for(int i=1;i<=n;i++) {
			//Print left stars
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			//Print Spaces
			for(int j=1;j<=2*i-2;j++) {
				System.out.print(" ");
			}
			//Print Right Stars
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
