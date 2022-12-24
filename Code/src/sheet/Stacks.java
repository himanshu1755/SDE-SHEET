package sheet;

import java.util.Stack;

//https://www.javatpoint.com/java-stack
public class Stacks {

    public static void main(String[] args) {
        Stack<Integer> stk= new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);

        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.peek());


    }
}
