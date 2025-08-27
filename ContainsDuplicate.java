import java.util.HashMap;
import java.util.Scanner;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> scan = new HashMap<>();
        for (int i : nums) {
            if (scan.containsKey(i))
                return true;
            scan.put(i, true);
        }
        return false;
    }
}
public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution contain = new Solution();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = contain.containsDuplicate(nums);
        if (result)
            System.out.println("The array contains duplicates.");
        else
            System.out.println("The array does not contain duplicates.");
    }
}
