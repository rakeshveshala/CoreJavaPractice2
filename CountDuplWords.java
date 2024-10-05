package corejava.strings;
import java.util.HashMap;
import java.util.Map;

public class CountDuplWords {
    public static void main(String[] args) {
     
        String str = "rakesh is a good boy and do a lot of good things to good people";
        
        Map<String, Integer> wordCountMap = new HashMap<>();
        

        String[] words = str.split("\\s+");
        
   
        for (String word : words) {
            
            Integer count = wordCountMap.get(word);
            if (count == null) {
              
                wordCountMap.put(word, 1);
            } else {
            
                wordCountMap.put(word, count + 1);
            }
        }
        

        System.out.println("Duplicate words and their counts:");
        int count1=0;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                count1+=entry.getValue();
            }
        }
        System.out.println("Total number of duplicate words are : "+count1);
    }
}