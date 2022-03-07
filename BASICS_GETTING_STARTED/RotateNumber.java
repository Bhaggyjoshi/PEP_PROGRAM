import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nod = 0;
        int num = n;
        while(num!=0){
            num/=10;
            nod++;
        }
        k = k % nod;
        if (k<0) {
            k+=nod;
        }

        int div = (int)Math.pow(10, k);
        int q= n/div;
        int r = n% div;
        int mult = (int)Math.pow(10, nod-k);
        int ans = r*mult+q;
        System.out.print(ans);

        sc.close();

    }
    
}
