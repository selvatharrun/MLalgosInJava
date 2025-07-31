class unionfind{
    int[] parent;

    public unionfind(int size){
        parent = new int[size];
        for(int i=0;i<size;i++){
            parent[i] = i;
        }
    }
    public int find(int x){
        if(parent[x]!=x){
            parent[x] = find(parent[x]);
        }   
        return parent[x];
    }
    public boolean union(int x, int y){
        int rootx = find(x);
        int rooty = find(y);

        if(rootx!=rooty){
            parent[rootx] = rooty;
        }
        else{
            return false;
        }
        return true;
    }
    public boolean connected(int x, int y){
        return find(x)==find(y);
    }
}
class Solution {
    public boolean validTree(int n, int[][] edges) {
        unionfind uf = new unionfind(n);

        //count edges;
        if(edges.length!=n-1){
            return false;
        }

        for(int[] lst:edges){
            if(!uf.union(lst[0],lst[1])){
                return false; //to detect a cycle.
            }
        }

        return true;
    }
}
