import java.util.*;

class StackArray {

    int arr[];
    int size;
    int top;

    StackArray(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int val){

        if(top == size - 1){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = val;
    }

    int pop() {

        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {

        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        System.out.println(arr[top]);
        return arr[top];
    }

    boolean isEmpty(){
        return top == -1;
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

class StackList {

    Node top;

    void push(int val){

        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    int pop(){

        if(top == null){
            System.out.println("Stack underflow");
            return -1;
        }
        int val = top.val;
        top = top.next;
        return val;
    }

    int peek(){

        if(top == null){
            System.out.println("stack underflow");
            return -1;
        }
        return top.val;
    }

    boolean isEmpty(){
        return top == null;
    }
}

public class StackOperations {
    public static void main(String[] args){

        // Stack<Integer> stack = new Stack<>(); 
        
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);

        // System.out.println(stack.peek());

        // stack.pop();

        // System.out.println(stack.peek());

        StackArray arr = new StackArray(5);
        StackList ll = new StackList();

        arr.push(1);
        arr.peek();

        ll.push(1);
    }
}
