import java.io.*;
import java.util.*;

public class AOC20203{
    public static void main(String[] args){
        String filename = "src/main/java/AOC20203.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String l = br.readLine();
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}