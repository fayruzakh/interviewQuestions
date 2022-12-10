//https://www.youtube.com/watch?v=QqX1ExNAev0 iterative approach
import java.util.Scanner;
//a series of numbers in which each num (fibonacci number)
// is the sum of the two preceding numbers
//0 1 1 2 3 5 8 13
// n1=1 n2=1 sum(n1+n2)
/*
Java program to calculate and print Fibonacci number using both recursion
* and Iteration.
 * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
 * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 */
//www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html#ixzz7mvnCoaW9

public class Fibonacci {
    public static void main(String args[]) {
        //input to print Fibonacci series up to how many numbers
        System.out.println("Enter number up to which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci series up to " + number + " numbers : ");
        //printing Fibonacci series up to number
        // 0 1 2 3 5 8 13 21 34 55
        //i stands for 1 number
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci2(i) + " ");
        }
    }


    // Java program for Fibonacci number using recursion

    public static int fibonacci1(int number) {
        if (number == 1|| number == 2) {
            return 1;
        }

        // 1 1 2 3 5 8 13 21 34 55
        // 1st 2nd 3rd 4th 5th 6th 7th 8th 9th digit of the series
        //ex: 6th digit is 8, 8 = 4th+5th digit=6th digit
        // 10th-1=9th + 10th-2=8th  9th+8th=10th digit --> 21+34=55


        return fibonacci1(number - 1) + fibonacci1(number - 2); //tail recursion

    }


    //Java program to calculate Fibonacci number using loop or Iteration
    public static int fibonacci2(int number) {
        if (number == 1|| number == 2) {
            return 1;
        }

        int n1 = 1, n2 = 1, sum = 1;
        //start i value from 2 bc n1 is set as o , n2 =1 next number is 2
        //start from 2
        for (int i = 3; i <= number; i++) {
            //Fibonacci number is sum of previous two Fibonacci number
            //variable sum
            sum = n1 + n2; //0+1=1
            // 1  1  2   3 5 8 13 21 34 55
            // n1 n2 sum
            n1 = n2; //1 n2 store into -->n1
            n2 = sum; // sum store into --> n2
        }
        return sum; //Fibonacci number
    }
}







