package corejava.strings;
import java.util.HashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String str="iam a very good programmer";
		String words[] = str.split("\\s+");
		HashSet<String> unique = new HashSet<>();
		for(int i=0;i<words.length;i++) {
			unique.add(words[i]);
		}
		System.out.println(unique);
	}

}
