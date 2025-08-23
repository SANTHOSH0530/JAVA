package java_project_1;
import java.util.Scanner;
public class Forifelse {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter Number 1 :");
			int a=scan.nextInt();
			System.out.print("Enter Number 2 :");
			int b=scan.nextInt();
			for (int i = a; i <= b; i++) {
				if (i % 2 == 0) {
					System.out.println("Even Number :"+i);
				}
				else {
					System.out.println("Odd Number :"+i);
				}
			}
		}
		catch(Exception e) {
			System.out.println("Invalid Input Please Retry..!");
		}
	}
}
