import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
}
class check{
    @Test
    void run() {
        System.out.println("test-case");
    }
}
public class Q1 {
    public static void main(String[] args) {
        check a = new check();
        a.run();
    }
}
