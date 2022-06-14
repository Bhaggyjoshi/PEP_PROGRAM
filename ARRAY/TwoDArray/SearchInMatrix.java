import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int data = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j]==data) {
                    System.out.println(i+ " "+j);
                    return;
                }
                
            }

        }
        
            System.out.println("Not Found");
        

        sc.close();
    }
}
