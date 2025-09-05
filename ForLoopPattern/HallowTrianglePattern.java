package ForLoopPatternProblems;
import java.util.Scanner;
public class HallowTrianglePattern {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number of rows :");
		int n=scan.nextInt();
		//Outer Loop for rows
		for(int i=1;i<=n;i++) {
			//Inner Loop for rows
			//Print Spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//Print stars and Hallow Spaces
			for(int j=1;j<=2*i-1;j++) {
				if(i==n || j==1 || j==2*i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//print Line by Line 
			System.out.println();
		}
	}
}
