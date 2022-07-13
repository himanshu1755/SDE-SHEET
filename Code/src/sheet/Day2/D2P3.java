package sheet.Day2;

import java.util.Scanner;

//Next Permutation
//13542 ----> 14235

public class D2P3 {

    public static void nextPermutation(int[] a, int n) {
        if (n <= 1 || a == null) return;
        int i = n - 2;
        while (i >= 0 && a[i] >= a[i + 1]) i--;

        if (i >= 0) {
            System.out.println("i = " + i);
            int j = n - 1;
            while (a[i] >= a[j]) j--;
            System.out.println("j = " + j);
            swap(a, i, j);
        }
        reverse(a, i + 1, n - 1);
    }

    public static void reverse(int[] a, int i, int j) {
        while (i < j) {
            swap(a, i++, j--);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printArray(int arr[], int n) {

        for (int j = 0; j < n; j++)
            System.out.print(arr[j] + " ");

    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        nextPermutation(arr, n);
        printArray(arr, n);
    }
}
