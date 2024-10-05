package corejava.strings;
import java.util.HashMap;
import java.util.Map;

public class UniqueWords {
    public static void main(String[] args) {
     
        String str = "jhony jhony yes papa eating sugar no papa";
        
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
        

        System.out.println("Unique words from given sentence:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}