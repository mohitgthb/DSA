class Node {
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
}

// class Solution {

// }

public class Linkedlist {
    public static void main(String[] args){
        int arr[] = {2, 5, 6, 9};

        Node n = new Node(arr[0]);

        System.out.print(n.val + "->");

        for(int i=1; i<=3; i++){
            n.next = new Node(arr[i]);
            n = n.next;
            System.out.print(n.val + "->");
        }

    }
}
