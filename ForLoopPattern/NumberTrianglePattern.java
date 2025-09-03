package ForLoopPatternProblems;
import java.util.Scanner;
public class NumberTrianglePattern {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in); 
				System.out.print("Enter the Number of Rows :");
				int n=scan.nextInt();
				//Outer Loop for Rows
				for(int i=1;i<=n;i++) {
					//Inner Loop for Rows 
					//Print Spaces
					for(int j=1;j<=n-i;j++) {
						System.out.print(" ");
					}
					//Print Numbers and Spaces
					for(int j=1;j<=i;j++) {
						System.out.print(j+" ");
					}
					//Print line by line 
					System.out.println();
				}
			}
			
		}

