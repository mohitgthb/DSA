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

        arr.push(1);
        arr.peek();
    }
}
