package Array_Functions;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ele = sc.nextInt();
        int res = Find(arr, ele);
        System.out.println(res);
    }
    public static int Find(int[] arr, int x) {
        int result =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                result = i;
                
            }
        }
        return result;
        
    }
}
