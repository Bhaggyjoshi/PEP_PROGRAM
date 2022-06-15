import java.util.Scanner;

public class pallindromicSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int si = 0; si < str.length(); si++) {
            for (int ei = si; ei < str.length(); ei++) {
                if (isPallindrom(str,si,ei) == true) {
                    System.out.println(str.substring(si, ei+1));
                }
                
            }
        }
        sc.close();
    }

    public static boolean isPallindrom(String str, int left, int right) {
       
            while (left<right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                    
                }  
                left++;
                right--; 
            }
            return true;
    }
}
