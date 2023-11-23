import java.util.Scanner;

public class PalindromNumber {
    //no return type without argument
    /*
     * static void palindromNumber(int n){
        int temp=n;
        int sum=0;;
        while (n>0) {
            int rev=n%10;
            sum=sum*10+rev;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("number is palindrom");
        }
        else{
            System.out.println("number is not palidrom");
        }
    }
     */
    // return type without argument
   /*
    *  static int  palindromNumber(int n){
        int temp=n;
        int sum=0;;
        while (n>0) {
            int rev=n%10;
            sum=sum*10+rev;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("number is palindrom");
        }
        else{
            System.out.println("number is not palidrom");
        }
        return n;
    }
    */
     public void  palindromNumber(int n){
        
        int temp=n;
        int sum=0;;
        while (n>0) {
            int rev=n%10;
            sum=sum*10+rev;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("number is palindrom");
        }
        else{
            System.out.println("number is not palidrom");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        PalindromNumber palindromNumber= new PalindromNumber();
        
        

    }

}