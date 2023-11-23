public class NumberPatter5 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=2*(4-i); j>=1; j--){
                System.out.print(" ");
            }
            for(int  j=1; j<=i; j++){
                System.out.print(j+" ");
            }
         System.out.println();  
        }
    }
    
}
