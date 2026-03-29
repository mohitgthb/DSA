import java.util.*;

public class StackOperations {
    
    public void InbuiltStack(){

        Stack<Integer> stack = new Stack<>(); 
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());
    }

    public static void main(String[] args){

        StackOperations st = new StackOperations();

        st.InbuiltStack();
    }
}
