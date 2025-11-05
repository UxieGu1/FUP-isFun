/**
 * Questão: @invertendo: invertendo vetor
 *
 * @author UxieGu1
 */

import java.util.Scanner;

public class invertendo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            vetor[i] += x;
        }

        System.out.print("[ ");
        for (int j = vetor.length - 1; j >= 0 ; j--) {
            System.out.printf("%d ", vetor[j]);
        }
        System.out.println("]");
    }
}
