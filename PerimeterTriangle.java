package JavaProgram;
import java.util.Scanner;
public class PerimeterTriangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Array Size :");
		int size=scan.nextInt();
		int nums[]=new int[size];
		for(int i=0;i<size;i++) {
			nums[i]=scan.nextInt();
		}
		for(int i=nums.length-1;i>=2;i--) {
			if(nums[i-2]+nums[i-1]>nums[i]) {
				System.out.println("Largest perimeter is :"+(nums[i]+nums[i-1]+nums[i-2]));
			}
		}
	}
}
