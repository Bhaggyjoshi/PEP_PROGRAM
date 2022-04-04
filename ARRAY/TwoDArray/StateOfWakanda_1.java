import java.util.Scanner;

public class StateOfWakanda_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat[0].length; i++) {
            if(i%2 == 0){
                for (int j = 0; j < mat.length; j++) {
                    System.out.println(mat[i][j]);
                }
            }
            else{
                for (int j = mat.length - 1; j >= 0; j--)
                    System.out.println(mat[i][j]);
                }
            }
            sc.close();
        }
}

