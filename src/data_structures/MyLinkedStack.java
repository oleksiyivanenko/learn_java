package data_structures;

import java.util.EmptyStackException;

/**
 * Own implementation of Stack on top of linked list.
 */
public class MyLinkedStack {
    private MyLinkedList container = new MyLinkedList();

    /**
     * Checks if stack is empty.
     *
     * @return True only if stack has no elements.
     */
    public boolean empty() {
        return container.is_empty();
    }

    /**
     * Returns top stack element without removing it.
     *
     * @return An object from stack top.
     */
    public Object peek() {
        if (empty()) {
            throw new EmptyStackException();
        }

        return container.getLast();
    }

    /**
     * Returns top stack element and removes it from stack.
     *
     * @return An object from stack top.
     */
    public Object pop() {
        if (empty()) {
            throw new EmptyStackException();
        }

        return container.pop();
    }

    /**
     * Set provided item ot top of stack.
     *
     * @param item An object to add to stack.
     * @return Provided item.
     */
    public Object push(Object item) {
        return container.append(item);
    }

    /**
     * Overrides toString to make my stack printable.
     *
     * @return A string with cute stack representation.
     */
    @Override
    public String toString() {
        return container.toString();
    }
}
