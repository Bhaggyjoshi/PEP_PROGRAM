import java.util.Scanner;

public class PallindromicNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int temp, sum=0;
        temp = num;

       while (num>0) {
        int r = num%10;
         sum = (sum*10)+r;
        num /=10;
       }

       if(temp ==sum ){
        System.out.println("Pallindrom");
       }else{
        System.out.println("Not Pallindrom");
       }
        
        scn.close();
    }
}
