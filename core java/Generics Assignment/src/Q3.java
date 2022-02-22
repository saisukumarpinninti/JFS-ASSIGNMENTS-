import java.util.ArrayList;
import java.util.Collections;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello this is element2");
        arr.add("Hi");
        System.out.println("Before swapping the elements:");
        System.out.println(arr+"\n");
        Collections.swap(arr,0,1);
        System.out.println("After Swapping the elements: ");
        System.out.println(arr+"\n");
    }
}
