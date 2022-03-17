import java.util.Scanner;

public class DifferenceOfArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n1];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        int[] ans  = new int[n2];

        int i = a1.length-1;
        int j = a2.length-1;
        int k = ans.length-1;
        int borrow = 0;
        while (k >= 0) {
            int diff = (a2[j]-borrow);

            if(i >= 0){
                diff -= a1[i];
            }
            if(diff<0){
                diff += 10;
                borrow =1;

            }
            else{
                borrow =0;
            }
            ans[k] = diff;
            i--;
            j--;
            k--;
        }
        i = 0;
        while (ans[i]==0) {
            i++;
        }

        while (i < ans.length) {
            System.out.println(ans[i]);
            i++;
        }
        sc.close();
    }
}
