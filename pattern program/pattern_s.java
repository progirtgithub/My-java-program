import java.util.Scanner;

public class pattern_s {
    /**
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            int k = 0;
            for (int j = 1; j <= 9; j++) {
                if (j >= 6 - i && j <= 4 + i) {
                    if (j <= 5)
                        k++;
                    else
                        k--;
                    System.out.print(k);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}