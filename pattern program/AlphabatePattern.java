public class AlphabatePattern {
    public static void main(String[] args) {
        int Alphabate=65;
        for(int i=0; i<=5;i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)(Alphabate+j)+" ");
            }
            System.out.println();
        }
    }
    
}
