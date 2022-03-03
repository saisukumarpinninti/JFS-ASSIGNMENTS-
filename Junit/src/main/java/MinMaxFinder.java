/*Write a class called MinMaxFinder. Define a method in it called findMinMax() which
accepts an int array and returns new array of size 2, wherein the 0th index will have the
min value of the array and 1st index will have max value of the array. Perform Junit testing
of the method findMinMax with as many test cases you can think of (min 3 test cases)
E.g.
MinMaxFinder.findMinMax( new int[]{56, 34, 7,3, 54, 3, 34, 34, 53} ); should return a new
array with min and max values {3, 56} at 0th and 1st index respectively*/

import java.util.Arrays;
public class MinMaxFinder {
    public static int[] findMinMax(int[] arr) {
        int[] as = new int[2];
        as[0] = (Arrays.stream(arr).min().getAsInt());
        as[1] = (Arrays.stream(arr).max().getAsInt());
        return as;
    }
    //Modify the above method to return a single object representing min and max value of the
    //pass array. Define new sets of Junit Test cases of this modified method.

    public static String findMinMax2(int[] arr) {
        int min = (Arrays.stream(arr).min().getAsInt());
        int max = (Arrays.stream(arr).max().getAsInt());
        return "Min is "+ min+" Max is "+max;
    }
}
