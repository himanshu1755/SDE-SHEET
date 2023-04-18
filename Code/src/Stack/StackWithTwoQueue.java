package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithTwoQueue {
    public static Queue<Integer>  push(Queue<Integer> q1, Integer x){
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1= q2;
        return q1;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q= push(q,1);
        q= push(q,2);
        q= push(q,3);

        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println("top element is --- " + q.element());


    }
}
