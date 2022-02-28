/*Write a program to calculate the Simple Interest with minimal code using features of
        Java 11.
        Hint: Use the concept of functional interface and Local variable syntax for lambda
        parameters

 */
@FunctionalInterface
interface Func<T1,T2,T3,R> {
     R apply(T1 t1, T2 t2, T3 t3);
}
public class Q1
{
    public static void main (String[] args)
    {
        Func <Integer,Integer,Integer,Integer>  i = ( var p,var j,var r) -> (p*j*r);
        System.out.println(i.apply(10,20,50));
    }
}