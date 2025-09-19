package ForLoopQuestions;
import java.util.Scanner;
public class CountPosNegZero {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the How Many Numbers :");
		int n=scan.nextInt();
		int Pos=0;
		int Neg=0;
		int Zero=0;
		for(int i=1;i<=n;i++) {
			System.out.print("Enter the Number "+i+" :");
			int num=scan.nextInt(); 
			if(num>0) Pos++;
			else if(num<0) Neg++;
			else Zero++;
		}
		System.out.println("Positive Count :"+Pos);
		System.out.println("Negative Count :"+Neg);
		System.out.println("Zero Count :"+Zero);
	}
}
