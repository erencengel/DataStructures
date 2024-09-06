package LinkedList;

public class SingleLinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList mylist = new MySinglyLinkedList();
        System.out.println("mylist.isEmpty() = " + mylist.isEmpty());

        for (int i = 0 ; i < 15; i++) {
            mylist.add(i);
        }

        System.out.println(mylist.indexOfAlternative(10));

        mylist.addFirst(-5);

        mylist.addFirst(-7);

        mylist.printNodes();

        System.out.println("");
        MySinglyLinkedList mylist1 = new MySinglyLinkedList();
        mylist1.addFirst(-50);
        mylist1.printNodes();
        mylist1.addFirst(100);
        mylist1.printNodes();


        /*

        mylist.printNodes();

        //check the head
        mylist.deleteById(0);
        System.out.println("");
        mylist.printNodes();

        //check the tail
        mylist.deleteById(9);
        System.out.println("");
        mylist.printNodes();

        //check the middle
        mylist.deleteById(5);
        System.out.println("");
        mylist.printNodes();

        //check out of list
        mylist.deleteById(100);
        System.out.println("");
        mylist.printNodes();


        */
    }

}
