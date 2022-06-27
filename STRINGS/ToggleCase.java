import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //  StringBuilder sb = new StringBuilder();

        String str = scn.nextLine();
        System.out.println(toggleCase(str));
        scn.close();
    }

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch>='A' && ch<='Z') {

                char lc = (char)(ch-'A'+'a');
                sb.setCharAt(i, lc);

            }

            else if (ch>='a' && ch<='z') {
                char uc = (char)(ch-'a'+'A');

                sb.setCharAt(i, uc);
            }
        }

        return sb.toString();
    }
}
