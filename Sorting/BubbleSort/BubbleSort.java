import java.util.Scanner;

/**
 * BubbleSort
 */
public class BubbleSort {

    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr= new int[n];
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();

        }
        for(int i = 0;i<arr.length;i++){
            int flag = 0;
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag=1;
                }
            }

            if(flag == 0){
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
     
        
    }
}