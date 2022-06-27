import java.util.Scanner;

public class StringDifferenceTwoCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        System.out.println(differenceTwoCharofString(str));

        scn.close();
    }

    public static String differenceTwoCharofString(String str) {
        
        StringBuilder sb = new StringBuilder(str);

        for (int i = 1; i < str.length(); i++) {
            
            char last = sb.charAt(i);
            char first = sb.charAt(i-1);

            int res = last-first;
            sb.append(res);
            sb.append(last);
        }

        return sb.toString();
    }
}
