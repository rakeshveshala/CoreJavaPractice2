package corejava.strings;
import java.util.HashSet;

public class NonRepeatedChar {
	public static void main(String[] args) {
		String str="RakeshVeshala";
		StringBuffer unqStr=new StringBuffer();
		HashSet<Character> set = new HashSet<>();
		for(char c:str.toCharArray()) {
			set.add(c);
		}
		for(char c:set) {
			unqStr.append(c);
		}
		System.out.println("This is the unique string: "+unqStr);
	}

}
