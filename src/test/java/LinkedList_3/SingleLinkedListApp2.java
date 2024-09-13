package LinkedList_3;

public class SingleLinkedListApp2 {

    public static void main(String[] args) {

        MySinglyLinkedList mylist = new MySinglyLinkedList();

        for (int i = 0 ; i < 15; i++) {
            mylist.add(i);
        }

        mylist.deleteLastNthElement(12);

        mylist.printNodes();

    }

}
