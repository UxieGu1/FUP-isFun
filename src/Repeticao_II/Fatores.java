/**
 * Questão: @fatores: Fatoração de um número
 *
 * @author UxieGu1
 */
package Repeticao_II;

import java.util.Scanner;

public class Fatores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23};

        for (int i = 0; i < primos.length; i++) {
            int primo = primos[i];
            int qtdPrimos = 0;

            while (n % primo == 0) {
                qtdPrimos++;
                n = n / primo;
            }

            if (qtdPrimos > 0) {
                System.out.printf("%d %d\n", primo, qtdPrimos);
            }

            if (n == 1) {
                break;
            }
        }
        scan.close();
    }
}
