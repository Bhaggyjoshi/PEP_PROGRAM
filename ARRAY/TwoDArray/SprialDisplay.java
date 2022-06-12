import java.util.Scanner;

public class SprialDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int rmin= 0;
        int rmax = matrix.length-1;
        int cmin = 0;
        int cmax = matrix[0].length-1;
        int tne = matrix.length * matrix[0].length;
        int count = 0;


        while (count <tne) {

            // for left boundary
            for (int row = rmin; row <= rmax && count < tne; row++) {
                System.out.println(matrix[row][cmin]);
                count++;
            }
            cmin++;
            //for bottom boundary
            for(int col = cmin; col<= cmax && count < tne; col++){
                System.out.println(matrix[rmax][col]);
                count++;
            }
            rmax--;
            // for  right boundary
            for(int row = rmax; row>=rmin && count < tne;row--){
                System.out.println(matrix[row][cmax]);
                count++;
            }
            cmax--;

            for (int col = cmax; col>=cmin && count < tne; col--) {
                System.out.println(matrix[rmin][col]);
                count++;
            }
            rmin++;
        }

        sc.close();
    }
}
