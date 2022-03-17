import java.util.Scanner;

/**
 * BarChart
 */
public class BarChart {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int[] arr = new int[n];

       for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
       }
       int max = arr[0];
       for (int i = 0; i < arr.length; i++) {
           if(arr[i] > max){
               max = arr[i];

           }
       }

       for (int j =max ;j >=1; j--) {
           for (int i = 0; i < arr.length; i++) {
                if(arr[i] >= j){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
           }
           System.out.println();
       }

       sc.close();
    }
}