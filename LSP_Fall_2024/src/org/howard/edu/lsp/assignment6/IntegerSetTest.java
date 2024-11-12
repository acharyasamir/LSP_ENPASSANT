package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



/**
 * @author Samir Acharya | @03058028
 * **/




public class IntegerSetTest {
    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set1.add(1);
        set1.add(2);
        set1.clear();
        assertTrue(set1.isEmpty(), "Set should be empty after clear()");
        assertEquals(0, set1.length(), "Length should be 0 after clear()");
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(0, set1.length(), "New set should have length 0");
        set1.add(1);
        assertEquals(1, set1.length(), "Set length should be 1 after adding one element");
        set1.add(2);
        assertEquals(2, set1.length(), "Set length should be 2 after adding another element");
        
        // Test duplicate
        set1.add(2);
        assertEquals(2, set1.length(), "Adding duplicate elements should not increase set size");
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        assertTrue(set1.equals(set2), "Two empty sets should be equal");
        
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2), "Sets with same elements in different order should be equal");
        
        set2.add(3);
        assertFalse(set1.equals(set2), "Sets with different elements should not be equal");
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        set1.add(1);
        set1.add(2);
        assertTrue(set1.contains(1), "Set should contain the element 1");
        assertTrue(set1.contains(2), "Set should contain the element 2");
        assertFalse(set1.contains(3), "Set should not contain the element 3");
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() throws IntegerSetException {
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(3, set1.largest(), "Largest element should be 3");
    }

    @Test
    @DisplayName("Test case for largest with empty set")
    public void testLargestEmpty() {
        assertThrows(IntegerSetException.class, () -> set1.largest(), "Calling largest on an empty set should throw an exception");
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
        set1.add(3);
        set1.add(1);
        set1.add(2);
        assertEquals(1, set1.smallest(), "Smallest element should be 1");
    }

    @Test
    @DisplayName("Test case for smallest with empty set")
    public void testSmallestEmpty() {
        assertThrows(IntegerSetException.class, () -> set1.smallest(), "Calling smallest on an empty set should throw an exception");
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        set1.add(1);
        assertTrue(set1.contains(1), "Set should contain the added element 1");
        assertEquals(1, set1.length(), "Set length should be 1 after adding an element");

        // Test adding duplicate
        set1.add(1);
        assertEquals(1, set1.length(), "Adding a duplicate should not increase set size");
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set1.add(1);
        set1.add(2);
        
        set1.remove(1);
        assertFalse(set1.contains(1), "Element should be removed from the set");
        assertEquals(1, set1.length(), "Set length should decrease after removing an element");
        
        // Test removing non-existent element
        set1.remove(3);
        assertEquals(1, set1.length(), "Removing non-existent element should not change set size");
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        
        set1.union(set2);
        assertTrue(set1.contains(1), "Union should contain element 1 from set1");
        assertTrue(set1.contains(2), "Union should contain element 2 from both sets");
        assertTrue(set1.contains(3), "Union should contain element 3 from set2");
        assertEquals(3, set1.length(), "Union should contain all unique elements from both sets");
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        
        set1.intersect(set2);
        assertFalse(set1.contains(1), "Intersect should not contain element 1 as it is not in both sets");
        assertTrue(set1.contains(2), "Intersect should contain common element 2");
        assertFalse(set1.contains(3), "Intersect should not contain element 3 as it is not in set1");
        assertEquals(1, set1.length(), "Intersect should contain only common elements");
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        
        set1.diff(set2);
        assertTrue(set1.contains(1), "Diff should retain element 1 as it is not in set2");
        assertFalse(set1.contains(2), "Diff should remove element 2 as it is in set2");
        assertFalse(set1.contains(3), "Diff should not contain element 3 as it was never in set1");
        assertEquals(1, set1.length(), "Diff should contain elements only in set1 and not in set2");
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        set1.add(1);
        set1.add(2);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        IntegerSet result = set2.complement(set1);
        assertFalse(result.contains(1), "Complement should not contain element 1 as it is in set1");
        assertFalse(result.contains(2), "Complement should not contain element 2 as it is in set1");
        assertTrue(result.contains(3), "Complement should contain element 3 as it is not in set1");
        assertTrue(result.contains(4), "Complement should contain element 4 as it is not in set1");
        assertEquals(2, result.length(), "Complement should contain elements only in universal set but not in set1");
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(set1.isEmpty(), "New set should be empty");
        
        set1.add(1);
        assertFalse(set1.isEmpty(), "Set should not be empty after adding an element");
        
        set1.clear();
        assertTrue(set1.isEmpty(), "Set should be empty after clear()");
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        assertEquals("[]", set1.toString(), "Empty set should be represented as []");
        
        set1.add(1);
        set1.add(2);
        assertEquals("[1, 2]", set1.toString(), "Set should be represented correctly with elements");
    }
}
