package DsaJavaProgramming;
import java.util.Scanner;
class PowerOf3 {
    public boolean powerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        PowerOf3 obj = new PowerOf3();
        if (obj.powerOfThree(num)) {
            System.out.println(num + " is a power of 3");
        } else {
            System.out.println(num + " is not a power of 3");
        }
    }
}
