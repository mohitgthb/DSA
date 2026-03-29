import java.util.*;

class QueueArray{

    int arr[];
    int front, rear, size;

    QueueArray(int size){
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int val){
        if(rear == size-1) System.out.println("overflow");
        arr[++rear] = val;
    }

    int dequeue(){
        if(front > rear){
            System.out.println("Underflow");
            return -1;
        }
        return arr[front++];
    }

    int peek(){
        if(front > rear) return -1;
        return arr[front];
    }

    boolean isEmpty(){
        return front > rear;
    }
}

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        next = null;
    }
}

class QueueList{

    Node front, rear;

    void enqueue(int val){
        Node newNode = new Node(val);

        if(rear == null){
            front = rear = newNode;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue(){

        if(front == null){
            System.out.println("underflow");
        }
        int val = front.val;
        front = front.next;

        if(front == null){
            rear = null;
        }
        return val;
    }

    int peek(){
        if(front == null) return -1;
        return front.val;
    }

    boolean isEmpty(){
        return front==null;
    }
}

public class QueueOperations {
    public static void main(String[] args){

        QueueArray arr = new QueueArray(5);
        QueueList ll = new QueueList();

        arr.enqueue(1);
        ll.enqueue(1);
    }
}
