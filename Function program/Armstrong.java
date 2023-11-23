import java.util.Scanner;

import org.xml.sax.SAXException;

public class Armstrong {
    static int armstorng(int n){
        int sum=0; 
        int count=0;
        while (n>0) {
            int rem= n%10;
            count= count*10+rem*rem*rem;
            n=n/10;
            count++;
            
        }
        if(count==n)
        System.out.println("armstrong: ");
        else
        System.out.println("not armstrong");
        return n;
    }
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        int n= sc.nextInt();
        armstorng(n);
        
    }
    
}
