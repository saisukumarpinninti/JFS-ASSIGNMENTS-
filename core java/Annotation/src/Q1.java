import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
    String Result();
}
class check
{
    @Test(Result = "1")
    public void run()
    {
        System.out.println("test-case");
    }
}
public class Q1 {
    public static void main(String[] args) throws NoSuchMethodException {
        check a = new check();
        Method m1 = a.getClass().getMethod("run");
        Test r = m1.getAnnotation(Test.class);
        System.out.println("value is: "+r.Result());
    }
    }

