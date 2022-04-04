import java.util.Scanner;

public class BottomToTop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j]  = sc.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = n-1; i >=0; i--) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
