import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Integer i = stack.push(1);
        stack.push(2);
        stack.push(10);
        stack.push(15);

            System.out.println("New stack: " + stack.pop()  + stack.push(1)  +  stack.push(2)  + stack.push(10) );
        }



    }

