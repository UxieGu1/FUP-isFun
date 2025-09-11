/**
 * Questão: @revolta: - Revolta em Portugal
 *
 * @author UxieGu1
 */
package Vetores_II;

import java.util.Scanner;

public class Revolta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = scan.nextInt();
        }

        int somaPares = 0;
        int somaImpares = 0;

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] % 2 == 0) {
                somaPares += vetor[j];
            } else {
                somaImpares += vetor[j];
            }
        }

        if (somaPares > somaImpares) {
            System.out.println("rebeldes");
        } else if (somaImpares > somaPares) {
            System.out.println("soldados");
        } else {
            System.out.println("empate");
        }
    }
}
