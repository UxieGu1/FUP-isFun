/**
 * Questão: @impar: Ímpar ou par - OBI 2016 - F1P1
 *
 * @author UxieGu1
 */
package Selecao_II;
import java.util.Scanner;

public class Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int p = scan.nextInt();
        int d1 = scan.nextInt();
        int d2 = scan.nextInt();

        int soma = d1 + d2;

        if ((soma % 2 == 0 && p == 0) || (soma % 2 != 0 && p == 1)) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

        scan.close();
    }
}
