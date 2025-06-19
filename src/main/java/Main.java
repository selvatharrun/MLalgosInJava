import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("I love nuggets");
        lst.add("I love burger");
        lst.add("burger is great");
        
        Map<String,Integer> map = new HashMap<>();
        List<Map<String,Integer>> lst2 = new ArrayList<>();

        for(String s:lst){
            String[] words = s.split(" ");
            for(int i = 0;i<words.length;i++){
                map.put(words[i],map.getOrDefault(0,map.get(words[i])+1));
            }
            lst2.add(map);
        }
        System.out.println(lst2);
    }
}

