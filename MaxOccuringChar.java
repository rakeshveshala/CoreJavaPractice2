package corejava.strings;
import java.util.HashMap;

import java.util.Map;
 
public class MaxOccuringChar {
    public static void main(String[] args)
    {
 
        String str = "bootstrap     ";
        Map<Character, Integer> hashMap = new HashMap<>();
 
        for(char ch : str.toCharArray()) {
            Integer integer = hashMap.get(ch);
            if(integer == null) {
                hashMap.put(ch, 1);
            }
            else { 
                hashMap.put(ch, integer+1);
            }
        }
        char maxOccurringChar = ' ';
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if(entry.getKey()==' ') {		//To not consider the spaces as characters 
            	continue;
            }
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxOccurringChar = entry.getKey();
            }
        }
        System.out.println("Maximum occurring character: '" + maxOccurringChar + "' with a frequency of " + maxFrequency);
    }
      
}

