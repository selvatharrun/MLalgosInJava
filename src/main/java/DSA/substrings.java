// import java.util.*;

// public class substrings {
//     Set<List<Character>> mainlst = new HashSet<>();

//     public void backtrack(char[] lst, int index, List<Character> path) {
//         mainlst.add(new ArrayList<>(path));  // Add every unique path

//         for (int i = index; i < lst.length; i++) {
//             path.add(lst[i]);
//             backtrack(lst, i + 1, path);
//             path.remove(path.size() - 1); // backtrack
//         }
//     }

//     public static void main(String[] args) {
//         String a = "abcd";
//         char[] ch = a.toCharArray();

//         substrings obj = new substrings();
//         obj.backtrack(ch, 0, new ArrayList<>());
        

//         // Print the result
//         for (List<Character> sub : obj.mainlst) {
//             System.out.println(sub);
//         }
//     }
// }
