import java.util.Scanner;

public class SumOfArray{
    static int sumofArray(int[] arr , int n){
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum=sum+arr[i];
        }
        double ave= sum/arr.length;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int [] ans= new int[n];
        System.out.println("enter the "+ n+ "  element");
        for(int i=0; i<n; i++){
            ans[i]= sc.nextInt();
        }
        System.out.println("input array");
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]+" ");

        }
        sumofArray(ans, n);
    }
}