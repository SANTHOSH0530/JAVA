package ForLoopPatternProblems;
import java.util.Scanner;
public class HallowHourglassPattern {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number of Rows :");
		int n=scan.nextInt();
		//Upper Pattern
		//Outer Loop for rows
		for(int i=1;i<=n;i++) {
			//Inner Loop for Columns
			//Print Spaces
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			//Print Stars and Hallow Spaces
			for(int j=1;j<=n-i+1;j++) {
				if(i==1 || j==1 || j==n-i+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		//Lower Pattern
	    //Outer Loop for rows
		for(int i=1;i<n;i++) {
			//Inner Loop for Columns
			//Print Spaces
			for(int j=1;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			//Print Stars and Hallow Spaces
			for(int j=1;j<=i+1;j++) {
				if(i==n-1 ||j==1 || j==i+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}	
			}
			System.out.println();
		}
		
	}
}
