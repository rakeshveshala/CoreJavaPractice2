package corejava.strings;

public class PalindromeCheck {
	public boolean checkPal(String str) {
		String str2="";
		for(int i=str.length()-1;i>=0;i--) {
			str2=str2+str.charAt(i);
		}
		if(str2.equalsIgnoreCase(str)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		boolean check=new PalindromeCheck().checkPal("madam");
		System.out.println(check);
	}

}
