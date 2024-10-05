package corejava.strings;
import java.util.*;
public class SecondLargeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		int count=0;
		int[] arr = new int[100];
		System.out.println("Enter the values");
		while(sc.hasNextLine()){
			String value=sc.nextLine().trim();
			if(value.isEmpty())
			{
				break;
			}
			int val=Integer.parseInt(value);
				
			arr[count]=val;
			count++;		
		}
		Arrays.sort(arr);
		int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
		System.out.println("The second largest number is:"+arr[1]);
	}

}
