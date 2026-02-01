
class Solution {

    private Node head;

    private static class Node {
        private int val;
        private Node next;

        private Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    
    public void InsertAtFront(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void InsertAtEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void InsertAtPosition(int pos, int val){
        if(pos == 0){
            InsertAtFront(val);
            return;
        }

        Node curr = head;
        Node newNode = new Node(val);
        for(int i = 0; i<pos-1; i++){
            if(curr == null){
                throw new IndexOutOfBoundsException("Invalid position");
            }
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        
    }

    public boolean search(int key) {
        Node curr = head;
        while(curr != null){
            if(curr.val == key){
                System.out.println(true);
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void deleteNode(int val){
        if(head == null) return;

        if(head.val == val){
            head = head.next;
            return;
        }

        Node curr = head;
        while(curr.next != null && curr.next.val != val){
            curr = curr.next;
        }
        if(curr.next != null){
            curr.next = curr.next.next;
        }
    }

    public void reverseList(){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
         System.out.println("null");
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
        s.deleteNode(0);
        //s.search(4);
        s.InsertAtPosition(3, 9);
        s.printList();
        s.reverseList();
        s.printList();
    }
}
