package ForLoopPatternProblems;
import java.util.Scanner;
public class EquilateralCharacterTriangle {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter the Number of Rows :");
			int n=scan.nextInt();
			//Outer Loop For Rows
			for(int i=1;i<=n;i++) {
				//Print Spaces 
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				//Print Character
				// Left Half
				 for (int j=0;j<i;j++) {
		                System.out.print((char)('A'+j));
		            }
				 //Print Character
				 // Right Half 
				 for(int j=i-2;j>=0;j--) {
					 System.out.print((char)('A'+j));
				 }
				System.out.println();
			}
		}
}
