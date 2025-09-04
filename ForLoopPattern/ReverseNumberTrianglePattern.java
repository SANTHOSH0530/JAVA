package ForLoopPatternProblems;
import java.util.Scanner;
public class ReverseNumberTrianglePattern {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter the Number :");
			int n=scan.nextInt();
			//Outer Loop for Rows 
			for(int i=1;i<=n;i++) {
				//Inner Loop for Columns
				//Print Spaces
				for(int j=1;j<=i-1;j++) {
					System.out.print(" ");
				}
				//Print Numbers and Spaces
				for(int j=i;j<=n;j++) {
					System.out.print(j+ " ");
				}
				//Print Line by Line 
				System.out.println();
			}
		}
}
