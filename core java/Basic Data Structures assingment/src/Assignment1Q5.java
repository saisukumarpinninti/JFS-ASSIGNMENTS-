import java.util.Scanner;

class TaxAmount{
    public static double calculateTaxAmount(int ctc){
        double tax = 0;
        if(ctc<=80000){
            tax = 0;
        }
        else if(ctc>=181001 && ctc<=300000){
            tax = (ctc/100)*10;
        }
        else if(ctc>=300001 && ctc<=500000){
            tax = (ctc/100)*20;
        }
        else if(ctc>=500001&& ctc<=1000000){
            tax = (ctc/100)*30;
        }
        return tax;
    }
}
public class Assignment1Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter Your Ctc");
        int ctc = sc.nextInt();
        System.out.print("your income tax is :"+TaxAmount.calculateTaxAmount(ctc));
    }
}
