import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(compression1(str));
        System.out.println(compression2(str));

        scn.close();
    }


    public static String compression1(String str) {

        String ans = "";
        ans+= str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ans.charAt(ans.length()-1) != ch){
                ans += ch;
            }
        }
       
        return ans;
    }


    public static String  compression2(String str) {
        String ans = "";
        ans+= str.charAt(0);
        int count =1;


        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ans.charAt(ans.length()-1) == ch){
                count++;
            }else{
                if(count > 1){
                    ans += count;
                }
                ans += ch;
                count = 1;
            }
        }

        if(count > 1){
            ans += count;
        }
        return ans;


        
    }
}
