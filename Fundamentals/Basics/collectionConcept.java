import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class collectionConcept {
    public static void main(String[] args) {
        // array list
        ArrayList<String> a = new ArrayList<>();
        a.add("aple");
        a.add("bnana");
        a.add("bnana");
        System.out.println(a);

        for (String fruits : a) {
            System.out.println(fruits);
        }

        // hashset
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20); // Duplicate, won't be added

        for (int num : set) {
            System.out.println(num);
        }

        // hash map
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

// The Collections API in Java provides a framework for working with groups of
// objects (collections). It includes interfaces and classes for managing data
// structures like lists, sets, maps, and more.

// Key Components of Collections API

// List: An ordered collection that allows duplicate elements.
// Example: ArrayList, LinkedList

// Set: A collection that does not allow duplicate elements.
// Example: HashSet, LinkedHashSet, TreeSet

// Map: A collection that maps keys to values (key-value pairs). Keys are
// unique.
// Example: HashMap, LinkedHashMap, TreeMap

// Queue: A collection that processes elements in a specific order (FIFO or
// priority).
// Example: PriorityQueue, Deque

// ArrayList
// A resizable array implementation in the List interface.

// Features:
// Allows duplicate elements.
// Maintains insertion order.
// Supports random access using indexes.
// Non-synchronized (not thread-safe).

// set
// A collection that does not allow duplicate elements.

// Types of Set:
// HashSet: no maintain order
// LinkedHashSet: maintain order
// TreeSet: maintain order in sorted
