import java.util.Scanner;

/**
 * FindElementInArray
 */
public class FindElementInArray {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    int num = sc.nextInt();
    for (int i = 0; i < arr.length; i++) {
        if (num == arr[i]) {
            System.out.println(i);
            return;
        }

    }
    System.out.print(-1);
    
    }
}