import java.util.Scanner;

//a palindrome num is a num
// that remains the same when its digits are reversed
// ex 16461
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt(); //1234 --> 4321
        //compare the rev num to original num by creating a variable and setting it equal to num
        //variable will store the original number
        int orgNum=num;

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
        if(orgNum==rev){
            System.out.println(orgNum + " is a palindrome number " );
        }else{
            System.out.println(orgNum + " is not a palindrome number " );
        }
    }
}
