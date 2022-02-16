/* 1) Write an application that accepts two numbers, divides the first number with the second
number and display the result. Hint: You need to handle ArithmeticException which is
thrown when there is an attempt to divide a number by zero. */

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter Dividend number:");
            int dividend = scanner.nextInt();
            System.out.println("Enter Divisor number:");
            int divisor = scanner.nextInt();
            int result = dividend/divisor;
            System.out.println("Result is:"+result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            if(scanner != null)
                scanner.close();
        }

    }

}

