import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        ArrayList<Integer> al = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
           al.add(scn.nextInt());
        }

        // findPrime(al)
        removePrime(al);
        System.out.println(al);
        scn.close();
    }

    public static boolean isPrime(int n) {

        for(int div = 2; div*div <= n ; div++){
            if(n % div != 0){
                return true;
            }
        }
        return false;
    }

    public static void removePrime(ArrayList<Integer> al) {
        for (int i = 0; i < al.size(); i++) {
            if(isPrime(al.get(i))==true){
                al.remove(i);
            }
        }
    }

}