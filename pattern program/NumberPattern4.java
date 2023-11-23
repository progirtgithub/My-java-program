public class NumberPattern4 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=2*(4-i); j>=0; j--){
                System.out.print(" ");
            }
            for(int  j=1; j<=i; j++){
                System.out.print(i+" ");
            }
         System.out.println();  
        }
    }
    
}
