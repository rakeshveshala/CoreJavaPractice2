package corejava.strings;
import java.util.*;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter the list elements:");
		while(sc.hasNextLine()){
			String value=sc.nextLine().trim();
			if(value.isEmpty())
			{
				break;
			}
			int val=Integer.parseInt(value);
			list.add(val);		
		}
		Collections.sort(list,Collections.reverseOrder());
		for(int i:list) {
			System.out.print(i+" ");
		}
	}

}
