import java.util.Scanner;

public class SaddlePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        saddlePrice(arr, n);
        sc.close();
    }

    public static void saddlePrice(int[][] arr ,  int n) {
        for (int i = 0; i < n; i++) {
            int min = arr[i][0];
            int colno= 0;

            for (int j = 0; j < n; j++) {
                if(min>arr[i][j]){
                    min = arr[i][j];
                    colno = j;
                }
            }

            // verification
            boolean vc = true;
            for(int row = 0; row<n; row++){
                if(min<arr[row][colno]){
                    vc = false;
                    break;
                }
            }

            if (vc == true) {
                System.out.println(min);
                return;
            }
           
        }

        
        System.out.println("Invalid input");
       
    }
}
