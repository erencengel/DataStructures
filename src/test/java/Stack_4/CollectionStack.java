package Stack_4;

import java.util.Deque;
import java.util.LinkedList;

public class CollectionStack {

    public static void main(String[] args) {
        Deque<Integer> cStack = new LinkedList<>();
        cStack.push(1);
        cStack.push(2);
        cStack.push(3);
        System.out.println("cStack.peek() = " + cStack.peek());
        System.out.println("cStack.pop() = " + cStack.pop());
        System.out.println("cStack.peek() = " + cStack.peek());
    }

}
