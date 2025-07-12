/**
 * Questão: @game10: Game10 - OBI 2017 - Fase 1 - Universitário
 *
 * @author UxieGu1
 */
package Selecao_II;

import java.util.Scanner;

public class Game10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int a = scan.nextInt();

        if(a == d){
            System.out.println(0);
        } else if (a < d ) {
            System.out.println(d-a);
        } else if(a > d) {
            System.out.println((n-a) + 1 + (d -1));
        }

    }
}
