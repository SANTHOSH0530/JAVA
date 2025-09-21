package FirstWeek;
import java.util.Scanner;
public class TriangleType {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a==b || b==c)
			System.out.println("Equilateral Triangle");
		else if(a==b || b==c || a==c )
			System.out.println("Isosceles Triangle");
		else 
			System.out.println("Scalene Triangle");
	}
}
