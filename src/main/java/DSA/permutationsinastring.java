// public class permutationsinastring {
//     // List<String> mainstr = new ArrayList<>();

//     // public void backtrack(char[] s1, boolean[] used,StringBuilder str1){

//     //     if(s1.length == str1.length()){
//     //         mainstr.add(str1.toString());
//     //         return;
//     //     }

//     //     for(int i=0;i<s1.length;i++){
//     //         if(used[i]){
//     //             continue;
//     //         }
//     //         str1.append(s1[i]);
//     //         used[i] = true;

//     //         backtrack(s1,used,str1);

//     //         used[i] = false;
//     //         str1.deleteCharAt(str1.length() - 1);
//     //     }
//     // }

//     // public boolean checkInclusion(String s1, String s2) {

//     //     //check length.
//     //     if(s2.length()>s1.length()){
//     //         return false;
//     //     }

//     //     // //letter frequency.
//     //     // Map<Character,Integer> map = new HashMap<>();

//     //     // for(char c: s1.toCharArray()){
//     //     //     map.put(c,map.getOrDefault(c,0)+1);
//     //     // }

//     //     // for(char c1: s2.toCharArray()){
//     //     //     if(map.containsKey(c1) && map.get(c1)>0){
//     //     //         map.put(c1, map.getOrDefault(c1,0)-1);
//     //     //     }
//     //     // }
//     //     // int sum=0;
//     //     // for(int i: )

//     //     //final resort we backtrack.
//     //     // boolean[] used = new boolean[s1.length()];
//     //     // StringBuilder sb = new StringBuilder();
//     //     // backtrack(s1.toCharArray(), used, sb);

//     //     // for(String s: mainstr){
//     //     //     if(s2.contains(s)){
//     //     //         return true;
//     //     //     }
//     //     // }
//     //     // return false;
//     //     int len1 = s1.length();

//     //     Map<Character,Integer> map1 = new HashMap<>();
//     //     for(char c: s1.toCharArray()){
//     //         map1.put(c,map1.getOrDefault(c,0)+1);
//     //     }

//     //     for(int i=0;i<=s2.length()-len1;i++){
//     //         Map<Character,Integer> map2 = new HashMap<>();
//     //         for(int j=0;j<len1;j++){
//     //             map2.put(s2.charAt(i+j),map2.getOrDefault(s2.charAt(i+j),0)+1);
//     //         }

//     //         if(map1.equals(map2))return true;
//     //     }
//     //     return false;

//     }
// }