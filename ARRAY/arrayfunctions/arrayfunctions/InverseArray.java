package arrayfunctions;
import java.util.Scanner;

/**
 * InverseArray
 */
public class InverseArray {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Inverse(arr);

    }
    private static void Inverse(int[] a) {
        
        int[] inv = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int pos = a[i];
            inv[pos] = i;
        }
        
        for (int i = 0; i < inv.length; i++) {
            System.out.println(inv[i]);
        }
    }
}