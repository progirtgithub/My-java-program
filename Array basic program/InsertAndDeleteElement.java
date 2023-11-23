import java.util.Scanner;

public class InsertAndDeleteElement {
    static void insertAnddelet(int[] arr, int n){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE: ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter" +n+ " ");
        for(int i=0; i<arr.length;  i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("input array: ");
        insertAnddelet(arr, n);

    }
    
}
