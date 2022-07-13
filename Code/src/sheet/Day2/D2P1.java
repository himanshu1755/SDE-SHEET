package sheet.Day2;
//if element is zero ,set entire row and column to zero
public class D2P1 {
    public static void modifyArray(int arr[][],int m,int n){
        int col= 1;
        for(int i=0;i<m;i++){
            if(arr[i][0] == 0) col=0;
            for(int j=1;j<n;j++){

                if(arr[i][j] == 0)  { arr[i][0] =arr[0][j] = 0;}

            }
        }
        //modify
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(arr[i][0] == 0 || arr[0][j] == 0)  { arr[i][j] = 0;}
            }
            if(col == 0) arr[i][0] = 0;
        }
    }
    public static void printArray(int arr[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] =new int[][] {{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,0,0,1}};
        System.out.println("Before");
        printArray(arr,4,4);
        modifyArray(arr,4,4);
        System.out.println("After");
        printArray(arr,4,4);

    }
}
