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

    public void postorder2stack(Node root){
        if(root == null) return;

        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st1.push(root);

        while(!st1.isEmpty()){
            Node node = st1.pop();
            st2.push(node);

            if(node.left != null){
                st2.push(node.left);
            }
            if(node.right != null){
                st2.push(node.right);
            }
        }
        while(!st2.isEmpty()){
           System.out.print(st2.pop() + " ");
        }
        
    }

    public void postorder1stack(Node root){
        if(root == null) return;

        Stack<Node> st = new Stack<>();
        Node curr = root;
        Node lastVisited = null;

        while(curr != null || !st.isEmpty()){
            
            while(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            Node peekNode = st.peek();

            if(peekNode.right != null && lastVisited != peekNode.right){
                curr = peekNode.right;
            } else {
                System.out.print(peekNode.val + " ");
                lastVisited = st.pop();
            }
        }
    }

    public void levelOrder(Node root){
        if(root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            Node node = q.poll();

            System.out.print(node.val + " ");

            if(node.left != null){
                q.offer(node.left);
            }

            if(node.right != null){
                q.offer(node.right);
            }
        }
    }

    int diameter = 0;

    public int height(Node root){
        if(root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }

    public int diameterOfBT(Node root){
        height(root);
        return diameter;
    }


    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();

        Node root = new Node(1);

        tree.preorder(root);
        tree.inorder(root);
    }
}
