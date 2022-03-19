package arrayfunctions;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Reverse(arr);
    }

    public static void Reverse(int[] a) {
        int left = 0;
        int right = a.length-1;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
