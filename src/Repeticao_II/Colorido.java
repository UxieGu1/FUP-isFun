/**
 * Questão: @colorido: Paulo Victor e seu sapato colorido
 *
 * @author UxieGu1
 */
package Repeticao_II;

import java.util.Scanner;

public class Colorido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        char pe = scan.next().charAt(0);

        System.out.print("[ ");
        for (int i = 0; i <= 10; i++) {
            if (i == n) {
                continue;
            }

            if (i == 10) {
                if (n != 10) {
                    System.out.print("ceu ");
                }
                break;
            }

            System.out.printf("%d%c ", i, pe);
            pe = (pe == 'd') ? 'e' : 'd';
        }
        System.out.println("]");
        scan.close();
    }
}