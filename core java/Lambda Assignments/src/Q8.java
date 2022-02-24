import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

//Q8. Create a new thread that prints the numbers from the list. Use class Thread & interface Consumer.
//
//Description:-
//
//Write a java program which will print the list of number using Thread and interface Consumer.
public class Q8 {
    public static void main(String[] args) {
        ArrayList <Integer> j = new ArrayList<>(Arrays.asList(6574 ,9326 ,5760 ,9112 ,6401 ,7189, 2169, 9886 ,9392, 8217));
        Consumer <ArrayList<Integer>> i = (k) -> System.out.println(k);
        i.accept(j);
        new Thread(() -> i.accept(j)).start();  //lambda expression for new thread.
    }
}
