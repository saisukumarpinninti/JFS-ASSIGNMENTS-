import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        HashMap <Integer, Double> hMap = new HashMap<Integer, Double>();
        for(int i=0;i<10;i++)
        {
            int k = i+1;
            double v = Math.random();
            hMap.put(k, v);
        }
        System.out.println(hMap);
    }
}