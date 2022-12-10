public class PracticeRuns {
  public static String recursive(String str){
  if (str ==null||str.length()<=1)
  return str;
  return recursive(str.substring(1))+str.charAt(0);
  }

    public static void main(String[] args) {
      String str="Fayruza";
      //ayruza + F
        // yruza +a+ F
        //ruza +y +A +F

        /*


        System.out.println("enter a string :" );
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
          */

        System.out.println(recursive(str));
    }
}
