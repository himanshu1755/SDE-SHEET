package sheet.Day2;

// Pascal Triangle

import java.util.Scanner;

public class D2P2 {

    public static void pascalTriangle(int arr[][],int n) {

        for (int line = 0; line < n; line++)
        {
            for (int i = 0; i <= line; i++)
            {
                if (line == i || i == 0)
                    arr[line][i] = 1;
                else
                    arr[line][i] = arr[line-1][i-1] + arr[line-1][i];
                System.out.print(arr[line][i] + " ");
            }
            System.out.println("");

        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the row");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[][]= new int[n][n];
        pascalTriangle(arr,n);
    }
}
