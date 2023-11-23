import java.util.Scanner;

public class PrimeNumberGivenRange {
    static void primeNumber(int arr[] , int a, int b){
        for(int i=a; i<b; i++){
            if(i==1|| i==0)
            continue;
             int flag=1;
             for(int j=2; j<=i/2; ++j){
                if(i%j==0){
                    flag=0;
                     break;
                }
             }
             if(flag==1)
             System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting range");
        int a= sc.nextInt();
        System.out.println("enter the last range");
        int b= sc.nextInt();
        System.out.println(" prime number");
        primeNumber(null, a, b);
        
    }
    
}
