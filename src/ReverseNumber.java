//https://www.youtube.com/watch?v=m0lMpNIG6vU

import java.util.Scanner;

public class ReverseNumber {


    // Function to reverse the number

// variable int type


    // Driver Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt(); //1234 --> 4321

        int rev = 0; // reversed number

        while (num != 0) {
            // rev =0 0*10 --> 0
            // 1234 / 10 will give you 4 as an output
            // 1234%10 --> 4 last digit
            // (0*10)+(1234%10)  0+4=4 --> rev=4

            rev = rev * 10 + num % 10; //0+1234%10=4 //40 +3=43  430+2=432 4320+1=4321

            // after /10 it turns from 1234--> 123, 4 is eliminated

            num = num / 10; //1234/10=123.4  //123/10=12.3 //12/10=1.2  //1/10=0.1
        }
            System.out.println("Reversed Number is " + rev);
        }
    }







