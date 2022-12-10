
// Java program to reverse a string using Recursion
// is the technique of making a function call itself
//it is process in which a function or a method calls itself
//within the method we are calling the same method

/*
Sandy->ydnas
extract substring(a subset or part of another string) from a string
add the 1st character to the string
Step1: Andy(extract)+S(add the 1st character)
step2: ndy+a+s
step 3: dy+n+a+s
step 4: y+d+n+a+s

 */

///created a class
public class ReverseString
{
    public static void main(String[] args)
    {
        //string that we want to reverse
        String str = "Sandy";
        //
        System.out.println(recursiveString(str));
    }


    //creating a method named recursiveString
    private static String recursiveString(String str) {
        //a NULL means that there is no value, we're looking at a blank/empty cell
        if ((str == null) || (str.length() <= 1)){
            return str;
    }
        //calling the same method
        //string method substring ,begins with the index at a specified index and extends to the end of this string
        //removing 1st chart and return the rest
        //later add that first character to the end of the string
        //passing str.substring 1 through the recursive method
        //everytime we are calling we are only passing this string s.substring of one not the entire string

    return recursiveString(str.substring(1))+str.charAt(0);
    }



}



