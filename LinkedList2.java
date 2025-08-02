import java.util.*;

public class LinkedList2 {

    public static void main(String args[]) {

        LinkedList<String> ll = new LinkedList<String>();

        // Initial empty list
        System.out.println("Initial list of elements: " + ll);

        // Adding elements at the end
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        System.out.println("After add(E e) method: " + ll);

        // Adding an element at a specific index
        ll.add(1, "Gaurav");
        System.out.println("After add(int index, E element): " + ll);

        // Creating second list
        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("Sonoo");
        ll2.add("Hanumat");

        // Adding all elements from ll2 to ll
        ll.addAll(ll2);
        System.out.println("After addAll(Collection) method: " + ll);

        // Creating third list
        LinkedList<String> ll3 = new LinkedList<String>();
        ll3.add("John");
        ll3.add("Rahul");

        // Adding ll3 elements into ll at specific position
        ll.addAll(1, ll3);
        System.out.println("After addAll(int index, Collection) method: " + ll);

        // Adding element at the beginning
        ll.addFirst("Lokesh");
        System.out.println("After addFirst(E e) method: " + ll);

        // Adding element at the end
        ll.addLast("Harsh");
        System.out.println("After addLast(E e) method: " + ll);
    }
}
