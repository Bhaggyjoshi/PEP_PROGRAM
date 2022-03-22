package arrayfunctions;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scn  =  new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt(); 
        }
        Bar(arr);
        scn.close();
    }

    public static void Bar(int[] ans) {
        int max = ans[0];

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] > max) {
                max = ans[i];
            }
        }

        for (int i = max; i >=1; i--) {
            for (int j = 0; j < ans.length; j++) {
                if (ans[j] >= i) {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
