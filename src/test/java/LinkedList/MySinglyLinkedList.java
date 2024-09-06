package LinkedList;

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

    //implement a method that makes insertion into first element of linkedList
    //author Eren Ç.
    void addFirst(int data) {
        Node addedElement = new Node(data);
        if(isEmpty()) {
            head = tail = addedElement;
            return;
        }
        addedElement.next = head;
        head = addedElement;
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

}
