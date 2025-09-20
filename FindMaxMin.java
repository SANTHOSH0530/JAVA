package ForLoopQuestions;
import java.util.Scanner;
public class FindMaxMin {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter How Many Numbers :");
		int n=scan.nextInt();
		System.out.print("Enter Number 1 :");
		int num=scan.nextInt();
		int max=num;
		int min=num;
		for(int i=2;i<=n;i++) {
			System.out.print("Enter Number "+i+" :");
			int n1=scan.nextInt();
			if(n1>max) {
				max=n1;
			}
			if(n1<min) {
				min=n1;
			}
		}
		System.out.println("Maximum Number is :"+max);
		System.out.println("Minimum Number is :"+min);
	}
}
