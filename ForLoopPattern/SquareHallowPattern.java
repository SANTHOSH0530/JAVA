package ForLoopPatternProblems;

import java.util.Scanner;

public class SquareHallowPattern {
		public static void main(String[] args) {
			try (Scanner scan = new Scanner(System.in)) {
				System.out.print("Enter the Number :");
				int n=scan.nextInt();
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(i==1 || j==1 || i==n || j==n) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}
			catch(Exception e) {
				System.out.println("Enter Integer Number Only...!");
			}
		}
}
