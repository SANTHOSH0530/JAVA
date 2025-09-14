package ForLoopPatternProblems;
import java.util.Scanner;
public class XStarPattern {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number of Rows :");
		int n=scan.nextInt();
		//Outer For Loop for Rows
		for(int i=1;i<=n;i++) {
			//Inner For Loop for columns
			//Print Spaces
			for(int j=1;j<=n;j++) {
				if(i==j || j==n-i+1) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}	
}