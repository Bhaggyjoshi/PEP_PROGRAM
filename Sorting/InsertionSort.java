import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int[] arr = new int[n];
        int temp =0;

        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();

        }
        for(int i=1;i<arr.length;i++){
            temp = arr[i];
            int j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        scn.close();
    }
}
