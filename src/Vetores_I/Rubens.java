/**
 * Questão: @dieta: Rubens comendo no Brolio
 *
 * @author UxieGu1
 */
package Vetores_I;

import java.util.Scanner;

public class Rubens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Versão feita com laço de repetição:

        int n = scan.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            soma += x;
        }
        System.out.printf("%.1f\n", (float)(soma / n));
        */

        //Versão de acordo com vetores:
        int n = scan.nextInt();

        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            vetor[i] = x;
        }

        float media = 0F;
        for (int j = 0; j < vetor.length; j++) {
            media += (vetor[j]);
        }
        System.out.printf("%.1f", (media / n));

    }
}
