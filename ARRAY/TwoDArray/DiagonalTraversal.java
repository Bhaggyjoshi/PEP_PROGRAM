import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
         int[][] arr = new int[n][n];
         for (int i= 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j] = sc.nextInt();
            }
         }
         diagonalTraverse(arr, n);
         sc.close();
    }

    public static void diagonalTraverse(int[][] arr, int n) {
        for (int gap = 0; gap < n; gap++) {
            for (int i = 0, j = gap; j < n; i++,j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

}
