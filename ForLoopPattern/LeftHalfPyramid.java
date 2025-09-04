package ForLoopPatternProblems;
import java.util.Scanner;
public class LeftHalfPyramid {
		public static void main(String[] args) {
			try (Scanner scan = new Scanner(System.in)) {
				System.out.print("Enter the Number of Rows :");
				int a=scan.nextInt();
				//Outer Loop for Rows
				for(int i=1;i<=a;i++) {
					//Inner Loop for Columns
					//Print Spaces
					for(int j=1;j<=a-i;j++) {
						System.out.print(" ");
					}
					//print Stars
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					//print Line by Line
					System.out.println();
				}
			}
			catch(Exception e) {
				System.out.println("Enter the Integer Numbers Only...!");
			}
		}
}
