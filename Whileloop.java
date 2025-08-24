import java.util.Scanner;
public class Whileloop {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int count=0;
            do{
                System.out.println("Enter the Number >10 ");
                count=scan.nextInt();
            }while(count<=10);
        }
    }
}
