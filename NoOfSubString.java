package corejava.strings;

public class NoOfSubString {

	public static void main(String[] args) {
		String str="iam a very very very good programmer";
		String subString = "very";
		int count=0;
		String words[] = str.split("\\s+");
		for(String sub:words) {
			if(sub.equalsIgnoreCase(subString)) {
				count++;
			}
		}
		System.out.println("The no of of occurances of substring in given string: "+count);
	}

}
