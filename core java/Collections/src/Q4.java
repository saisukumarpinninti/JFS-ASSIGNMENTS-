import java.util.LinkedList;
import java.util.List;
public class Q4 {
    public static void main(String[] args) {
        List<String> date = new LinkedList<>();
        date.add("14-02-2030");
        date.add("15-02-2021");
        date.add("3-02-2002");
        date.add("9-02-2000");
        date.add("23-02-2004");
        date.add("13-02-2008");
        for(String it : date)
        {
            String[] strings = it.split("-");
            if((int)Integer.parseInt(strings[2])%4==0)
            {
                if((int)Integer.parseInt(strings[2])%100==0)
                {
                    if((int)Integer.parseInt(strings[2])%400==0)
                        System.out.println("Your Date of Birth is "+it+" and it was Leap Year");
                    else {
                        System.out.println("Your Date of Birth is "+it+" and it was not Leap Year");
                    }
                }
                else {
                    System.out.println("Your Date of Birth is "+it+" and it was Leap Year");
                }
            }
            else {
                System.out.println("Your Date of Birth is "+it+" and it was not Leap Year");
            }
        }
    }
}