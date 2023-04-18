package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithOneQueue {
    public static Queue<Integer> push(Queue<Integer> q1, Integer x) {

        q1.add(x);
        int itr = q1.size() - 1;
        while (itr != 0) {
            int temp = q1.element();
            q1.remove();
            q1.add(temp);
            itr--;
        }


        return q1;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q = push(q, 1);
        q = push(q, 2);
        q = push(q, 3);

//        System.out.println(q);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println("top element is --- " + q.element());


    }
}


