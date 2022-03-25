package arrayfunctions;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int item = sc.nextInt();
        int ans = binary(arr, item);
        System.out.println(ans);
        sc.close();
    }
    public static int binary(int[] arr , int data) {
        int low = 0;
        int high = arr.length;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if(arr[mid] == data){
                return mid;

            }else if (arr[mid] < data) {
                low = mid+1;
            }
            else{
                high = mid-1; 
            }
        }
        return -1;
    }
}
