import java.util.Scanner;

public class MatrixMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int[][] mat1 = new int[n1][m1];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int[][] mat2 = new int[n2][m2];

        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        
        if(m1 !=0){
            System.out.println("Invalid Input");
        }
        else{
            int[][] ans = new int[n1][m2];
            for (int i = 0; i < n1; i++) {
                int res = 0;
                for (int j = 0; j < m2; j++) {
                    for (int k = 0; k <m1 ; k++) {
                        res += mat1[i][k]+mat2[k][j];

                    }
                    ans[i][j] = res;    
                }
            }

            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[0].length; j++) {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
        }

        sc.close();
         
    }
}
