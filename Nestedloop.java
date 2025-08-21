package java_project_1;
import java.util.Scanner;
class Nestedloop{
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int a=scan.nextInt();
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		}
	}
}