import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            
        }
        int data = sc.nextInt();

        searchInArray(arr,n, data);
        sc.close();
    }

    public static void searchInArray(int[][] arr, int n, int data) {
        int  i = arr.length-1;
        int j = 0;

        while (i >= 0 && j < arr[0].length ) {
            if(arr[i][j] == data){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(arr[i][j]< data){
                j++;
            }else{
                i--;
            }
            
        }
        System.out.println("Not Found");
    }
}
