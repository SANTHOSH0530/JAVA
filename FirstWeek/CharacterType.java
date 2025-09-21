package FirstWeek;
import java.util.Scanner;
public class CharacterType {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Input :");
		char n=scan.next().charAt(0);
		if((n>='a'&& n<='z') ||(n>='A' && n<='Z')) {
			System.out.println("Character");
		}
		else if(n>='0' && n<='9') {
			System.out.println("Integer");
		}else {
			System.out.println("Symbol");
		}
	}
}
