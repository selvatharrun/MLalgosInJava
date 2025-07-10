import java.util.*;

public class LHS{
    public static void main(String[] args){
        String doc1 = "i love football";
        String doc2 = "i am passionate about football";
        String doc3 = "wow football best";
        //we perform jssim

        System.out.println(jcsim(doc1,doc2));
    }
    
    public void boolean jcsim(String s1, String s2){
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        for(Character s: s1.toCharArray()){
            set.add(s);
        }
        for(Character m: s2.toCharArray()){
            if(!set.contains(m)){
                return false;
            }
        }
    }

    
}
