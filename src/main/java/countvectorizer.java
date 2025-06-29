import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("I love nuggets");
        lst.add("I love burger");
        lst.add("burger is great");

        List<Map<String,Integer>> lst2 = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for(String s : lst){
            Map<String,Integer> map = new HashMap<>();
            String[] words = s.split(" ");
            Arrays.sort(words);
            for(int i = 0; i < words.length; i++){
                String word = words[i].toLowerCase();
                map.put(word, map.getOrDefault(word, 0) + 1);
                set.add(word);
            }
            lst2.add(map);
        }

        List<String> res = new ArrayList<>(set);
        Collections.sort(res);

        System.out.println(res);
        int[][] arr = new int[lst2.size()][res.size()];

        for(int i = 0; i < lst2.size(); i++){
            for(int j = 0; j < res.size(); j++){
                arr[i][j] = lst2.get(i).getOrDefault(res.get(j), 0);
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println("Document " + (i + 1) + ": ");
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
