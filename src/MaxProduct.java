import java.util.Arrays;
import java.util.Comparator;

public class MaxProduct {
//Sort the input integer array in descending order
//
//multiply first and second element of the array, the product will be maximum.
    long productMinMax(Integer[] array) {
        Arrays.sort(array, Comparator.reverseOrder());
        int maxNum = array[0];
        int sdMaxNum = array[1];
        System.out.println("maxNum = " + maxNum);
        System.out.println("sdMaxNum = " + sdMaxNum);
        return sdMaxNum * maxNum;
    }

    public static void main(String[] args) {
        long product = new MaxProduct().productMinMax(new Integer[]{10, 11, 13, 9, 2, 4});
        System.out.println("Product of min and max element = " + product);
    }
}





