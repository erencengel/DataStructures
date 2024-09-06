package LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        //address of the node object
        System.out.println("node1 = " + node1);
        //what is address of the node1 object
        System.out.println("Next address is: = " + node1.next);

        System.out.println("");

        //let's tie them to each other
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("node1.id = " + node1.id);
        System.out.println("node1.next.id = " + node1.next.id);

        System.out.println("");

        System.out.println("node1's address is " + node1 + " node1's next address is " + node1.next);
        System.out.println("node2's address is " + node2 + " node2's next address is " + node2.next);
        System.out.println("node3's address is " + node3 + " node3's next address is " + node3.next);
        System.out.println("node4's address is " + node4 + " node4's next address is " + node4.next);

        System.out.println("");
        //how to iterate this structure
        Node head = node1;
        while (head != null) {
            System.out.println(head.id);
            head = head.next;
        }
    }

}
