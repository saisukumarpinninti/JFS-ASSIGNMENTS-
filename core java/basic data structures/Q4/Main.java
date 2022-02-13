import java.util.Scanner;

class ResultDeclaration{
    public static int  checkP(double j){
        if (j>=60){
            return 1;
        }
        else return 0;
    }
    public static String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        double count = 0 ;
        double   a = checkP(subject1Marks);
        double   b = checkP(subject2Marks);
        double   c = checkP(subject3Marks);
        count = a+b+c;
        if(count>2){
            return ("Passed");
        }
        else if(count==2){
            return ("Promoted");
        }
        else return ("failed");
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter Subject1 marks");
        double subject1marks = sc.nextDouble();
        System.out.print("Please enter Subject2 marks");
        double subject2marks = sc.nextDouble();
        System.out.print("Please enter Subject3 marks");
        double subject3marks = sc.nextDouble();
        System.out.print(ResultDeclaration.declareResults(subject1marks,subject2marks,subject3marks));
    }
}




