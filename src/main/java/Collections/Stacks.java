package Collections;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        System.out.println("stk.push(): "+stk.push(1));
        System.out.println("stk.add(): "+stk.add(20));
        stk.push(15);
        stk.push(25);
        System.out.println(stk);

        System.out.println("stk.peek(): "+stk.peek());

        System.out.println("stk.pop(): "+ stk.pop());
    }
}
