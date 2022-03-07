import java.util.Scanner;

public class IsANumberPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int count=0;
        
        for (int i = 0; i < test; i++) {
            int num = sc.nextInt();
            
            for(int div=2;div*div<=num;div++){
                if(num%div==0){
                    count++;
                    break;
                }
                else{
                    count=0;
                }
            }
            if(count>0){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
            
        }
        sc.close();
        
    }
}