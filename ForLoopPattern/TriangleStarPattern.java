package ForLoopPatternProblems;
import java.util.Scanner;
public class TriangleStarPattern {
		public static void main(String[] args) {
			try (Scanner scan = new Scanner(System.in)) {
				System.out.print("Enter the Nuber :");
				int n=scan.nextInt();
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n-i;j++) {
						System.out.print(" ");
					}
					for(int j=1;j<=2*i-1;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
			catch(Exception e) {
				System.out.println("Enter the Integer Numbers Only...!");
			}
			
		}
}
