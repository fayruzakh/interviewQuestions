import java.util.Arrays;

//https://www.youtube.com/watch?v=OZzL3GBMnJ0
//a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
public class StringsAnagrams {

        public static void main(String[] args) {

            String str = "army ";
            String str2 ="mary";
// create 2 char arr
            char[] arr = str.toLowerCase().toCharArray();
            char[] arr2= str2.toLowerCase().toCharArray();
//sort them
            Arrays.sort(arr);
            Arrays.sort(arr2);
//compare them
            //pass the arr
            if(Arrays.equals(arr,arr2)){
                System.out.println("they are anagram");
            } else{
                System.out.println("they are not anagram");
            }

        }

    }

