package ForLoopPatternProblems;
import java.util.Scanner;
public class RightPascalTriangle {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the Number :");
			int n=scan.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=1;i<n;i++) {
				for(int j=1;j<=n-i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println("Enter Integer Numbers Only....");
		}
	}
}
