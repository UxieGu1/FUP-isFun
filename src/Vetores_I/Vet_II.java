/**
 * Questão: @vet_ii: Carregando vetor na mesma linha
 *
 * @author UxieGu1
 */
package Vetores_I;
import java.util.Scanner;

class Vet_II {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] vetor = new int[n];

        for(int i = 0; i < n; i++){
            vetor[i] = scan.nextInt();
        }

        System.out.print("[ ");
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", vetor[i]);
        }
        System.out.println("]");

    }
}
