package StringPracticeQuestions;
import java.util.Scanner;
public class PrintAsciiValues {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int ascii=(int)ch;
			System.out.println(ch+"->"+ascii);
		}
	}
}
