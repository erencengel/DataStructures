package Queue_5;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionsQueue {

    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueue(1);
        mq.enqueue(2);
        System.out.println(mq.dequeue());

        Queue<Integer> cq = new LinkedList<>();
        cq.add(1);
        cq.add(3);
        System.out.println(cq.remove());
    }

}
