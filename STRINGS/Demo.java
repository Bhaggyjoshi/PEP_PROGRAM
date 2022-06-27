import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // System.out.println(str);

        // read string after an
        String strn = sc.nextLine();
        System.out.println(strn);

        // fing the length of string
        int l = strn.length();
        System.out.println(l);

        // read the string character
        char ch = strn.charAt(4);
        System.out.println(ch);

        // read sub string of string 
        String s1 = strn.substring(1,4);
        System.out.println(s1);

        


        // StingBuilder

        // StringBuilder sb = new StringBuilder("hello");

        // sb.charAt(index);
        // sb.deleteCharAt(index);
        // sb.append(s);
        // sb.delete(start, end);
        // sb.replace(start, end, str);
        // sb.reverse();
        // sb.setCharAt(index, ch);
        // sb.toString();

        sc.close();
    }
}