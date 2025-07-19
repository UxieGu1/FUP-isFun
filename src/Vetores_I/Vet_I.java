/**
 * Questão: @vet_i: Carregando vetor em várias linhas
 *
 * @author UxieGu1
 */

package Vetores_I;
import java.util.Scanner;

public class Vet_I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] vetor = new int[n];

        for(int i = 0; i < n; i++){
            vetor[i] = scan.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.println(vetor[i]);
        }

    }
}
