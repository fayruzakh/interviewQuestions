import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {

        //Counter variable to store the count of vowels and consonant    
        int vCount = 0;

        //Declare a string
        System.out.println("Enter a string: ");
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();

        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                //Increments the vowel counter    
                vCount++;
            }


        }
        System.out.println("Number of vowels: " + vCount);

    }
}   
