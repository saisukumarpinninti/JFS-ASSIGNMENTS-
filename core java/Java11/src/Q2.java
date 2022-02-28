import java.util.ArrayList;

///Java 11 supports var keyword for variable declarations. List the scenarios where var
// keyword cannot be used for such variable declarations. Give reason in support of your answer for each scenario.
//
// 1. var cannot be used in an instance and global variable declaration.
//  2.  var cannot be used as a Generic type and with the generic type.
//  3.  var cannot be used Without initialization. and with lambda expression
//  4 . it cannot be used for method parameters and return type.

public class Q2 {
    //var x = 50;   // - 1
    public static void main(String[] args)
    {
        /*
         var<var> hs = new Arraylist<>(); // - 2
         var<Integer> hs2 = new Arraylist<>(); // - 2
         var x; //  - 3
         var l1 = (i,j) -> (i/j) ; //  - 3
        */
        System.out.println(7);
    }
    //var demo(var a){return  ("Hello")}; // -4
}
