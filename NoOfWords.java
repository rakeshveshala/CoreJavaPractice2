package corejava.strings;

public class NoOfWords {
	public static void main(String[] args) {
		String str="iam a very good programmer";
		String words[] = str.split("\\s+");
		System.out.println("The number of words in a given string are: "+words.length);
	}
}
