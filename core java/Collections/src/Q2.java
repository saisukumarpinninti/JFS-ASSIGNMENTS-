import java.util.HashSet;
import java.util.Set;
public class Q2 {
    public static void main(String[] args) {
        Set<String> objects = new HashSet<>();
        objects.add("1");
        objects.add("2");
        objects.add("3");
        objects.add("4");
        objects.add("5");
        objects.add("6");
        objects.add("7");
        objects.add("8");              // added the object first here
        objects.add("9");
        objects.add("10");
        System.out.println("this is before adding of the duplicate objects ");
        System.out.println(objects);
        System.out.println("\n");
        objects.add("8");                  // adding a duplicate product object "8"
        System.out.println("this is after adding of the duplicate objects ");
        System.out.println(objects);
    }
}