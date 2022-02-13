import java.util.Scanner;

class TaxAmount{
    public static double calculateTaxAmount(int ctc){
        if(ctc>0 && ctc<80000){
            return 0;
        }
        else if(ctc>181001 && ctc<300000){
            return 10;
        }
        else if(ctc>300001 && ctc<500000){
            return 20;
        }
        else if(ctc> 500001&& ctc<1000000){
            return 30;
        }
        return 0;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter Your Ctc");
        int ctc = sc.nextInt();
        System.out.print(TaxAmount.calculateTaxAmount(ctc)+"%");
    }
}
