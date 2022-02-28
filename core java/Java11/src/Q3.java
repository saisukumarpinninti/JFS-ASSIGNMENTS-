import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Q3 {
    public static void main(String args[]) {
        String r  = "A quick brown fox jumps over the lazy dog";
        ArrayList <String> list = (ArrayList<String>) Stream.of(r.split(" ",0)).collect(toList());
        String[]  s =  list.stream().toArray(String[] :: new);
        System.out.println(Arrays.toString(s));

    }

}
