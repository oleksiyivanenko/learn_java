package data_structures;

/**
 * Linked list node.
 */
public class Node {
    Object value;
    Node previous;

    public Node(Object value, Node previous) {
        this.value = value;
        this.previous = previous;
    }
}
