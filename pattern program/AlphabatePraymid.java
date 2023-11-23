public class AlphabatePraymid {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            int k=65;
            for(int j=1; j<=7; j++){
                if(j>=4-i && j<=3+i){
                    if(j<=4)
                    k++;
                    else
                    k--;
                    System.out.print((char)(k)+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
