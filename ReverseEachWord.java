package corejava.strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str="one two three four";
		String words[]=str.split("\\s+");
		StringBuffer result=new StringBuffer();
		for(String word:words) {
			StringBuffer res=new StringBuffer(word).reverse();
			result.append(res).append(" ");
		}
		System.out.println(result);
	}
}
