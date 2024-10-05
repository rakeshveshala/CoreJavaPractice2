package corejava.strings;
import java.util.HashMap;
import java.util.Map;
 
public class MaxOccuringWord {
    public static void main(String[] args)
    {
 
        String str = "rakesh is a good good boy and do lot of good things to others";
        Map<String, Integer> hashMap = new HashMap<>();
 
        String[] words = str.split("\\s+");
 
        for(String word : words) {
            Integer integer = hashMap.get(word);
            if(integer == null) {
                hashMap.put(word, 1);
            }
            else { 
                hashMap.put(word, integer+1);
            }
        }
        String maxOccurringString = "";
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxOccurringString = entry.getKey();
            }
        }
        System.out.println("Maximum occurring character: '" + maxOccurringString + "' with a frequency of " + maxFrequency);
    }
}
