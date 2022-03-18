import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
       sc.close();
    }
}
