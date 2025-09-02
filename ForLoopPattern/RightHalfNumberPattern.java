package ForLoopPatternProblems;
import java.util.Scanner;
class RightHalfNumberPattern{
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the Number :");
			int a=scan.nextInt();
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println("Input Mismatch Exception Please Retry..!");
		}
	}
}