import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        String fileName = "src/main/java/test.txt"; // Update the path if needed
        List<String> lst = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lst.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        int totalcount =0;

        for(String line:lst){
            String[] strlst = line.split(" ");
            int start = Integer.parseInt(strlst[0].split("-")[0]);
            int last = Integer.parseInt(strlst[0].split("-")[1]);
            char ch = strlst[1].charAt(0);
            int cnt =0;
            for(int i=0;i<strlst[2].length();i++){
                if(strlst[2].charAt(i) == ch){
                    cnt++;
                }
            }
            if(start<=cnt && cnt<=last){
                totalcount++;
            }
        }
        System.out.println(totalcount);
        
    }
}
