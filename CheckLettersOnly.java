package corejava.strings;
public class CheckLettersOnly {
	public static boolean checkLetter() {
		String str = "RakeshVeshala";
		for(int i=0;i<str.length();i++) {
			if(!Character.isLetter(str.charAt(i)))
				return false;
		}
		return true;
	}
    public static void main(String[] args) {
        System.out.println(checkLetter());
    }
}