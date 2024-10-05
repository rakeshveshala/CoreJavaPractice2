package corejava.strings;
public class OccarancesOfChar {
	
    private static void countCharacterOccurrences(String str) {
      
        int[] charCount = new int[256];

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        String str = "Rakesh Veshala"; 
        countCharacterOccurrences(str);
    }
}