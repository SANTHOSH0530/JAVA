package java_project_1;
import java.util.Scanner;
public class PrintBetweenNumbers {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter Number 1: ");
			int a = scan.nextInt();
			System.out.print("Enter Number 2: ");
			int b = scan.nextInt();
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		}
		catch(Exception e) {
			System.out.println("Inavlid Input Please Retry..!");
		}
	}
}
