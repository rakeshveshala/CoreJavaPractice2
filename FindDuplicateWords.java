package corejava.strings;

public class FindDuplicateWords {    
    public static void main(String[] args) {    
        String string = "iam a very very good good programmer";    
        int count;    
        string = string.toLowerCase();    
      
        String words[] = string.split(" ");    
            
        System.out.println("Duplicate words in a given string : ");     
        for(int i = 0; i < words.length; i++) {    
            count = 1;    
            for(int j = i+1; j < words.length; j++) {    
                if(words[i].equals(words[j])) {    
                    count++;       
                }    
            }    
                
            if(count > 1)    
                System.out.println(words[i]);    
        }    
    }    
}    
