class Solution {
    private Node head;

    private class Node {
        int val;
        Node prev, next;

        Node(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    public void InsertAtFront(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        if (head != null)
            head.prev = newNode;
        head = newNode;
    }

    public void InsertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
    }

    public void Delete(int val) {
        if (head == null)
            return;
        Node curr = head;

        while (curr != null) {
            if (curr.val == val) {
                if (curr.prev != null) {
                    curr.prev.next = curr.next;
                } else {
                    head = curr.next;
                }

                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                }
                break;
            }
            curr = curr.next;
        }
    }

    public void ReverseDLL() {
        
    }
    

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + "-");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class DoublyLL {
    public static void main(String[] arg) {
        Solution s = new Solution();

        s.InsertAtFront(1);
        s.InsertAtEnd(2);
        s.InsertAtEnd(3);
        s.printList();
        s.Delete(2);
        s.printList();
    }
}