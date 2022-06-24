import java.util.Scanner;

public class pallindromicSubString {
    
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

}

// Optimization  considering every character in string as middle element

/*public class InnerpallindromicSubString {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         String str = sc.nextLine();

         int ans = str.length();

         for (int i = 0; i < str.length(); i++) {
            
            int left = i-1;
            int right = i+1;

            while (left >=0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                ans+=1;
                left--;
                right++;
            }

            left = i;
            right = i+1;

            while (left >=0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                ans+=1;
                left--;
                right++;
            }
         }

         System.out.println(ans);
    }
    
}
*/