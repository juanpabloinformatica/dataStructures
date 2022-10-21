import DoubleLinkedList.DoubleLinkedList;
import simpleLinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Trying linkedList any data type possible
        /*
        LinkedList list = new LinkedList();
        list.addNode(new Integer(1));
        list.addNode(new Integer(2));
        list.showList();
        */

        DoubleLinkedList list = new DoubleLinkedList();
        list.addNode(new Integer(1));
        list.addNode(new Integer(2));
        list.showList();

    }
}