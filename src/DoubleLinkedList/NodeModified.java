package DoubleLinkedList;
import simpleLinkedList.Node;

public class NodeModified extends Node {
    private Node before;
    public NodeModified(Object data) {
        super(data);
        this.before = null;
    }

    public Node getBefore() {
        return before;
    }

    public void setBefore(Node before) {
        this.before = before;
    }
}
