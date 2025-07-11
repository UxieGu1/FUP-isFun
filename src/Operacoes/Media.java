/**
 * Questão: @media: Média de dois inteiros
 *
 * @author UxieGu1
 */
package Operacoes;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        float media = (n1 + n2) / 2.0f;

        System.out.printf("%.1f%n", media);
        scanner.close();
    }
}
