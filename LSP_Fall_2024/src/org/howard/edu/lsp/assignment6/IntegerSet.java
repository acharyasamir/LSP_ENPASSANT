package org.howard.edu.lsp.assignment6;
import java.util.ArrayList;
import java.util.List;

import java.util.Collections;



/**
 * @author Samir Acharya | @03058028
 * **/



/**
 * This class represents a set of integers using an ArrayList.
 * It supports various operations such as clearing the set, finding its length,
 * comparing two sets, finding the largest and smallest element, adding or removing elements,
 * performing union, intersection, difference, and complement operations, and
 * displaying the set as a string.
 */
public class IntegerSet {
    private List<Integer> set = new ArrayList<>();

    /**
     * Default constructor that creates an empty set.
     */
    public IntegerSet() {}

    /**
     * Constructor that initializes the set with a given list of integers.
     * Ensures no duplicates are added to the set.
     * 
     * @param set List of integers to initialize the set.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>();
        for (int item : set) {
            add(item);
        }
    }

    /**
     * Clears all elements from the set, making it empty.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     * 
     * @return The size of the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Compares the current set with another object to check if they contain
     * the same elements, regardless of order.
     * 
     * @param o The object to compare with.
     * @return True if the sets are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof IntegerSet)) {
            return false;
        }
        IntegerSet otherSet = (IntegerSet) o;
        List<Integer> sortedThisSet = new ArrayList<>(set);
        List<Integer> sortedOtherSet = new ArrayList<>(otherSet.set);
        Collections.sort(sortedThisSet);
        Collections.sort(sortedOtherSet);
        return sortedThisSet.equals(sortedOtherSet);
    }

    /**
     * Checks if the set contains a specified value.
     * 
     * @param value The integer value to check.
     * @return True if the value is in the set, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest element in the set.
     * 
     * @return The largest integer in the set.
     * @throws RuntimeException If the set is empty.
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new RuntimeException("Can't get largest, set is empty.");
        }
        return Collections.max(set);
    }

    /**
     * Returns the smallest element in the set.
     * 
     * @return The smallest integer in the set.
     * @throws RuntimeException If the set is empty.
     */
    public int smallest() {
        if (set.isEmpty()) {
            throw new RuntimeException("Can't get smallest, set is empty.");
        }
        return Collections.min(set);
    }

    /**
     * Adds an item to the set if it is not already present.
     * 
     * @param item The integer to add.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set if it is present.
     * 
     * @param item The integer to remove.
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    /**
     * Combines this set with another set, adding all unique elements from the other set.
     * 
     * @param intSetb The other IntegerSet to perform union with.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!this.set.contains(item)) {
                this.set.add(item);
            }
        }
    }

    /**
     * Modifies this set to keep only the elements that are present in both sets.
     * 
     * @param intSetb The other IntegerSet to perform intersection with.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Removes all elements from this set that are also present in another set.
     * 
     * @param intSetb The other IntegerSet to perform difference with.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Returns the complement of this set with respect to a universal set.
     * The complement consists of all elements in the universal set that are not in this set.
     * 
     * @param universalSet The universal IntegerSet containing all possible elements.
     * @return A new IntegerSet representing the complement of this set.
     */
    public IntegerSet complement(IntegerSet universalSet) {
        IntegerSet complementSet = new IntegerSet();
        for (int item : universalSet.set) {
            if (!this.set.contains(item)) {
                complementSet.add(item);
            }
        }
        return complementSet;
    }

    /**
     * Checks if the set is empty.
     * 
     * @return True if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * 
     * @return A string displaying the elements of the set.
     */
    @Override
    public String toString() {
        return set.toString();
    }
}