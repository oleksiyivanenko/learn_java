package data_structures;

import java.util.EmptyStackException;

/**
 * Own implementation of Stack on top of array.
 */
public class MyStack {
    private static final int DEFAULT_CAPACITY = 4;

    private Object[] container;
    private int size;

    /**
     * Size getter.
     *
     * @return Stack size.
     */
    private int getSize() {
        return size;
    }

    /**
     * Size setter.
     *
     * @param size New stack size.
     */
    private void setSize(int size) {
        this.size = size;
    }

    /**
     * Default constructor. Creates stack of DEFAULT_CAPACITY.
     */
    public MyStack() {
        container = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Ensures that there is some free capacity in container.
     * In case if there are no free slots in container creates
     * new container doubled in size.
     */
    private void ensureCapacity() {
        if (getSize() >= container.length) {
            Object[] newContainer = new Object[container.length * 2];
            for (int i = 0; i < container.length; i++) {
                newContainer[i] = container[i];
            }
            container = newContainer;
        }
    }

    /**
     * Checks if stack is empty.
     *
     * @return True only if stack has no elements.
     */
    public boolean empty() {
        return getSize() == 0;
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

        return container[getSize() - 1];
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

        Object poped = container[getSize() - 1];
        setSize(getSize() - 1);

        return poped;
    }

    /**
     * Set provided item ot top of stack.
     *
     * @param item An object to add to stack.
     * @return Provided item.
     */
    public Object push(Object item) {
        ensureCapacity();

        container[getSize()] = item;
        setSize(getSize() + 1);

        return item;
    }

    /**
     * Overrides toString to make my stack printable.
     *
     * @return A string with cute stack representation.
     */
    @Override
    public String toString() {
        String representation = "[";
        for (int i = 0; i < getSize(); i++) {
            if (i != 0) {
                representation += ",";
            }
            representation += container[i];
        }
        representation += "]";
        return representation;
    }
}
