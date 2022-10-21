package DoubleLinkedList;

import simpleLinkedList.Node;

public class DoubleLinkedList {

    private NodeModified ptr;

    public DoubleLinkedList() {
        this.ptr = null;
    }
    public void addNode(Object data){
        NodeModified newNode = new NodeModified(data);
        if(this.ptr == null){
            this.ptr = newNode;
            this.ptr.setBefore(null);
        }else{
            newNode.setBefore(getLastNode());
            getLastNode().setNext(newNode);
        }
    }
    private Node getLastNode() {
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
