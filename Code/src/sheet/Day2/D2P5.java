package sheet.Day2;

import static sheet.Day2.D2P3.printArray;

// Stock buy and Sell
public class D2P5 {

    public static int StockBuyAndSell(int[] arr, int n) {

        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] - min > maxProfit) maxProfit = arr[i] - min;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println("Input Array");
        printArray(arr, 6);

        System.out.print("\nMax Profit is -- " + StockBuyAndSell(arr, 6));


    }
}
