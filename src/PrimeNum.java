import java.util.Scanner;
//https://www.youtube.com/watch?v=vwjhT_OTp1w
// prime num is only divisible 1 and itself

//ex 2 3 5 7 11 13 17
//https://www.youtube.com/watch?v=vwjhT_OTp1w
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int count=0;
        if(num>1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println( num+ " is a Prime Number: ");
            } else
            {
                System.out.println(  num+ " is not a Prime Number: ");
            }
        }
    }

    }








