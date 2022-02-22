import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface info{
    int AuthorID();
    String Author() default"None";
    String Supervisor() default"None";
    String Date();
    String Time();
    float Version();
    String Description() default"NA";
}
@info(AuthorID=221,Date="21-02-2022",Time="21:31",Version=221)

class developer{
    int AuthorID;
    String Author ;
    String Supervisor ;
    String Date;
    String Time;
    float Version;
    String Description;
    public developer(int AuthorID, String Date, String Time, float Version) {
        this.AuthorID = AuthorID;
        this.Date = Date;
        this.Time = Time;
        this.Version = Version;
    }
    String dev() {
       return  "HI";
    }
}
public class Q2 {
    public static void main(String[] args) {
        developer sai = new developer(20,"21-02-2022","2.30",20);
        sai.dev();
        Class a = sai.getClass();
        java.lang.annotation.Annotation p = a.getAnnotation(info.class);
        info i = (info)p;
        System.out.println(i);

    }
}