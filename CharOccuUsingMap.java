package corejava.strings;
import java.util.HashMap;
import java.util.Map;
 
public class CharOccuUsingMap {
    public static void main(String[] args)
    {
 
        String str = "rakesh is a good programmer";
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
        for(Map.Entry<Character, Integer> map: hashMap.entrySet()) {
        	System.out.println(map.getKey()+":"+map.getValue());
        }
    }
}
