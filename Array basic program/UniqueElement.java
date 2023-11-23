import java.util.Scanner;

public class UniqueElement {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n= sc.nextInt();
        int i,j,count;
       int [] arr= new int[n];
       int [] temp= new int[n];

       for(i=0;i<n;i++){temp[i]=-1;}
        System.out.println(temp[i]);
       System.out.println("enter array element");
       for( i=0; i<arr.length; i++){
        arr[i]= sc.nextInt();
       }
       for( i=0; i<arr.length; i++){
        count= 1;
        for(j=i+1; j<arr.length; j++){
            if(arr[i]==arr[j])
            count++;
            temp[i]=0;
        }
        if(temp[i]!=0)
        temp[i]=count;
       }
       for( i=0; i<arr.length; i++){
        if(temp[i]==1)
        System.out.println(arr[i]);
       }

    }
    
}
