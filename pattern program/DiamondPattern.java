import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=n-i; j>=1; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*n+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
