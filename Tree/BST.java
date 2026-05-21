package Tree;

class Node {
    int val;
    Node left, right;

    Node(int val){
        this.val = val;
    }
}

class BST {

    public Node searchREC(Node root, int val){
        if(root == null || root.val == val){
            return root;
        }

        if(val < root.val){
           return searchREC(root.left, val);
        }

        return searchREC(root.right, val);
    }

    public Node search(Node root, int val){
        if(root == null || root.val == val){
            return root;
        }
        Node curr = root;

        while(curr != null){

            if(root.val == val){
                return root;
            }
            
            if(val < root.val){
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        return null;
    }


    public static void main(String[] args){
        BST obj = new BST();

        Node root = new Node(0);

        obj.searchREC(root, 0);
        obj.search(root, 0);
    }
}
