package corejava.strings;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
        String str = "Rakesh veshala        from		 INDIA";
        String str2="padma kumar";
        System.out.println(str2.replaceAll(" ", ""));//to remove white spaces only
        
        System.out.println(str.replaceAll("\\s+", ""));//to remove tab spaces also
        
        System.out.println(str.replaceAll("a", "@"));//to replace a with @
    }
}
