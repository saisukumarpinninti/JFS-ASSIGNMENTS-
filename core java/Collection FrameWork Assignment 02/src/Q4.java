import java.time.LocalDate;
import java.util.HashMap;
class date{
    LocalDate date ;

    public date(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "date{" +
                "date=" + date +
                '}';
    }
}
public class Q4 {
    public static void main(String[] args) {
        HashMap<date, String> s = new HashMap<>();
        s.put( new date(LocalDate.of( 2026 , 1 , 23 )),"sai");
        s.put( new date(LocalDate.of( 2023 , 4 , 25 )),"sourish");
        s.put( new date(LocalDate.of( 2026 , 3 , 28 )),"satish");
        System.out.println(s);
    }
}
