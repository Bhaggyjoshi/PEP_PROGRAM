import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nf = Fact(n);
        int rf = Fact(r);
        int nmrf = Fact(n-r);
        int ncr = nf/(nmrf*rf);

        System.out.print(ncr);
        sc.close();
    }
    public static int Fact(int x) {
        int xf = 1;
        for (int i = 1; i <=x ; i++) {
            xf *= i;
        }
        return xf;
    }
    

}
