package ForLoopPatternProblems;
import java.util.Scanner;
public class MirrorImageTrianglePattern {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter the Number of rows :");
			int n=scan.nextInt();
			//Upper Pattern
			//Outer Loop for rows
			for(int i=1;i<=n;i++) {
				//Inner Loop for Columns
				//Print Spaces
				for(int j=1;j<=i-1;j++) {
					System.out.print(" ");
				}
				//Print Numbers
				for(int j=i;j<=n;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			//Lower Pattern
			//Outer Loop for Columns
			for(int i=1;i<n;i++) {
				//Inner Loop for rows
				//print Spaces
				for(int j=1;j<=n-i-1;j++) {
					System.out.print(" ");
				}
				//Print Numbers
				for(int j=n-i;j<=n;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
}
