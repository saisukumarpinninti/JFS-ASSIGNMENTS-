import java.util.Scanner;
class Student {

    public static int[] marksentry() {
        int[] student = new int[4];
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 3) {
            System.out.println("please enter the Student marks for subject "+i );
            int temp = sc.nextInt();
            student[i] = temp;
            i++;
        }
        return student;
    }
    public static int Total(int[] marks){
        int total = 0;
        int i;
        for (i = 0; i < marks.length; i++)
            total += marks[i];
        return total;
    }

}

public class Main {
    public static  int[] subjecta = new int[4];
    public static  int[] subjectb = new int[4];
    public static  int[] subjectc = new int[4];
    public static  int[] student1 = new int[4];
    public static  int[] student2 = new int[4];
    public static  int[] student3 = new int[4];
    public static void main(String[] args) {
        student1 = Student.marksentry();
        student2 = Student.marksentry();
        student3 = Student.marksentry();
        subjecta = new int[]{student1[1], student2[1], student3[1]};
        subjectb = new int[]{student1[2], student2[2], student3[2]};
        subjectc = new int[]{student1[3], student2[3], student3[3]};
        int stu1tot = (Student.Total(student1));
        int stu2tot = (Student.Total(student2));
        int stu3tot = (Student.Total(student3));
        int allsubtot = (stu1tot+stu2tot+stu3tot);
        int subatot = (Student.Total(subjecta));
        int subbtot = (Student.Total(subjectb));
        int subctot = (Student.Total(subjectc));
        int subaavg = (subatot)/3;
        int subbavg = (subbtot)/3;
        int subcavg = (subctot)/3;
        int allavg  = (allsubtot)/3;

        System.out.println("total "+ allsubtot);
        System.out.println("allavg"+ allavg);
        System.out.println("subatot"+ subatot);
        System.out.println("subaavg"+ subaavg);
        System.out.println("subbtot"+ subbtot);
        System.out.println("subbavg"+ subbavg);
        System.out.println("subctot"+ subctot);
        System.out.println("subcavg"+ subcavg);

    }
}

