package miniMaxSum;

import java.util.List;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        int min = arr.get(0);
        int max = arr.get(0);
        long soma = 0;
        for (int n : arr) {
            soma += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println((soma - max) + " " + (soma - min));
    }

}