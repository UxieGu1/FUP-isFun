/**
 * Questão: @vet_iii: impressão formatada
 *
 * @author UxieGu1
 */
package Vetores_I;
import java.util.Scanner;

public class Vet_III {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] vetor = new int[n];

        for(int i = 0; i < n; i++){
            vetor[i] = scan.nextInt();
        }

        System.out.print("[");
        for(int i = 0; i < n; i++){
            if(i > 0) {
                System.out.print(", ");
            }
            System.out.print(vetor[i]);
        }
        System.out.println("]");
        scan.close();
    }
}
