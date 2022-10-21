package simpleLinkedList;

public class LinkedList {
    private Node ptr;

    public LinkedList() {
        this.ptr = null;
    }

    public void addNode(Object data){
        Node newNode = new Node(data);
        if(this.ptr == null){
            this.ptr = newNode;
        }else{
            getLastNode().setNext(newNode);
        }
    }
     private Node getLastNode(){
        Node temp = this.ptr;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }
        return temp;
    }
    public void showList(){
        Node temp = this.ptr;
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}
