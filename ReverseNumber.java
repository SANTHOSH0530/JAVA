import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;       // Get last digit
            reversed = reversed * 10 + digit;  // Add digit to reversed number
            num = num / 10;             // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}
