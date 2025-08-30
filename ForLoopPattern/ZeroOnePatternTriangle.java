package ForLoopPatternProblems;
import java.util.Scanner;
public class ZeroOnePatternTriangle {
		public static void main(String[] args) {
			try (Scanner scan = new Scanner(System.in)) {
				System.out.print("Enter the Number :");
				int a=scan.nextInt();
				for(int i=1;i<=a;i++) {
					for(int j=1;j<=i;j++) {
						if((i+j)%2==0) {
							System.out.print(1+" ");
						}
						else {
							System.out.print(0+" ");
						}
					}
					System.out.println();
				}
			}
			catch(Exception e) {
				System.out.println("Enter Integer Numbers Only...!");
			}
		}
}
