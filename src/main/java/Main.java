import java.util.*;

class UnionFind{
    int[] parent; //returns its parent; 
    int[] rank;    //returns the estimate height;

    public void unionfind(int size){
        parent = new int[size];
        rank = new int[size];

        //to initialize the parents of the elements are themselves, as they are all disjoint sets on their own to begin with.
        for(int i =0; i<size;i++){
            parent[i] = i;
        }
    }

    //returns the root of the node.
    public int find(int x){
        if(parent[x] != x){
            parent[x] = find(x);
        }
        return parent[x];
    }

    public void union(int x, int y){
        int rootx = find(x);
        int rooty = find(y);
        //if in case both the roots are equal, then they belong to the same set, no union needed.
        if(rootx==rooty)return;

        // 2 of these are for if either of their ranks are lesser.
        else if(rank[rootx]<rank[rooty]){ 
            parent[rootx] = rooty;
        }
        else if(rank[rooty] < rank[rootx]){
            parent[rooty] = rootx;
        }
        //this is if both their ranks are equal.
        else{
            parent[rooty] = rootx;
            rank[rootx]++;
        }
    }

    public boolean connected(int x, int y){
        return find(x) == find(y);
    }
    
}
public class Main {

    public static void main(String[] args) {
        
    }
}
