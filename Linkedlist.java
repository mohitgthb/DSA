class Node {
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
}

 class Solution {

    Node head;
    
    public void InsertAtFront(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void InsertAtEnd(int val){
        Node newNode = new Node(val);
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
    }
 }

public class Linkedlist {
    public static void main(String[] args){

        Solution s = new Solution();

        s.InsertAtFront(1);
        s.InsertAtFront(2);
        s.InsertAtFront(3);
        s.InsertAtEnd(0);
        s.InsertAtEnd(5);
        s.printList();
    }
}
