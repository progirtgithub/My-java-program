import java.util.Scanner;

public class FindArrayLength {
    static void findArraylength(int[] arr, int n){
        int num= arr.length;
        int i;

            // System.out.println(arr.length);
            for( i=0; i<num; i++);
                System.out.println(i);
            
        
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int n= sc. nextInt();
        int[] arr= new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        findArraylength(arr , n);

    }
    
}
