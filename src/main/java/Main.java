import java.util.*;

public class Main {
    public static void main(String[] args) {
        String doc1 = "i love football";
        String doc2 = "i am passionate about football";

        System.out.println("Jaccard Similarity: " + jcsim(doc1, doc2));
    }

    public static double jcsim(String s1, String s2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(s1.split(" ")));
        Set<String> set2 = new HashSet<>(Arrays.asList(s2.split(" ")));

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // keep only common elements

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2); // union of both sets
        

        return (double) intersection.size() / union.size();
    }
}
