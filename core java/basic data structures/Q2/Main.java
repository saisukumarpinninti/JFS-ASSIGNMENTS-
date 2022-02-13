import java.util.Scanner;
class ArmstrongNot {
    public static boolean armstrongCheck(int num) {
        int b, c, d = 0, temp;
        temp = num;
        while (temp > 0) {
            b = temp % 10;
            c = b * b * b;
            d = c + d;
            temp = temp / 10;
        }
        return d == num;
    }
}
class ArmstrongNumBetweenRange{
    public static int[] armstrongNumbersInRange(int min, int max) {
        for (int i = min; i <= max;i++){
            if (ArmstrongNot.armstrongCheck(i)) {
                System.out.print(i+" ");
            }
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number-");
        int min = sc.nextInt();
        System.out.print("Enter the number-");
        int max = sc.nextInt();
        ArmstrongNumBetweenRange.armstrongNumbersInRange(min,max);
    }
}
