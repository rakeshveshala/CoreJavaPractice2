package corejava.strings;

public class CountVowCons {
	public static void main(String[] args) {
		String str="iam a very good programmer";
		str=str.toLowerCase();
		int vowCount=0;
		int consCount=0;
		for(char c:str.toCharArray()) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vowCount++;
			}
			else {
				consCount++;
			}
		}
		System.out.println("Number of vowels in a given string are: "+vowCount);
		System.out.println("Number of Consonants in a given string are: "+consCount);
	}
}
