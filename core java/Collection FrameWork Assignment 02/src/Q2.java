//Prove that HashSet is unordered & LinkedHashSet is ordered.
import java.util.HashSet;
import java.util.LinkedHashSet;


class Q2 {

    public static void main(String[] args)
     {
         // initializing a new hash set and linked hash set
        LinkedHashSet<Integer> LSet = new LinkedHashSet<>();
        HashSet<Integer> HSet = new HashSet<>();
         // adding same elements in the same order to hash set and linked hash set
         LSet.add(1);
        LSet.add(3);
        LSet.add(2);
        HSet.add(1);
        HSet.add(3);
        HSet.add(2);
        System.out.println(HSet);
        System.out.println(LSet);
        // Printing those hashset and Linked hashset .
         // the output of hashset will be sorted and not in the insertion order
         // the output of Linked hashset will be not sorted and  in the insertion order
    }

}