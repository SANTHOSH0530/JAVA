import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
       try( Scanner Dhivya=new Scanner(System.in)){
        String input=Dhivya.nextLine();
        
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        if (cleaned.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
    catch(Exception e){
        System.out.println("Please Retry!..Enter only Number..");
    }
}
  }
  