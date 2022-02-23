package PlusMinus;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        NumberFormat ds = DecimalFormat.getNumberInstance();
        ds.setMinimumFractionDigits(6);
        float size = arr.size();
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for (int i : arr) {
            if (i > 0) {
                ++positive;
            } else if (i < 0){
                ++negative;
            } else {
                ++zeros;
            }
        
        }
        float pos = (positive/size); 
        float neg = (negative/size);
        float zer = (zeros/size);
        System.out.println(ds.format(pos));
        System.out.println(ds.format(neg));
        System.out.println(ds.format(zer));
    }

}