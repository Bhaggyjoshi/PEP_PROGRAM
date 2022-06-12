import java.util.Scanner;

public class RotateRing {
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
        int s = sc.nextInt();
        int r = sc.nextInt();

        shellRotate(mat,s, r);
        display(mat);
        sc.close();
    }

    public static void shellRotate(int[][]arr, int s, int r){

        int[] la = fill1DFrom2D(arr,s);
        rotate1D(la, r);
        fill2DFrom1D(arr, s, la);
    }

    public static int[] fill1DFrom2D(int[][] arr, int s){
        int rmin = s-1;
        int rmax = arr.length-s;
        int cmin = s-1;
        int cmax = arr[0].length-s;

        int sz  = 2*(rmax-rmin) + 2*(cmax-cmin);
        int[] la = new int[sz];
        int idx = 0;


        // left boundary

        for(int row = rmin; row<=rmax;row++){
            la[idx] = arr[row][cmin];
            idx++;
        }
        cmin++;
        // bottom boundary
        for(int col = cmin; col<=cmax; col++){
           la[idx] = arr[rmax][col];
           idx++;
        }
        rmax--;
        // right boundary
        for(int row = rmax; row>=rmin;row--){
            la[idx] = arr[row][cmax];
            idx++;
        }
        cmax--;
        // top boundary
        for(int col = cmax; col>=cmin;col--){
            la[idx] = arr[rmin][col];
            idx++;
        }
      
        return la;
    }

    public static void rotate1D(int[] la , int r){
        r = r% la.length;
        if(r<0){
            r+= la.length;
        }
        reverse(la, 0, la.length);
        reverse(la, 0, r-1);
        reverse(la, r, la.length);
    }

    public static void reverse(int[] arr, int left, int right){
        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp; 
        }
    }

    public static void fill2DFrom1D(int[][] arr, int s, int[] la){
        int rmin = s-1;
        int rmax = arr.length-s;
        int cmin = s-1;
        int cmax = arr[0].length-s;

        int idx = 0;


        // left boundary

        for(int row = rmin; row<=rmax;row++){
           arr[row][cmin] = la[idx] ;
            idx++;
        }
        cmin++;
        // bottom boundary
        for(int col = cmin; col<=cmax; col++){
           arr[rmax][col] =  la[idx] ;
           idx++;
        }
        rmax--;
        // right boundary
        for(int row = rmax; row>=rmin;row--){
          arr[row][cmax] =  la[idx];
            idx++;
        }
        cmax--;
        // top boundary
        for(int col = cmax; col>=cmin;col--){
             arr[rmin][col] =  la[idx] ;
            idx++;
        }
      
    
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
