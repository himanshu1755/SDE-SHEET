package practice;

//Replace every array element by multiplication of previous and next
// https://www.geeksforgeeks.org/replace-every-array-element-by-multiplication-of-previous-and-next/
//
//Input: arr[] = {2, 3, 4, 5, 6}
//        Output: arr[] = {6, 8, 15, 24, 30}

public class ArrayElementByMultiplication {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int size = arr.length;

        int pre = arr[0], curr;
        arr[0] = arr[0] * arr[1];
        for (int i = 1; i < size - 1; i++) {
            curr = arr[i];
            arr[i] = pre * arr[i + 1];
            pre = curr;
        }
        arr[size - 1] = arr[size - 1] * pre;

        for (int i = 1; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
