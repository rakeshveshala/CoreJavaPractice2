package corejava.strings;

public class PrintAlphabetsLoop {

	public static void main(String[] args) {
		int count = 97;
		for(int i=0;i<26;i++) {
			System.out.print((char)count++ +" ");
		}
//		for(int i=97;i<(97+26);i++) {
//			System.out.print((char)i +" "); 
//		}
	}

}
