package org.howard.edu.lsp.assignment5;

public class Driver {
    public static void main(String[] args) {
        // Creating first set
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1.toString()); // should print [1, 2, 3]

        // Smallest and largest in set1
        System.out.println("Smallest in Set1: " + set1.smallest()); // should print 1
        System.out.println("Largest in Set1: " + set1.largest());   // should print 3

        // Creating second set
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set2: " + set2.toString()); // should print [3, 4, 5]

        // Union of set1 and set2
        System.out.println("\nPerforming Union of Set1 and Set2");
        set1.union(set2);
        System.out.println("Result of union: " + set1.toString()); // should print [1, 2, 3, 4, 5]

        // Intersection of set1 and set2 (after union)
        System.out.println("\nPerforming Intersection of Set1 and Set2");
        set1.intersect(set2);
        System.out.println("Intersection of Set1 and Set2: " + set1.toString()); // should print [3, 4, 5]

        // Checking if Set1 and Set2 contain 3
        System.out.println("\nChecking if Set1 contains 3: " + set1.contains(3)); // should print true
        System.out.println("Checking if Set2 contains 3: " + set2.contains(3)); // should print true

        // Difference between set1 and set2
        System.out.println("\nPerforming Difference of Set1 and Set2");
        set1.diff(set2);
        System.out.println("Difference of Set1 and Set2: " + set1.toString()); // should be []

        // Check if set1 and set2 are empty
        System.out.println("\nIs Set1 empty? " + set1.isEmpty()); // should print true
        System.out.println("Is Set2 empty? " + set2.isEmpty()); // should print false

        // Clearing set1
        System.out.println("\nClearing Set1");
        set1.clear();
        System.out.println("Set1 after clearing: " + set1.toString()); // should print []
        System.out.println("Is Set1 empty after clearing? " + set1.isEmpty()); // should print true

        // Additional tests with set3 and set4
        System.out.println("\nCreating additional sets for testing");
        IntegerSet set3 = new IntegerSet();
        set3.add(10);
        set3.add(20);
        set3.add(30);
        System.out.println("Set3: " + set3.toString()); // should print [10, 20, 30]

        System.out.println("Largest in Set3: " + set3.largest()); // should print 30
        System.out.println("Smallest in Set3: " + set3.smallest()); // should print 10

        IntegerSet set4 = new IntegerSet();
        set4.add(15);
        set4.add(20);
        set4.add(25);
        System.out.println("Set4: " + set4.toString()); // should print [15, 20, 25]

        // Union and intersection of set3 and set4
        System.out.println("\nPerforming Union of Set3 and Set4");
        set3.union(set4);
        System.out.println("Result of union: " + set3.toString()); // [10, 20, 30, 15, 25]

        System.out.println("\nPerforming Intersection of Set3 and Set4");
        set3.intersect(set4);
        System.out.println("Intersection of Set3 and Set4: " + set3.toString()); // [20, 15, 25]

        // Difference between set3 and set4
        System.out.println("\nPerforming Difference of Set3 and Set4");
        set3.diff(set4);
        System.out.println("Difference of Set3 and Set4: " + set3.toString()); // should be []

        // Adding and removing elements in set4
        System.out.println("\nAdding 100 to Set4");
        set4.add(100);
        System.out.println("Set4 after adding 100: " + set4.toString()); // [15, 20, 25, 100]

        System.out.println("\nRemoving 20 from Set4");
        set4.remove(20);
        System.out.println("Set4 after removing 20: " + set4.toString()); // [15, 25, 100]

        System.out.println("Does Set4 contain 25? " + set4.contains(25)); // should print true
        System.out.println("Does Set4 contain 50? " + set4.contains(50)); // should print false
    }
}

