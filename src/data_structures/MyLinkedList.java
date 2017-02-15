package data_structures;

/**
 * Own implementation of linked list.
 *
 * Current implementation is far from full linked
 * list functionality. Implemented to be sufficient
 * for stack.
 */
public class MyLinkedList {
    private Node head = null;

    /**
     * Appends object to the end of list.
     *
     * @param o An object to be appended.
     * @return Provided object.
     */
    public Object append(Object o) {
        Node node = new Node(o, head);
        head = node;

        return o;
    }

    /**
     * Get last element without removing it from list.
     *
     * @return Last element.
     */
    public Object getLast() {
        if (head != null) {
            return head.value;
        }
        return null;
    }

    /**
     * Get last element and remove it from list.
     *
     * @return Last element.
     */
    public Object pop() {
        if (head != null) {
            Object value = head.value;
            head = head.previous;
            return value;
        }
        return null;
    }

    /**
     * Checks if current list has any elements.
     *
     * @return true if list has no elements.
     */
    public boolean is_empty() {
        return head == null;
    }

    /**
     * Overrides toString to make my linked list printable.
     *
     * @return A string with readable linked list representation.
     */
    @Override
    public String toString() {
        if (head == null) {
            return "<empty>";
        }

        Node cursor = head;
        String representation = "" + cursor.value;

        while (cursor.previous != null) {
            cursor = cursor.previous;
            representation += " -> " + cursor.value;
        }
        return representation;
    }
}
