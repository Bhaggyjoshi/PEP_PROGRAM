package arrayfunctions;

import java.util.Scanner;

public class SpanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr  =  new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int res = Span(arr);
        System.out.print(res);
        
    }
    public static int Span(int[] array) {
        int ans = 0;
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        ans = max-min;
        return ans;
    }
}
