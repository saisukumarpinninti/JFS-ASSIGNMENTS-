import java.util.Scanner;
class ArmstrongOrNot {
    public static boolean armstrongCheck(int num) {
        int b,c,d=0 , temp ;
        temp = num ;
        while(temp>0){
            b = temp %10 ;
            c = b * b * b ;
            d = c + d ;
            temp = temp /10;
        }
        return d == num;
    }
}
public class Main
{
	public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number-");
        int num=sc.nextInt();
        if(ArmstrongOrNot.armstrongCheck(num))
            System.out.print("the given number "+num+ " is an arm strong number");
        else System.out.print("the given number "+num+ " is not an arm strong number");
    }
	
}


