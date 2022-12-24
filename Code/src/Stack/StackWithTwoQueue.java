package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithTwoQueue {
    public static Queue<Integer>  push(Queue<Integer> q1, Integer x){
        System.out.println("In");
        System.out.println("q1--- " + q1);

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(x);
        System.out.println("q2--- " + q2);

        while(!q1.isEmpty()){
            System.out.println("while");

            q2.add(q1.remove());
        }
        System.out.println("q2---" + q2.peek());

        q1= q2;
        System.out.println("q1--- " + q1);
        System.out.println("=======");

        return q1;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q= push(q,1);
        q= push(q,2);
//        System.out.println(q);
        System.out.println(q.element());

//        Queue<Integer> q1 = new LinkedList<>();
//q1.add(1);
//q1.add(2);
//        System.out.println(q1.element());
    }
}
