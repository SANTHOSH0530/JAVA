import java.util.HashMap;
class solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean> scan =new HashMap<>();
        for(int i:nums){
            if(scan.containsKey(i))
              return true;
            scan.put(i,true);
        }
        return false;
    }
}
public class ContainsDuplicate {
    public static void main(String[] args) {
        solution contain =new solution();
        int[] nums1={1,2,3,4};
        int[] nums2={1,2,3,1};
        System.out.println(contain.containsDuplicate(nums1));
        System.out.println(contain.containsDuplicate(nums2));
    }

    
}