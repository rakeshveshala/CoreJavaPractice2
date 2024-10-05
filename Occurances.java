package corejava.strings;

import java.util.Scanner;

public class Occurances {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        char[] chars = input.toCharArray();
        
        int[] counts = new int[256]; 
        
        for (char c : chars) {
            counts[c]++;
        }
        
        System.out.println("Character frequencies:");
        for(int i = 0; i < counts.length; i++) {
            if(counts[i] > 0) {
                System.out.println((char) i + ": " + counts[i]);
            }
        }
        
    }
}