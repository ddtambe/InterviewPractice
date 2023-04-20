package Collections;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        System.out.println("dq.add(): "+dq.add(1));
//        System.out.println("dq.push(): "+dq.push(2)); //It is return void so showing error
        dq.push(2);
        System.out.println("dq.offer(): "+dq.offer(3));
        System.out.println("dq.offerFirst(): "+dq.offerFirst(4));
        System.out.println("dq.getFirst(): "+dq.getFirst());
        System.out.println("dq.peekFirst(): "+dq.peekFirst());
        System.out.println("dq.peek(): "+dq.peek());
    }
}
