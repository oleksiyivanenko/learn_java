package data_structures;

/**
 * Testing data structures.
 */
public class Test {
    private static void testMyList() {
        MyList my_list = new MyList();
        my_list.add("one");
        my_list.add(4);
        my_list.add(3);
        my_list.add(2);
        my_list.add(1);


        my_list.add(0, 1);

        System.out.println(my_list);

        System.out.println(my_list.contains(4));
        System.out.println(my_list.contains("one"));
        System.out.println(my_list.contains(1));
        System.out.println(my_list.contains(10));

        my_list.remove(1);
        System.out.println(my_list);
        System.out.println(my_list.set(0, "set"));
        System.out.println(my_list);
    }

    private static void testMyStack() {
        MyStack stack = new MyStack();
        System.out.println(stack.empty());
        System.out.println(stack);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    private static void testMyLinkedList() {
        MyLinkedList linkedList = new MyLinkedList();
        System.out.println(linkedList);
        System.out.println(linkedList.is_empty());

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        System.out.println(linkedList);
        System.out.println(linkedList.is_empty());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());
        System.out.println(linkedList);

    }

    private static void testMyLinkedStack() {
        MyLinkedStack stack = new MyLinkedStack();
        System.out.println(stack.empty());
        System.out.println(stack);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    public static void main(String[] args) {
        testMyList();
        System.out.println("\n***********\n");
        testMyStack();
        System.out.println("\n***********\n");
        testMyLinkedList();
        System.out.println("\n***********\n");
        testMyLinkedStack();
    }
}
