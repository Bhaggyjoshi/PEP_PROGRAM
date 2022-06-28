import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str  = scn.nextLine();
        System.out.println(permutationString(str));
        scn.close();
    }

    public static String permutationString(String str) {
        int len = str.length();
        int total = factorial(len);

        for (int number = 0; number < total; number++) {
        StringBuilder sb = new StringBuilder(str);
        int temp = number;

        for (int divisor = len; divisor >= 1; divisor--) {
            int q = temp / divisor;
            int r = temp % divisor;

            System.out.print(sb.charAt(r));
            sb.deleteCharAt(r);
            temp = q;
        }
        System.out.println();
        return sb.toString();
        }
    }

  
   

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
          fact *= i;
        }
        return fact;
      }
}
