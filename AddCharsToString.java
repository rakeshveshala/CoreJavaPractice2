package corejava.strings;

public class AddCharsToString {

	public static void main(String[] args) {
		String str = "Rakesh";
		System.out.println(str+" this is direct string addition");
		System.out.println(str.concat(" this is concat method"));
		StringBuffer buf = new StringBuffer("Rakesh");
		System.out.println(buf.append(" this is append method"));
	}

}
