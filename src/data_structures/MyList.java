package data_structures;

/**
 * Own implementation of List on top of array.
 */
public class MyList {
    private static final int DEFAULT_CAPACITY = 4;

    private Object[] container;
    private int size;

    /**
     * List size getter.
     *
     * Should be named size to align with List<E> interface.
     *
     * @return Number of elements in list.
     */
    public int size() {
        return size;
    }

    /**
     * List size setter.
     *
     * @param size An int for new list size.
     */
    private void setSize(int size) {
        this.size = size;
    }

    /**
     * Default constructor. Creates list of DEFAULT_CAPACITY.
     */
    public MyList() {
        container = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Constructor with possibility to set list capacity.
     *
     * @param capacity An int for setting initial container capacity.
     */
    public MyList(int capacity) {
        container = new Object[capacity];
    }

    /**
     * Ensures that there is some free capacity in container.
     * In case if there are no free slots in container creates
     * new container doubled in size.
     */
    private void ensureCapacity() {
        if (size() >= container.length) {
            Object[] newContainer = new Object[container.length * 2];
            for (int i = 0; i < container.length; i++) {
                newContainer[i] = container[i];
            }
            container = newContainer;
        }
    }

    /**
     * Checks if object is in list.
     *
     * @param o An object to check if it in list.
     * @return A boolean which represents if object is in list.
     */
    public boolean contains(Object o) {
        for (int i = 0; i <= size(); i++) {
            if (container[i] == o) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds object to the end of list.
     *
     * @param o An object to add.
     * @return An boolean set to true.
     */
    public boolean add(Object o){
        ensureCapacity();
        container[size()] = o;
        setSize(size() + 1);

        return true;
    }

    /**
     * Inserts object on specific position in list.
     * All other objects shifts to the right.
     *
     * @param index An int for position in with make insert.
     * @param o An object to insert.
     */
    public void add(int index, Object o) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity();

        for (int i = size(); i > index; i--) {
            container[i] = container[i - 1];
        }
        container[index] = o;
        setSize(size() + 1);
    }

    /**
     * Overrides equals method for list needs.
     *
     * @param o An object to compare with current list.
     * @return A boolean which represents if lists are equal.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof MyList)) {
            return false;
        }

        final MyList other = (MyList) o;
        if (size() != other.size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (container[i] != other.get(i)){
                return false;
            }
        }

        return true;
    }

    /**
     * Gets element by index from list.
     *
     * @param index An int index of element.
     * @return An object from index position.
     */
    public Object get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return container[index];
    }

    /**
     * Removes element from provided index. Shifts other list
     * element to the left.
     *
     * @param index An int index of element to remove.
     * @return Removed object.
     */
    public Object remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        Object removed = container[index];

        for(int i = index; i < size() - 1; i++) {
            container[i] = container[i + 1];
        }
        setSize(size() - 1);

        return removed;
    }

    /**
     * Replaces element on index position with provided object.
     *
     * @param index An int index of element to replace.
     * @param o An object to be inserted.
     * @return Replaced element.
     */
    public Object set(int index, Object o) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        Object replaced = container[index];
        container[index] = o;
        return replaced;
    }

    /**
     * Overrides toString to make my list printable.
     *
     * @return A string with cute list representation.
     */
    @Override
    public String toString() {
        String representation = "[";
        for (int i = 0; i < size(); i++) {
            if (i != 0) {
                representation += ",";
            }
            representation += container[i];
        }
        representation += "]";
        return representation;
    }
}
