package practice;


// Maximum product of a triplet (subsequence of size 3) in array

// https://www.geeksforgeeks.org/find-maximum-product-of-a-triplet-in-array/

public class MaximumProductOfTriplet {

    static int maxProduct(int[] arr, int n) {
        if (n < 3) return -1;

        int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;

        int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {

            if (arr[i] > maxA) {
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            } else if (arr[i] > maxB) {
                maxC = maxB;
                maxB = arr[i];
            } else if (arr[i] > maxC) maxC = arr[i];

            if (arr[i] < minA) {
                minB = minA;
                minA = arr[i];
            } else if (arr[i] < minB) minB = arr[i];
        }
        return Math.max(minA * minB * maxA, maxA * maxB * maxC);
    }

    public static void main(String[] args) {
        int[] arr = {1, -4, 3, -6, 7, 0};
        int n = arr.length;
        int max = maxProduct(arr, n);
        if (max == -1) System.out.print("No Triplet Exists");
        else System.out.print("Maximum product is " + max);
    }
}
