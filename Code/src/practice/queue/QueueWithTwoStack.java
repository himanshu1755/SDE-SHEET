package practice.queue;

import java.util.Stack;

public class QueueWithTwoStack {
    public static Stack<Integer> input = new Stack<>();
    public static Stack<Integer> output = new Stack<>();

    public static void push(Integer x){
        input.push(x);
    }

    public static Integer pop(){
        if(!output.isEmpty()){
           return output.pop();
        }
        else{
            while(!input.isEmpty()){
                output.push(input.peek());
                input.pop();
            }
            return output.pop();
        }
    }

    public static void main(String[] args) {
    push(1);
    push(2);
    push(3);
    System.out.println(pop());
    System.out.println(pop());
    }
}
