/* 1) Write an application that accepts two numbers, divides the first number with the second
number and display the result. Hint: You need to handle ArithmeticException by raising
UnsupportedOperationException as a solution. */

import java.util.Scanner;
class divisonUOEp  {
    public static void solve() throws UnsupportedOperationException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter Dividend number:");
            int dividend = scanner.nextInt();
            System.out.println("Enter Divisor number:");
            int divisor = scanner.nextInt();
            if (divisor == 0) {
                throw new UnsupportedOperationException("Invalid operation for Division by Zero");
            }
            int result = dividend / divisor;
            System.out.println("Result is:" + result);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }
}
public class Q2 {

    public static void main(String[] args)  {
        divisonUOEp.solve();
    }

}

