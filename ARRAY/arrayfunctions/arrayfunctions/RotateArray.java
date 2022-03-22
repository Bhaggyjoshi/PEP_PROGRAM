package arrayfunctions;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // int k = sc.nextInt();
        // int [] res = Rotate(arr, k);
        sc.close();
    }

    // public static int[] Rotate(int[] a, int k) {
        
    // }

    public static int[] Reverse(int[] arr) {
        int left  = 0;
        int right = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        return arr;
    }
}
