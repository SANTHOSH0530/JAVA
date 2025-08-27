
import java.util.Scanner;
public class NumberChangingPyramid {
		public static void main(String[] args) {
			try (Scanner scan = new Scanner(System.in)) {
				System.out.print("Enter the Number :");
				int n=scan.nextInt();
				int num=1;
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print(num+" ");
						num++;
					}
					System.out.println();
				}
			}
			catch(Exception e) {
				System.out.println("Enter the Integer Numbers Only...!");
			}
		}
}
