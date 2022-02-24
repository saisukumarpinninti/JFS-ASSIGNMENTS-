import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/*
Q5. Create a string that consists of the first letter of each word in the list of Strings provided.
HINT: Use Consumer interface & a String Builder to construct the result.

Description:
Write a java program using StringBuilder and Consumer interface which will return a string.
The returned string should consist of the first let of each word in the list of words.
 */

public class Q5 {
    public static String processWords(List<String> list) {
        StringBuilder result = new StringBuilder("");
        for(String e :list) {
            Consumer <StringBuilder> sb = (p) -> result.append(p.charAt(0));;
            sb.accept(new StringBuilder(e));
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
            System.out.println(processWords(list));
    }
}
