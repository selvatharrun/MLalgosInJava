import java.util.*;

public class LSH{
    public static void main(String[] args){
        String doc1 = "i love football";
        String doc2 = "i am passionate about football";
        String doc3 = "wow football best";
        //we perform jssim

        System.out.println(jcsim(doc1,doc2));
    }
    
    public static boolean jcsim(String s1, String s2){
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for(Character s: s1.toCharArray()){
            set1.add(s);
        }
        for(Character m: s2.toCharArray()){
            set2.add(m);
        }
        
        // Check if all characters in s2 are present in s1
        for(Character m: s2.toCharArray()){
            if(!set1.contains(m)){
                return false;
            }
        }
        return true;
    }

    
}
