package Stack_4;

import java.util.NoSuchElementException;

public class MyStack<T> {

    public SNode<T> bottom;
    public SNode<T> top;
    int size;

    /**
     * Author is Fatih
     * check if the stack is empty or not
     */
    public boolean isEmpty() {
        return bottom == null;
    }

    /**
     * Author is Fatih
     * add a new item to the stack(to the top)
     */
    public void push(T item) {
        SNode<T> node = new SNode<>(item);
        if(isEmpty()) {
            bottom = top = node;
        }else {
            top.next = node;
            top = node;
        }
        size++;
    }

    /**
     * Author is Fatih
     * get the first/top element of the stack
     */
    public T peek() {
        return (T) top.value;
    }

    /**
     * Author is Fatih
     * remove the top element of the stack
     */
    public T pop() {
        SNode peekNode;

        if(isEmpty()) throw new NoSuchElementException();

        if(top == bottom) {
            //stack has one element
            peekNode = top;
            top = bottom = null;
        }else {
            //stack has more than one element
            peekNode = top;
            SNode prev = bottom;
            while (prev.next != top) {
                prev = prev.next;
            }
            prev.next = null;
            top = prev;
        }
        size--;
        return (T) peekNode.value;
    }

}
