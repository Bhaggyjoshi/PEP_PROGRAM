import java.util.Scanner;

/**
 * PythagoranTriplet
 */
public class PythagoranTriplet {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if(a*a + b*b == c*c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        scn.close();
    }
}