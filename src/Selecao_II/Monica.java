/**
 * Questão: @monica: A idade do filho mais velho - OBI 2019 - F1PJ
 *
 * @author UxieGu1
 */

package Selecao_II;

import java.util.Scanner;
public class Monica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = m - (a + b);

        if(a > b && a > c) System.out.println(a);
        else if(b > a && b > c) System.out.println(b);
        else System.out.println(c);

    }
}
