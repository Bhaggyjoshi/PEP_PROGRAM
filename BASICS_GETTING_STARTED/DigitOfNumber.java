
import java.util.Scanner;

public class DigitOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t= n;
        int count=0;
        // count the no fo digits
        while (t!=0) {
            t/=10;
            count++;
        }
        // set the divisor
        int div = (int)Math.pow(10, count-1);
        while (div > 0) {
           int q = n/div;
           int r = n%div;
           System.out.println(q);
           n=r;
           div/=10;
        }
        sc.close();
    }
}