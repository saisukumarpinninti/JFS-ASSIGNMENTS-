import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Q7 {
    public static String convertKeyValueToString(HashMap<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        Consumer <Map.Entry>  c=(i)-> sb.append(i.getKey()).append(i.getValue());
        Set< Map.Entry <String, Integer> > s  = map.entrySet();
        s.forEach(c);
        return sb.toString();
    }
    public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<>();
        m.put("Sukumar",11);
        m.put("ganesh",12);
        m.put("Manikanta",13);
        Consumer k = (i) -> System.out.println(convertKeyValueToString(m));
        k.accept(m);
    }

}