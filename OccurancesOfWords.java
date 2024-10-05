package corejava.strings;
import java.util.*;
 
public class OccurancesOfWords {
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
        for(Map.Entry<String, Integer> map: hashMap.entrySet()) {
        	System.out.println(map.getKey()+":"+map.getValue());
        }
    }
}
