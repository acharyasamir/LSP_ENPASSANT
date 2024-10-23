package org.howard.edu.lsp.assignment5;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a class that represents a set of integers using an ArrayList.
 * It can't have duplicates and has a bunch of methods to work with the set.
 */
public class IntegerSet {
    private List<Integer> set;  // this is where the integers are stored

    // Default constructor, creates an empty set
    public IntegerSet() {
        set = new ArrayList<Integer>();  // just makes an empty list
    }

    // Another constructor if we already have some values for the set
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;  // initializes with the passed values
    }

    // Clears the whole set, makes it empty again
    public void clear() {
        set.clear();  // just empties the list
    }

    // Returns how many elements are in the set
    public int length() {
        return set.size();  // just returns the size of the list
    }

    // Checks if two sets are the same (doesn't care about the order)
    public boolean equals(Object o) {
        if (o == null || !(o instanceof IntegerSet)) {  // if the other thing isn't a set
            return false;  // definitely not equal
        }
        IntegerSet otherSet = (IntegerSet) o;  // cast to IntegerSet
        return this.set.containsAll(otherSet.set) && otherSet.set.containsAll(this.set);
        // if both sets have the same elements, they're equal
    }

    // Checks if the set contains a specific value
    public boolean contains(int value) {
        return set.contains(value);  // ArrayList already has this function, so easy
    }

    // Returns the largest number in the set (or throws an error if the set is empty)
    public int largest() {
        if (set.isEmpty()) {
            throw new RuntimeException("Can't get largest, set is empty.");
        }
        int largest = set.get(0);  // start with the first element
        for (int num : set) {  // loop through the set
            if (num > largest) {  // found something bigger
                largest = num;
            }
        }
        return largest;
    }

    // Returns the smallest number in the set (or throws an error if the set is empty)
    public int smallest() {
        if (set.isEmpty()) {
            throw new RuntimeException("Can't get smallest, set is empty.");
        }
        int smallest = set.get(0);  // start with the first element
        for (int num : set) {  // loop through the set
            if (num < smallest) {  // found something smaller
                smallest = num;
            }
        }
        return smallest;
    }

    // Adds an item to the set (if it’s not already there)
    public void add(int item) {
        if (!set.contains(item)) {  // only add it if it's not already in the set
            set.add(item);  // add the new item to the list
        }
    }

    // Removes an item from the set if it's there
    public void remove(int item) {
        set.remove((Integer) item);  // remove the item, ArrayList already has this method
    }

    // Combines this set with another set (basically adds all the unique elements from the other set)
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {  // loop through the other set
            if (!this.set.contains(item)) {  // if this set doesn't already have the item
                this.set.add(item);  // add the item
            }
        }
    }

    // Keeps only the elements that are in both sets (intersection)
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);  // ArrayList has this method, keeps only common elements
    }

    // Removes all elements from this set that are also in another set (difference)
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);  // removes all elements that exist in the other set
    }

    // Returns true if the set is empty
    public boolean isEmpty() {
        return set.isEmpty();  // checks if the list is empty
    }

    // Returns a string version of the set so we can print it
    public String toString() {
        return set.toString();  // this just returns the list in string form
    }
}
