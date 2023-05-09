import java.util.Scanner;

public class HeapSort {

    void heapify(int[] arr, int n , int i){
        int largest = i;
        int li = 2*i+1;
        int ri = 2*i+2;

        if(li<n && arr[li]>arr[largest]){
            largest = li;
        }
        if(ri<n && arr[ri]>arr[largest]){
            largest = ri;
        }
        if(largest!=i){
            int temp = arr[i];
            arr[i] =arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }

    }

    void sort(int[] arr){
        int len = arr.length;

        for(int i = len/2-1;i>=0;i--){
            heapify(arr, len, i);
        }

        // swap the elemnts & heapify

        for(int i = len-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        HeapSort hs = new HeapSort();
        hs.sort(arr);
        hs.printArray(arr);
        scn.close();
    }
}
