import java.util.ArrayList;
import java.util.Scanner;

/**
 * DemoArrayList
 */
public class DemoArrayList {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);

        for (int i = 0; i < al.size(); i++) {
            al.add(scn.nextInt());
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        scn.close();
    }

    
    
}