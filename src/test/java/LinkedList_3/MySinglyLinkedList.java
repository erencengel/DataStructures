package LinkedList_3;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int value) {
        Node node = new Node(value);

        if (isEmpty()) {
            head = tail = node;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }


    void deleteById(int id) {

        //check if empty
        if(isEmpty()) System.out.println("List is empty!");

        //assign prev anc current with the head
        Node prev = head;
        Node current = head;

        while (current != null) {
            if(current.id == id) {

                //if there is a match

                if(current == head) {
                    //case-1 head
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    //case-2 tail
                    tail = prev;
                    prev.next = null; //ex tail will be eligible for the garbage collection
                } else {
                    //case-3 middle
                    prev.next = current.next;
                    current.next = null;
                }

                //after deletion
                size--;
            }

            //move forward on the elements on the list
            prev = current;
            current = current.next;
        }
    }

    //write indexOf method
    //return the address of the element, otherwise return -1
    //author Eren Ç.
    //needs to be improved
    int indexOfAlternative(int id) {
        if(isEmpty()) return -1;
        Node element = head;
        while (element.next != null) {
            if(element.id == id) {
                return id;
            }
            element = element.next;
        }
        return -1;
    }

    //write indexOf method
    //return the address of the element, otherwise return -1
    //author is instructor Fatih
    int indexOf(int id) {
        if(isEmpty()) return -1;
        int pos = 0;
        //iterate through the list
        Node current = head; //set my current with the starting element
        while (current != null) {
            if(current.id == id) return pos;
            pos++;
            current = current.next;
        }
        return -1;
    }

    /**
     * implement a method that makes insertion into first element of linkedList
     * author Eren Ç.
     */
    void addFirst(int data) {
        Node addedElement = new Node(data);
        if(isEmpty()) {
            head = tail = addedElement;
            return;
        }
        addedElement.next = head;
        head = addedElement;
    }

    /**
     * get the Kth element from the last
     * author Eren Ç.
     */
    Node getNth(int value) {

        if(isEmpty()) return null;

        Node fast = head;
        Node slow = head;
        Node element = head;

        for (int i = 0; i < value; i++) {
            fast = fast.next;
        }

        while (element != null) {
            for (int i = 0; i < value; i++) {
                fast = fast.next;
                slow = slow.next;
                if(fast.next == null) return slow;
            }
            element = element.next;
        }

        return null;

    }

    /**
     * delete the Kth element from the last
     * author is Eren Ç.
     */
    void deleteLastNthElement(int value) {
        Node nth = getNth(value);
        deleteById(nth.id);
    }



    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) System.out.println(current.id + " => null");
            else {
                System.out.print(current.id + " => ");
            }
            current = current.next;
        }
    }

    /**
     * created by Instructor Fatih
     * add element to the beginning
     *
     */
    void addFirst_Instructor(int data) {
        //create a new node object from data
        Node node = new Node(data);

        if(isEmpty()) {
            //case-1: list is empty
            head=tail=node;
        } else {
            //case-2: list is not empty
            node.next = head;
            head = node;
        }
        //increase size
        size++;
    }

    /**
     * author is Fatih
     * get the Kth element from the last
     */
    int getKthItemFromLast(int k) {

        //create 2 pointers
        Node ptr1 = head;
        Node ptr2 = head;

        //move p2 k-1 times
        for (int i = 0; i < k-1; i++) {
            ptr2 = ptr2.next;
        }

        //move both pointers until ptr2 hits the last element
        while (ptr2 != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        //ptr1 is on the kth element from the last
        return ptr1.id;;
    }

    /**
     * delete Kth element from the last
     * author is Fatih
     */

    void removeKthItemFromLast(int k) {

        //create 3 pointers
        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = null;

        //move p2 k-1 times
        for (int i = 0; i < k-1; i++) {
            ptr2 = ptr2.next;
        }

        //move both pointers until ptr2 hits the last element
        while (ptr2 != null) {
            prev = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        //ptr1 is on the kth element from the last
        //do delete operation
        if(ptr1 == head) {
            head = ptr1.next;
            ptr1.next = null;
            size--;
        }else if(ptr1 == tail){
            tail = prev;
            prev.next = null;
            size--;
        }else {
            prev.next = ptr1.next;
            ptr1.next = null;
            size--;
        }
    }

}
