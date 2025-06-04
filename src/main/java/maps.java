import java.util.*;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
class Node{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
public class TreeBuilder {
  public Node builder(Integer[] arr){

    if(arr.length == 0||arr[0]==null)return null;
    Node root = new Node(arr[0]);
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int i = 1;

    while(!q.isEmpty() && i<arr.length){
      Node current = q.poll();
      if(arr[i]!=null){
        current.left = new Node(arr[i]);
        q.add(current.left);
      }
      i++;
      if(i<arr.length && arr[i]!=null){
        current.right = new Node(arr[i]);
        q.add(current.right);
      }
      i++;
    }
    return root;
  }
  public void inorder(Node root){
    if(root == null) return;
    inorder(root.left);
    System.out.println(root.data + "");
    inorder(root.right);
  }

  public static void main(String[] args) {
    Integer[] arr = {1,2,3,4,5,6,7};
    TreeBuilder builder  = new TreeBuilder();
    Node root = builder.builder(arr);
    builder.inorder(root);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}