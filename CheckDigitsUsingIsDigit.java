package corejava.strings;
public class CheckDigitsUsingIsDigit {
	public static boolean checkDigit() {
		String str = "123456";
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i)))
				return false;
		}
		return true;
	}
    public static void main(String[] args) {
        System.out.println(checkDigit());
    }
}