import java.util.Scanner;

public class StringBubbleSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] str = new String[n];
        String temp;
        for (int i = 0; i < str.length; i++) {
            str[i] = scn.next();
        }

        for (int i = 0; i < str.length; i++) {
            int flag = 0;
            for (int j = 0; j < str.length-1-i; j++) {
                    if(str[j].compareTo(str[j+1])>0){
                        temp = str[j];
                        str[j] = str[j+1];
                        str[j+1] = temp;
                        flag =1;
                    }
            }
            if(flag==0){
                break;
            }

        }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }
}
