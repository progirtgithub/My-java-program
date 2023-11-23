import java.util.Scanner;

public class MaxAndMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter "+ n+ "elemnt");
        for(int i= 0; i<arr.length; i++){
            arr[i]= sc.nextInt();

        }
        int max=arr[0];
        int min=arr[0];
        int max2= arr[0];
        for(int i=1; i<n; i++){
            if(min >arr[i])
            min=arr[i];
            
            if(max<arr[i])
            max=arr[i];
            if(arr[i]>  max2&& max>max2)
            max2=arr[i];
        }
        System.out.println("minimum element " +min);
        System.out.println("maximum element is " + max);
        System.out.println("second max " + max2);
    }
    
}
