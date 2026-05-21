package Tree;
import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    
    public void preorder(Node root){
        if(root == null) return;

        Stack<Node> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            Node node = st.pop();

            System.out.print(node.val + " ");

            if(node.right != null){
                st.push(node.right);
            }

            if(node.left != null){
                st.push(node.left);
            }
        }
    }

    public void inorder(Node root){
        if(root == null) return;

        Stack<Node> st = new Stack<>();

        Node curr = root;
        while(curr != null || !st.isEmpty()){

            while(curr!=null){
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            System.out.print(curr.val + " ");

            curr = curr.right;

        }
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();

        Node root = new Node(1);

        tree.preorder(root);
        tree.inorder(root);
    }
}
