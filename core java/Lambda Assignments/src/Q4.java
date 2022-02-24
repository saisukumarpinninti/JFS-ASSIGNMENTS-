import java.util.ArrayList;
import java.util.Arrays;
/*
Q4. Remove the words that have odd lengths from the list. HINT: Use one of the new methods from JDK 8. Use removeIf() method from Collection interface.

Description:-
Write a program using java 8 features which can remove the odd length words from the list */

public class Q4 {
    public static ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        employeeList.removeIf(s -> ((s.length())%2 != 0));
        return employeeList;
    }
    public static void main(String[] args) {
        ArrayList<String> employeeList = new ArrayList<> (Arrays.asList("Paddy OFurniture","lavender", "OliveYew", "Aida Bugg", "Maureen Biologist"));
        System.out.println(removeOddLength(employeeList));
    }
}

