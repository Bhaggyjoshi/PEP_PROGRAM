import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array 1
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        // array2
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int n = Math.max(n1, n2);
        int[] ans = new int[n] ;

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = ans.length-1;
        int carray = 0;
        while (k>=0) {
            int sum = carray;
            if(i>=0){
                sum += arr1[i];
            }
            if(j>=0){
                sum += arr2[j];
            }
            int q= sum/10;
            int r = sum%10;
            ans[k] = r;
            carray=q;
            i--;
            j--;
            k--;
        }
        for (int l = 0; l < ans.length; l++) {
            if(l == 0 && ans[l] == 0){

            }else{
                System.out.println(ans[l]);
            }

        }
        
    }
}
