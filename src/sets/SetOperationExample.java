package sets;

import java.util.HashSet;
import java.util.Set;

public class SetOperationExample {
    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        
        set1.add(7);
        set1.add(3);
        set1.add(9);

        set2.add(7);
        set2.add(4);
        set2.add(2);

        set3.add(9);
        set3.add(4);
        set3.add(4);

        // Perform set difference
        Set<Integer> differenceResult = new HashSet<>(set1);
        differenceResult.removeAll(set2);

        // Perform set intersection (using & as the symbol)
        Set<Integer> intersectionResult = new HashSet<>(set1);
        intersectionResult.retainAll(set2);

        // Perform set union (using + as the symbol)
        Set<Integer> unionResult = new HashSet<>(set1);
        unionResult.addAll(set3);

        // Print the results
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Set 3: " + set3);

        System.out.println("Set Difference: " + differenceResult);
        System.out.println("Set Intersection: " + intersectionResult);
        System.out.println("Set Union: " + unionResult);
    }
}