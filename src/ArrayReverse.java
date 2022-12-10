import java.util.Scanner;

//https://www.youtube.com/watch?v=J7VeCZgI_Pc
//arr={1,7,8,9}
//reverse={9,8,7,1}
public class ArrayReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();

        //declare  an array
        int arr[] = new int[n];

        System.out.println("enter an array values ");

        //input array values
        // loop will break when  n=i
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//declare variables
        int temp;
        int start = 0;
        //last variable in the arr
        int end = n - 1;
// 1, 2, 3, 4, 5
        while (start < end) {
            // if 0 is less than 4 then condition is true
            // if less than end start the values
            // temp has assigned the arr of start
            temp = arr[start];
            //arr start index when hava assigned arr end
            arr[start] = arr[end];
            // 5 in 1 and end in temp
            arr[end] = temp;
//increment points to 2
            start++;
            //decrement points to 3
            end--;

        }
        System.out.println("An array after reversing ");

        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }
}






