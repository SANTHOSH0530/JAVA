package DsaJavaProgramming;
import java.util.*;
public class IfElseProgram {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int score=scan.nextInt();
			if(score>=35 && score<=60) {
				System.out.println("Video Game");
			}
			else if(score>60 && score<=90) {
				System.out.println("iphone");
			}
			else if (score>90 && score<=100) {
				System.out.println("Macbook");
			}
			else {
				System.out.println("Better for the Nexttime");
			}	
		}
		catch(Exception e) {
			System.out.println("Invalid Retry..!");
		}
	}
}			
			