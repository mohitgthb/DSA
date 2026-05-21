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

    public Node insertREC(Node root, int val){

        if(root == null){
            return new Node(val);
        }

        if(val < root.val){
            root.left = insertREC(root.left, val);
        } else {
            root.right = insertREC(root.right, val);
        }

        return root;
    }

    public Node insert(Node root, int val){

        Node newNode = new Node(val);

        if(root == null){
            return newNode;
        }
        
        Node curr = root;
        while(true){

            if(val < curr.val){

                if(curr.left == null){
                    curr.left = newNode;
                    break;
                }
                curr = curr.left;
            } else {

                if(curr.right == null){
                    curr.right = newNode;
                    break;
                }
                curr = curr.right;
            }
        }
        return root;
    }

    public static void main(String[] args){
        BST obj = new BST();

        Node root = new Node(0);

        obj.searchREC(root, 0);
        obj.search(root, 0);
        obj.insertREC(root, 1);
        obj.insert(root, 1);
    }
}
