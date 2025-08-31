package ForLoopPatternProblems;
import java.util.Scanner;
public class NumberChangingPyramid {
		public static void main(String[] args) {
			try (Scanner scan = new Scanner(System.in)) {
				System.out.print("Enter the Numberm of Rows :");
				int n=scan.nextInt();
				int num=1;
				//Outer Loop for Rows
				for(int i=1;i<=n;i++) {
					// Inner Loop for Columns
					// Print Spaces
					for(int j=1;j<=i;j++) {
						System.out.print(num+" ");
						num++;
					}
					//Print line by line 
					System.out.println();
				}
			}
			//Enter the Wrong Input to Execute
			catch(Exception e) {
				System.out.println("Enter the Integer Numbers Only...!");
			}
		}
}
