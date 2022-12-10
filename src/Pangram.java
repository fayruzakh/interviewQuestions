//https://www.youtube.com/watch?v=swSA4kvK5JU
//pangram is a sentence that contains every letter in th alphabet

public class Pangram {
    public static void main(String[] args) {

//storing as a variable
        String s = "The quick brown fox jumps over the lazy dog";

//initialize a boolean array in java
        //array of boolean to represent the each letter in the alphabet
        //26 letters in the alphabet//set to 26
        //mark the letter
        // mark whethere each latter is found
        //set to false right now
        //size of the alphabet 26
        //these are just setting variables
        boolean[] mark = new boolean[26];
        //create boolean pangram and set it equal to true
        //assumes that string is a pangram unti it sees that one of them is not marked
        boolean pangram = true;
        int index = 0;
//loop through the string and see what char we are bumping into
        //start at 0 , go until the length of the string
        //and go up by 1 each time i++
        //i is keeping track of every position in the string, starts at 0 which "T"
            for (int i = 0; i < s.length(); i++) {
                //print the char we bump into
                //char at to get the char of the position in the string
                // get the index of the alphabet by subtracting characters
                //s.charAt(i) -'A' we get numbers bc each char has a certain value
                //each ASCI  char has a certain value associated with it
                //take the difference it will tell you the position in the alphabet
                // 39 and etc bc capital A is diff from a lover case a
                //variable for position
                //declare char current for current variable and char at index i
                //string method that gets the char variable at a specific index for the string we have
                char cur = s.charAt(i);
                //characters have certain number values associated with them
                //treat the as num between A and Z or a or z
                //if the char bt capital A and capital Z do the subtraction with a capital A
//if the char at our current index is greater than capital A and less than or equal to capital Z
                if (cur >= 'A' && cur <= 'Z') {
                    //then we know its bt ascii characters capital A and capital Z
                    //create an index variable equal to char - 'A'
                    index = cur - 'A';
                    //if the char bt  a and capital z do the subtraction with a lowercase a
                    //to make sure that all the indexes are correct
//offset  location of a piece of data compared to another location
                    // index will be offset by lowercase ascii char name
                } else if (cur >= 'a' && cur <= 'z') {
                    index = cur - 'a';
                }
                //keep going through for each and every chart making true when it sees the letter
                // mark where we see it
                //marks to true when it sees the letter
                mark[index] = true;
            }
            //for loop through it
        //boolean inside the mark variable
        //empty mark starts at zero we will go up until the length of that one by one
            for(int i = 0; i < mark.length; i++) {
                //and print out whether each one is true or false , true for when the letter is found
                if(mark[i] ==false) {
                //create variable pangram equal to false
                    pangram = false;
                }
            }
            if(pangram) {
                System.out.println("it's a pangram");
            }else{
                System.out.println("it's not a pangram");
            }
    }
}


