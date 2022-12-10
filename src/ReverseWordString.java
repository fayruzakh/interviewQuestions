//https://www.youtube.com/watch?v=CSk6sB0c_CM
public class ReverseWordString {
            public static void main(String[] args) {

                String str = "My Name is Anil";
                // method breaks a given string around matches of the given regular expression.

                String a[] = str.split(" ");

                for(int i =0;i<a.length;i++){


                    System.out.print(a[i]+ " ");

                }

                System.out.println("");
                for(int i =a.length-1;i>=0;i--){


                    System.out.print(a[i]+ " ");

                }
            }
}

