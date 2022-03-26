package arrayfunctions;

import java.util.Scanner;

public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        brokenEconomy(arr,data);
        
    }
    
    public static void brokenEconomy(int[] arr, int item) {
        int left = 0;
        int right = arr.length-1;
        int ceil = -1;
        int floor = -1;

        while (left<=right) {
            int mid = left+(right-left)/2;
            if (arr[mid] == item) {
                ceil = item;
                floor = item;
                break;
                
            }else if (arr[mid]<item) {
                floor = arr[mid];
                left = mid+1;
               
            }
            else{
                ceil = arr[mid];
                right = mid-1;
                
            }
        }
        System.out.println(ceil + " "+ floor);
       

    }
}
