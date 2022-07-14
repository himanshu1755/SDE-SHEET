package sheet.Day2;

import static practice.ReverseArray.rvereseArrayRecursion;
import static sheet.Day2.D2P1.printArray;

// Rotate matrix
public class D2P6 {
    public static void swap(int  a[][],int i,int j) {
        int temp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = temp;
    }
    public static void transpose(int a[][],int n) {
        for(int i=0;i<n;i++){
            for(int j= i+1;j<n;j++){
                swap(a,i,j);
            }
        }

    }
    public static void rotateMatrix(int a[][],int n){
        transpose(a,n);
        for(int i=0;i<n;i++){
            int arr[] = a[i];
            rvereseArrayRecursion(arr,0,n-1);
        }

    }
    public static void main(String[] args) {
        System.out.println("Before Rotate");
        int arr[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printArray(arr,3,3);
        rotateMatrix(arr,3);
        System.out.println("After Rotate");
        printArray(arr,3,3);
    }
}
