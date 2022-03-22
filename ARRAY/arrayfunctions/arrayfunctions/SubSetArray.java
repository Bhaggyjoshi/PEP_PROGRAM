package arrayfunctions;

import java.util.Scanner;

public class SubSetArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void Subset(int[] arr) {
        int tns = (int)Math.pow(2, arr.length);
        for (int i = 0; i < tns; i++) {
            int bn = dtob(i);
            int div = (int)Math.pow(10, arr.length-1);
            for (int j = 0; j < arr.length; j++) {
                int q = bn / div;
                int r = bn / div;
                if(q==0){
                    System.out.println("-\t");
                }
                else{
                    System.out.println(arr[j] +"");
                }
                bn = r;
                div /= 10;
            }
        }
    }
    public static int dtob(int n ) {
        int ans = 0;
        int power = 1;

        while (n!=0) {
            int r = n%2;
            n/=2;
            ans += (r*power);
            power *= 10;
        }
        return ans;
    }
}
