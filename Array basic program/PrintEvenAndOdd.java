import java.util.Scanner;

public class PrintEvenAndOdd {
    static void printEvenOdd(int [] arr, int n){
        int sum=0;
        for(int i=0; i<n; i++){
           
            if( arr[i]%2==0)
            System.out.println(arr[i]);
            else
            sum=sum+arr[i];
        }
        System.out.println("sum of odd number" + sum);
       
        
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = sc.nextInt();
        int[] ans= new int[n];
        System.out.println("enter" +n+ " ");
        for(int i=0; i<ans.length; i++){
            ans[i]=sc.nextInt();
        }
        printEvenOdd(ans, n);

        
    }

}
