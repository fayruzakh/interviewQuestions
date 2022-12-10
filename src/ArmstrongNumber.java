/* 153 -> 1 5 3
 1*1*1  5*5*5   3*3*3
  1 +    125  + 27
  153

  370 -> 3*3*3 + 7*7*7 +0 =370
  both are armstrong numbers 370 & 153


 */


import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        // will be doing operations on the temp variable
        int temp =num;
        //isolate 3 from 153 the last digit
        int r, sum=0;
        while(num>0) {
            r = num % 10; // gives 3
            num = num / 10; // gives 15.3 or just 15
            sum = sum + r * r * r;
        }
        if(temp==sum) {
            System.out.println("its an Armstrong number");
        }else{
            System.out.println("its not an Armstrong number");
        }



    }

}
