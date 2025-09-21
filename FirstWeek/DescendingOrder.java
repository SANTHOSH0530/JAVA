package FirstWeek;
import java.util.Arrays;
import java.util.Scanner;
public class DescendingOrder {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Array Size :");
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter "+(i+1)+" Number :");
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i=size-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
