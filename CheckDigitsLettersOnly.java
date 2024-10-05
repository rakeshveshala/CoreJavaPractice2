package corejava.strings;
public class CheckDigitsLettersOnly {
    public static boolean checkDigitsLetters(String str) {
    	return str.chars().allMatch(Character::isLetterOrDigit);
    }

    public static void main(String[] args) {
        String testString = "123shshd456";
        System.out.println(checkDigitsLetters(testString));
    }
}