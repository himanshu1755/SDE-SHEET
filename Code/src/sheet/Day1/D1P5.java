package sheet.Day1;//Kadane-Algo

import java.util.Scanner;

public class D1P5 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<8;i++){
            arr[i] = sc.nextInt();
        }

        int sum =0,max=arr[0];
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            if(sum>max) max=sum;
            if(sum<0) sum=0;

        }
        System.out.println("max sum is -- " +max);

    }
}
