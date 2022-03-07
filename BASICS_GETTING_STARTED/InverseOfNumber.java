import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
       for(int i =1;i<=n;i++){
           int q=n/10;
           int r = n%10;
           int temp = (int)Math.pow(10, r-1);
           n=q;
           sum = sum+i*temp;
       }
       System.out.println(sum);
       sc.close();
    }
}
