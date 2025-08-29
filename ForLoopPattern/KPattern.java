package ForLoopPatternProblems;
import java.util.Scanner;
public class KPattern {
		public static void main(String[] args) {
			try (Scanner scan = new Scanner(System.in)) {
				System.out.print("Enter the Number of Rows :");
				int n=scan.nextInt();
				//First half
				//Outer Loop for Rows
				for(int i=1;i<=n;i++) {
					//Print Stars 
					for(int j=1;j<=n-i+1;j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				//Outer Loop for Rows
				 //Second Half
				for(int i=2;i<=n;i++) {
					//Inner Loop for Columns
					//Print Stars
					for(int j=1;j<=i;j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			catch(Exception e) {
				System.out.println("Enter Integer Numbers Only..!");
			}
		}
}
