import java.util.*;

public class treebuilder{
    class Node{
        Node left;
        Node right;
        int value;
            
        Node(int x){
            value = x;
        }
    }
    
    Node TreeBuilder(Integer[] lst){
        if(lst[0] == null || lst.length<1){
            return null;
        }
        //so basically i use the queue to keep filling the children nodes, which will be parent nodes later in a breadth order fashion. i need it do lever order array traversal, basically i fill them with the nodes which have to be filled.
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(lst[0]);
        q.offer(root);

        int i=1;
        
        while(i<lst.length){
            Node curr = q.poll();
            
            if(i<lst.length && lst[i]!=null){
                curr.left = new Node(lst[i]);
                q.offer(curr.left);
            }
            i++;
            if(i<lst.length && lst[i]!=null){
                curr.right = new Node(lst[i]);
                q.offer(curr.right);
            }
            i++;
        }

        return root;
    }
    
    public static void main(String[] args){
        treebuilder tb = new treebuilder();
        Integer[] lst = {1,2,3,4,5};
        Node root = tb.TreeBuilder(lst);
        
    }
}